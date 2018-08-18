package example.loo.com.latte.ec.main.personal.order;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import example.loo.com.latte.delegates.LatteDelegate;
import example.loo.com.latte.ec.R;
import example.loo.com.latte.ui.widget.AutoPhotoLayout;
import example.loo.com.latte.ui.widget.StarLayout;
import example.loo.com.latte.util.callback.CallbackManager;
import example.loo.com.latte.util.callback.CallbackType;
import example.loo.com.latte.util.callback.IGlobeCallback;

/**
 * Created by jingluyuan on 8/12/18.
 */

public class OrderCommentDelegate extends LatteDelegate{


    StarLayout mStarLayout = null;
    AutoPhotoLayout mAutoPhotoLayout ;


    @Override
    public Object setLayout() {
        return R.layout.delegate_order_comment;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, @NonNull View rootView) {
        mStarLayout = $(R.id.custom_star_layout);
        mAutoPhotoLayout = $(R.id.top_tv_comment_submit);
        $(R.id.top_tv_comment_submit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"评分: "+mStarLayout.getStarCount(),Toast.LENGTH_SHORT).show();
            }
        });

        mAutoPhotoLayout.setDelegate(this);
        CallbackManager.getInstance()
                .addCallback(CallbackType.ON_CROP, new IGlobeCallback<Uri>() {
                    @Override
                    public void executeCallback(@Nullable Uri args) {
                        mAutoPhotoLayout.onCropTarget(args);
                    }
                });
    }
}
