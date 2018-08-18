package example.loo.com.fastec;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import example.loo.com.latte.delegates.LatteDelegate;
import example.loo.com.latte.net.RestClient;
import example.loo.com.latte.net.callback.IError;
import example.loo.com.latte.net.callback.IFailure;
import example.loo.com.latte.net.callback.ISuccess;

/**
 * Created by jingluyuan on 7/29/18.
 */

public class ExampleDelegate extends LatteDelegate {
    @Override
    public Object setLayout() {
        return R.layout.delegate_example;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {
       // testRestClient();
    }

    private void testRestClient() {
        RestClient.builder()
                .url("http://oxjde2kpq.bkt.clouddn.com/index_data.json")
                .loader(getContext())
                .success(new ISuccess() {
                    @Override
                    public void onSuccess(String response) {
                       Toast.makeText(getContext(), response, Toast.LENGTH_LONG).show();

                    }
                })
                .failure(new IFailure() {
                    @Override
                    public void onFailure() {

                    }
                })
                .error(new IError() {
                    @Override
                    public void onError(int code, String msg) {

                    }
                })
                .build()
                .get();

    }
}
