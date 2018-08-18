package example.loo.com.fastec;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.widget.Toast;

import example.loo.com.latte.activities.ProxyActivity;
import example.loo.com.latte.app.Latte;
import example.loo.com.latte.delegates.LatteDelegate;
import example.loo.com.latte.ec.launcher.LauncherDelegate;
import example.loo.com.latte.ec.main.EcBottomDelegate;
import example.loo.com.latte.ec.sign.ISignListener;
import example.loo.com.latte.ec.sign.SignInDelegate;
import example.loo.com.latte.ui.launcher.ILauncherListener;
import example.loo.com.latte.ui.launcher.OnLauncherFinishTag;
import qiu.niorgai.StatusBarCompat;


public class ExampleActivity extends ProxyActivity implements
        ISignListener,
        ILauncherListener{


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        Latte.getConfigurator().withActivity(this);
        StatusBarCompat.translucentStatusBar(this,true);
    }

    @Override
    public LatteDelegate setRootDelegate() {
            return new LauncherDelegate();
    }


    @Override
    public void onSignInSuccess() {
        Toast.makeText(this,"登录成功",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSignUpSuccess() {
        Toast.makeText(this,"注册成功",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLauncherFinish(OnLauncherFinishTag tag) {
        switch (tag)
        {
            case SIGNED:
                //Toast.makeText(this,"启动结束，用户登录了",Toast.LENGTH_LONG).show();
                getSupportDelegate().startWithPop(new EcBottomDelegate());
                break;
            case NOT_SIGNED:
               // Toast.makeText(this,"启动结束，用户没登录",Toast.LENGTH_LONG).show();
                getSupportDelegate().startWithPop(new SignInDelegate());
                break;
            default:
                break;
        }
    }

    @Override
    public void post(Runnable runnable) {

    }
}
