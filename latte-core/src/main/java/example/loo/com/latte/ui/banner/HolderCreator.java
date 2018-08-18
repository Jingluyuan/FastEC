package example.loo.com.latte.ui.banner;

import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;

/**
 * Created by jingluyuan on 8/7/18.
 */

public class HolderCreator implements CBViewHolderCreator<BannerImageHolder>{
    @Override
    public BannerImageHolder createHolder() {
        return new BannerImageHolder();
    }
}
