package example.loo.com.latte.util.dimen;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Display;

import com.wang.avi.AVLoadingIndicatorView;

import example.loo.com.latte.app.Latte;

/**
 * Created by jingluyuan on 8/2/18.
 */

public class DimeUtil {

    public static int getScreenWidth() {
        final Resources resources = Latte.getApplicationContext().getResources();
        final DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return displayMetrics.widthPixels;
    }

    public static int getScreenHeight() {
        final Resources resources = Latte.getApplicationContext().getResources();
        final DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return displayMetrics.heightPixels;
    }
}
