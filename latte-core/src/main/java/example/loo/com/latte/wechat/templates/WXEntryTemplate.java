package example.loo.com.latte.wechat.templates;

import example.loo.com.latte.activities.ProxyActivity;
import example.loo.com.latte.delegates.LatteDelegate;
import example.loo.com.latte.wechat.BaseWeChatActivity;
import example.loo.com.latte.wechat.LatteWeChat;

/**
 * Created by jingluyuan on 8/4/18.
 */

public class WXEntryTemplate extends BaseWeChatEntryActivity{

    @Override
    protected void onResume() {
        super.onResume();
        finish();
        overridePendingTransition(0,0);
    }

    @Override
    protected void onSignInSuccess(String userInfo) {
        LatteWeChat.getInstance().getSignInCallBack().onSignInSuccess(userInfo);
    }
}
