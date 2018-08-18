package example.loo.com.latte.delegates.web;

import android.support.v7.widget.AppCompatImageView;
import android.webkit.JavascriptInterface;

import com.alibaba.fastjson.JSON;

import example.loo.com.latte.delegates.web.event.Event;
import example.loo.com.latte.delegates.web.event.EventManager;

/**
 * Created by jingluyuan on 8/8/18.
 */

public class LatteWebInterface {
    private final WebDelegate DELEGATE;

    public LatteWebInterface(WebDelegate delegate) {
        this.DELEGATE = delegate;
    }

    static LatteWebInterface create(WebDelegate delegate) {
        return new LatteWebInterface(delegate);
    }

    @SuppressWarnings("unused")
    @JavascriptInterface
    public String event(String params)
    {
        final String action = JSON.parseObject(params).getString("action");
        final Event event = EventManager.getInstance().createEvent(action);
        if (event!=null)
        {
            event.setAction(action);
            event.setDelegate(DELEGATE);
            event.setContext(DELEGATE.getContext());
            event.setUrl(DELEGATE.getUrl());
            return event.execute(params);
        }
        return null;
    }
}
