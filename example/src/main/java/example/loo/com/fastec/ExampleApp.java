package example.loo.com.fastec;

import android.app.Application;
import android.support.annotation.Nullable;

import com.joanzapata.iconify.fonts.FontAwesomeModule;

import example.loo.com.latte.app.Latte;
import example.loo.com.latte.ec.database.DataBaseManager;
import example.loo.com.latte.ec.icon.FontEcModule;
import example.loo.com.latte.net.interceptors.DebugInterceptor;
import example.loo.com.latte.util.callback.CallbackManager;
import example.loo.com.latte.util.callback.CallbackType;
import example.loo.com.latte.util.callback.IGlobeCallback;

/**
 * Created by jingluyuan on 7/28/18.
 */

public class ExampleApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this)
                .withIcon(new FontAwesomeModule())
                .withIcon(new FontEcModule())
                .withApiHost("http://mock.fulingjie.com/mock/api/")
                .withInterceptor(new DebugInterceptor("test",R.raw.test))
                .withWeChatAppId("")
                .withWeChatAppSecret("")
                .withJavascriptInterface("latte")
               // .withWebEvent("test",new E)
                .configure();
        DataBaseManager.getInstance().init(this);

        //设置消息推送 如极光推送
        CallbackManager.getInstance()
                .addCallback(CallbackType.TAG_OPEN_PUSH, new IGlobeCallback() {
                    @Override
                    public void executeCallback(@Nullable Object args) {
                        //根据消息推送工具 开启消息推送设置
                    }
                })
                .addCallback(CallbackType.TAG_STOP_PUSH, new IGlobeCallback() {
                    @Override
                    public void executeCallback(@Nullable Object args) {
                        //根据消息推送工具 关闭消息推送设置
                    }
                });
    }
}
