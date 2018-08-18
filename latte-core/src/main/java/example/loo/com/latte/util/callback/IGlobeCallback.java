package example.loo.com.latte.util.callback;

import android.support.annotation.Nullable;

/**
 * Created by jingluyuan on 8/10/18.
 */

public interface IGlobeCallback<T> {

    void executeCallback(@Nullable T args);
}
