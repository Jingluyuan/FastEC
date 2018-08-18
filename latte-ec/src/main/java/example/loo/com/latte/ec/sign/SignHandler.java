package example.loo.com.latte.ec.sign;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import example.loo.com.latte.app.AccountManager;
import example.loo.com.latte.ec.database.DataBaseManager;
import example.loo.com.latte.ec.database.UserProfile;

/**
 * Created by jingluyuan on 8/4/18.
 */

public class SignHandler {

    public static void onSignUp(String response, ISignListener signListener) {
      final JSONObject profilejson = JSON.parseObject(response).getJSONObject("data");
        final long userId = profilejson.getLong("userId");
        final String name = profilejson.getString("name");
        final String avatar = profilejson.getString("avatar");
        final String gender = profilejson.getString("gender");
        final String address = profilejson.getString("address");

        final UserProfile profile = new UserProfile(userId, name, avatar, gender, address);
        DataBaseManager.getInstance().getDao().insert(profile);

        AccountManager.setSignState(true);
        signListener.onSignUpSuccess();
    }

    public static void onSignIn(String response, ISignListener signListener) {
        final JSONObject profilejson = JSON.parseObject(response).getJSONObject("data");
        final long userId = profilejson.getLong("userId");
        final String name = profilejson.getString("name");
        final String avatar = profilejson.getString("avatar");
        final String gender = profilejson.getString("gender");
        final String address = profilejson.getString("address");

        final UserProfile profile = new UserProfile(userId, name, avatar, gender, address);
        DataBaseManager.getInstance().getDao().insert(profile);

        AccountManager.setSignState(true);
        signListener.onSignInSuccess();
    }
}
