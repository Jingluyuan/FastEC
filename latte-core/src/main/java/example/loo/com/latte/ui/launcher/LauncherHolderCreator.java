package example.loo.com.latte.ui.launcher;

import android.view.View;

import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;
import com.bigkoo.convenientbanner.holder.Holder;

import example.loo.com.latte.R;


/**
 * Created by jingluyuan on 8/3/18.
 */

public class LauncherHolderCreator implements CBViewHolderCreator{


    @Override
    public Object createHolder() {
        return new LauncherHolder();
    }
}
