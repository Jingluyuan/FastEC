package example.loo.com.latte.ec.main.sort;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import example.loo.com.latte.delegates.bottom.BottomItemDelegate;
import example.loo.com.latte.ec.R;
import example.loo.com.latte.ec.main.sort.content.ContentDelegate;
import example.loo.com.latte.ec.main.sort.list.VerticalListDelegate;


/**
 * Created by jingluyuan on 8/5/18.
 */

public class SortDelegate extends BottomItemDelegate{


    @Override
    public Object setLayout() {
        return R.layout.delegate_sort;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, @NonNull View rootView) {

    }

    @Override
    public void onLazyInitView(@Nullable Bundle savedInstanceState) {
        super.onLazyInitView(savedInstanceState);
        final VerticalListDelegate listDelegate = new VerticalListDelegate();
        getSupportDelegate().loadRootFragment(R.id.vertical_list_container,listDelegate);
        getSupportDelegate().loadRootFragment(R.id.sort_content_container, ContentDelegate.newInstance(1));

    }
}
