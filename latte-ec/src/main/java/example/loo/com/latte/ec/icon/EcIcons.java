package example.loo.com.latte.ec.icon;

import com.joanzapata.iconify.Icon;

/**
 * Created by jingluyuan on 7/28/18.
 */

public enum  EcIcons implements Icon{
    icon_scan('\ue657'),
    icon_ali_pay('\ue806');

    private char character;
    EcIcons(char character)
    {
        this.character = character;
    }

    @Override
    public String key() {
        return name().replace('_', '-');
    }

    @Override
    public char character() {
        return character;
    }
}
