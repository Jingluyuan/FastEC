package example.loo.com.latte.delegates.bottom;

import android.view.KeyEvent;
import android.view.View;
import android.widget.Toast;

import example.loo.com.latte.R;
import example.loo.com.latte.delegates.LatteDelegate;

/**
 * Created by jingluyuan on 8/5/18.
 */

public abstract class BottomItemDelegate extends LatteDelegate {

    private long TOUCH_TIME = 0;
    private static final int WAIT_TIME = 2000;

    @Override
    public boolean onBackPressedSupport() {
        if (System.currentTimeMillis() - TOUCH_TIME < WAIT_TIME) {
            _mActivity.finish();
        } else {
            TOUCH_TIME = System.currentTimeMillis();
            Toast.makeText(_mActivity, "双击退出" + "Latte", Toast.LENGTH_SHORT).show();
        }
        return true;
    }
}
