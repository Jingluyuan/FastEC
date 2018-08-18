package example.loo.com.latte.ui.camera;

import android.net.Uri;

import example.loo.com.latte.delegates.PermissionCheckerDelegate;
import example.loo.com.latte.util.file.FileUtil;

/**
 * Created by jingluyuan on 8/10/18.
 */

public class LatteCamera {

    public static Uri createCropFile()
    {
        return Uri.parse
                (FileUtil.createFile("crop_image"
                        ,FileUtil.getFileNameByTime("IMG","jpg")).getPath());
    }

    public static void start(PermissionCheckerDelegate delegate)
    {
        new CameraHandler(delegate).beginCameraDialog();
    }
}
