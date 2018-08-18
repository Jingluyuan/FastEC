package example.loo.com.latte.delegates.bottom;

/**
 * Created by jingluyuan on 8/5/18.
 */

public final class BottomTabBean {
    private final CharSequence ICON;
    private final CharSequence TITLE;


    public BottomTabBean(CharSequence icon, CharSequence title) {
        ICON = icon;
        TITLE = title;
    }

    public CharSequence getIcon() {
        return ICON;
    }

    public CharSequence getTitle() {
        return TITLE;
    }
}
