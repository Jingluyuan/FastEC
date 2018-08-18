package example.loo.com.latte.wechat;

import android.app.Activity;

import com.tencent.mm.opensdk.modelmsg.SendAuth;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;

import example.loo.com.latte.app.ConfigKeys;
import example.loo.com.latte.app.Latte;
import example.loo.com.latte.wechat.callbacks.IWeChatSignInCallBack;

/**
 * Created by jingluyuan on 8/4/18.
 */

public class LatteWeChat {

    public static final String APP_ID = (String) Latte.getConfiguration(ConfigKeys.WE_CHAT_APP_ID);
    public static final String APP_SECRET = (String) Latte.getConfiguration(ConfigKeys.WE_CHAT_APP_SECRET);
    private final IWXAPI WXAPI;
    private IWeChatSignInCallBack mSignInCallBack = null;

    private static final class Holder{
        private static final LatteWeChat INSTANCE = new LatteWeChat();
    }

    public static LatteWeChat getInstance()
    {
        return Holder.INSTANCE;
    }

    private LatteWeChat()
    {
        final Activity activity = Latte.getConfiguration(ConfigKeys.ACTIVITY);
        WXAPI = WXAPIFactory.createWXAPI(activity,APP_ID,true);
        WXAPI.registerApp(APP_ID);
    }

    public final IWXAPI getWXAPI()
    {
        return WXAPI;
    }
    public LatteWeChat onSignSuccess(IWeChatSignInCallBack iWeChatSignInCallBack)
    {
        this.mSignInCallBack = iWeChatSignInCallBack;
        return this;
    }

    public IWeChatSignInCallBack getSignInCallBack()
    {
        return mSignInCallBack;
    }

    public final void signIn()
    {
        final SendAuth.Req req = new SendAuth.Req();
        req.scope = "snsapi_userinfo";
        req.state = "random_state";
        WXAPI.sendReq(req);
    }


}
