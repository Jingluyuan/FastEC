package example.loo.com.latte.ui.banner;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.view.View;
import android.widget.ImageView;

import com.bigkoo.convenientbanner.holder.Holder;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

import example.loo.com.latte.R;

/**
 * Created by jingluyuan on 8/7/18.
 */

public class BannerImageHolder implements Holder<String> {

    private AppCompatImageView mImageView = null;


    @Override
    public View createView(Context context) {
        mImageView = new AppCompatImageView(context);
        return mImageView;
    }

    @Override
    public void UpdateUI(Context context, int position, String data) {
        RequestOptions image_options = new RequestOptions();
        image_options.diskCacheStrategy(DiskCacheStrategy.ALL)
                .dontAnimate()
                .centerCrop();

        Glide.with(context)
                .load(data)
                .apply(image_options)
                .into(mImageView);
    }
}
