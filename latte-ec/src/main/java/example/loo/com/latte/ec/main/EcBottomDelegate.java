package example.loo.com.latte.ec.main;

import android.graphics.Color;

import java.util.LinkedHashMap;

import example.loo.com.latte.delegates.bottom.BaseBottomDelegate;
import example.loo.com.latte.delegates.bottom.BottomItemDelegate;
import example.loo.com.latte.delegates.bottom.BottomTabBean;
import example.loo.com.latte.delegates.bottom.ItemBuilder;
import example.loo.com.latte.ec.main.cart.ShopCartDelegate;
import example.loo.com.latte.ec.main.discover.DiscoverDelegate;
import example.loo.com.latte.ec.main.index.IndexDelegate;
import example.loo.com.latte.ec.main.personal.PersonalDelegate;
import example.loo.com.latte.ec.main.sort.SortDelegate;

/**
 * Created by jingluyuan on 8/5/18.
 */

public class EcBottomDelegate extends BaseBottomDelegate{

    @Override
    public LinkedHashMap<BottomTabBean, BottomItemDelegate> setItems(ItemBuilder builder) {
        final LinkedHashMap<BottomTabBean,BottomItemDelegate> items = new LinkedHashMap<>();
        items.put(new BottomTabBean("{fa-home}","主页"),new IndexDelegate());
        items.put(new BottomTabBean("{fa-sort}","分类"),new SortDelegate());
        items.put(new BottomTabBean("{fa-compass}","发现"),new DiscoverDelegate());
        items.put(new BottomTabBean("{fa-shopping-cart}","购物车"),new ShopCartDelegate());
        items.put(new BottomTabBean("{fa-user}","我的"),new PersonalDelegate());
        return builder.addItem(items).build();
    }

    @Override
    public int setIndexDelegate() {
        return 0;
    }

    @Override
    public int setClickColor() {
        return Color.parseColor("#ffff8800");
    }
}
