package example.loo.com.latte.ec.detail;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;

/**
 * Created by jingluyuan on 8/13/18.
 */

public class TabPagerAdapter extends FragmentStatePagerAdapter{

    private final ArrayList<String> TAB_TITLE = new ArrayList<>();
    private final ArrayList<ArrayList<String>> PICTURES = new ArrayList<>();

    public TabPagerAdapter(FragmentManager fm, JSONObject data) {
        super(fm);
        final JSONArray array = data.getJSONArray("tabs");
        final int size = array.size();
        for (int i=0;i<size;i++)
        {
            final JSONObject eachTab = array.getJSONObject(i);
            final String name = eachTab.getString("name");
            final JSONArray pictureUrls = eachTab.getJSONArray("pictures");
            final ArrayList<String> eachTabPicturesArray = new ArrayList<>();

            final int pictureSize = pictureUrls.size();
            for (int j=0;j<pictureSize;j++)
            {
                eachTabPicturesArray.add(pictureUrls.getString(j));
            }
            TAB_TITLE.add(name);
            PICTURES.add(eachTabPicturesArray);
        }
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0)
        {
            return ImageDelegate.create(PICTURES.get(0));
        }else
        {
            return ImageDelegate.create(PICTURES.get(1));
        }
    }

    @Override
    public int getCount() {
        return TAB_TITLE.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return TAB_TITLE.get(position);
    }
}
