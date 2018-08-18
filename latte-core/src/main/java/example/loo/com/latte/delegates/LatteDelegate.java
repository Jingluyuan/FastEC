package example.loo.com.latte.delegates;

/**
 * Created by jingluyuan on 7/29/18.
 */

public abstract class LatteDelegate extends PermissionCheckerDelegate{

    @SuppressWarnings("unchecked")
    public <T extends LatteDelegate> T getParentDelegate()
    {
        return (T) getParentFragment();
    }
}
