package example.loo.com.latte.ui.recycler;

import com.choices.divider.Divider;
import com.choices.divider.DividerItemDecoration;

/**
 * Created by jingluyuan on 8/8/18.
 */

public class DividerLookUpImpl implements DividerItemDecoration.DividerLookup{

    private final int COLOR;
    private final int SIZE;

    public DividerLookUpImpl(int color, int size) {
        COLOR = color;
        SIZE = size;
    }


    @Override
    public Divider getVerticalDivider(int position) {
        return new Divider.Builder()
                .size(SIZE)
                .color(COLOR)
                .build();
    }

    @Override
    public Divider getHorizontalDivider(int position) {
        return new Divider.Builder()
                .size(SIZE)
                .color(COLOR)
                .build();
    }
}
