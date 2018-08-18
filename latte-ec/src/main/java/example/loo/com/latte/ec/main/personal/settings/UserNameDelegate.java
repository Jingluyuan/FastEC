package example.loo.com.latte.ec.main.personal.settings;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import example.loo.com.latte.delegates.LatteDelegate;
import example.loo.com.latte.ec.R;

/**
 * Created by jingluyuan on 8/10/18.
 */

public class UserNameDelegate extends LatteDelegate{


    @Override
    public Object setLayout() {
        return R.layout.delegate_name;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, @NonNull View rootView) {

    }
}
