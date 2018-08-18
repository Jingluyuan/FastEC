package example.loo.com.latte.delegates.web;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import example.loo.com.latte.delegates.IPageLoadListener;
import example.loo.com.latte.delegates.web.chromeclient.WebChromeClientImpl;
import example.loo.com.latte.delegates.web.client.WebViewClientImpl;
import example.loo.com.latte.delegates.web.route.RouteKeys;
import example.loo.com.latte.delegates.web.route.Router;

/**
 * Created by jingluyuan on 8/8/18.
 */

public class WebDelegateImpl extends WebDelegate{

    private IPageLoadListener mIPageLoadListener = null;


    public static WebDelegateImpl create(String url)
    {
        final Bundle args = new Bundle();
        args.putString(RouteKeys.URL.name(),url);
        final WebDelegateImpl delegate = new WebDelegateImpl();
        delegate.setArguments(args);
        return delegate;
    }

    public void setPageLoadListener(IPageLoadListener listener)
    {
        this.mIPageLoadListener = listener;
    }

    @Override
    public IWebViewInitializer setInitializer() {
        return this;
    }

    @Override
    public Object setLayout() {
        return getWebView();
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, @NonNull View rootView) {
        if (getUrl()!=null)
        {
            Router.getInstance().loadPage(this,getUrl());
        }
    }

    @Override
    public WebView initWebView(WebView webView) {
        return new WebViewInitializer().createWebView(webView);
    }

    @Override
    public WebViewClient initWebViewClient() {
        final WebViewClientImpl client = new WebViewClientImpl(this);
        client.setPageLoadListener(mIPageLoadListener);
        return client;
    }

    @Override
    public WebChromeClient initWebChromeClient() {
        return new WebChromeClientImpl();
    }
}
