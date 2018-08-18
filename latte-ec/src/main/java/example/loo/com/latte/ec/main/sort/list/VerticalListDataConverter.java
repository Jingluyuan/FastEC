package example.loo.com.latte.ec.main.sort.list;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;

import example.loo.com.latte.ui.recycler.DataConverter;
import example.loo.com.latte.ui.recycler.ItemType;
import example.loo.com.latte.ui.recycler.MultipleFields;
import example.loo.com.latte.ui.recycler.MultipleItemEntity;

/**
 * Created by jingluyuan on 8/8/18.
 */

public final class VerticalListDataConverter extends DataConverter{


    @Override
    public ArrayList<MultipleItemEntity> convert() {

        final ArrayList<MultipleItemEntity> dataList = new ArrayList<>();
        final JSONArray dataArray = JSON
                .parseObject(getJsonData())
                .getJSONObject("data")
                .getJSONArray("list");

        final int size = dataArray.size();
        for (int i=0;i<size;i++)
        {
            final JSONObject data = dataArray.getJSONObject(i);
            final int id = data.getInteger("id");
            final String name = data.getString("name");

            final MultipleItemEntity entity = MultipleItemEntity.builder()
                    .setField(MultipleFields.ITEM_TYPE, ItemType.VERTICAL_MENU_LIST)
                    .setField(MultipleFields.ID,id)
                    .setField(MultipleFields.TEXT,name)
                    .setField(MultipleFields.TAG,false)
                    .build();

            dataList.add(entity);

            dataList.get(0).setField(MultipleFields.TAG,true);
        }
        return dataList;
    }
}
