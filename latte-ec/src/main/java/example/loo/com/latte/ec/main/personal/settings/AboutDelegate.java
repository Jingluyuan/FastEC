package example.loo.com.latte.ec.main.personal.settings;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;

import com.alibaba.fastjson.JSON;

import example.loo.com.latte.delegates.LatteDelegate;
import example.loo.com.latte.ec.R;
import example.loo.com.latte.net.RestClient;
import example.loo.com.latte.net.callback.ISuccess;

/**
 * Created by jingluyuan on 8/12/18.
 */

public class AboutDelegate extends LatteDelegate{

    AppCompatTextView mTextView = null;

    @Override
    public Object setLayout() {
        return R.layout.delegate_about;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, @NonNull View rootView) {
        mTextView = $(R.id.tv_info);
        RestClient.builder()
                .url("about.php")
                .loader(getContext())
                .success(new ISuccess() {
                    @Override
                    public void onSuccess(String response) {
                        final String info = JSON.parseObject(response).getString("data");
                        mTextView.setText(info);
                    }
                })
                .build()
                .get();

    }
}
