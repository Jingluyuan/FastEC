package example.loo.com.fastec.generators;

import example.loo.com.latte.wechat.templates.AppRegisterTemplate;
import example.loo.com.latte_annotations.annotation.AppRegisterGenerator;

/**
 * Created by jingluyuan on 8/4/18.
 */

@AppRegisterGenerator(
        packageName = "example.loo.com.fastec",
        registerTemplate = AppRegisterTemplate.class
)
public interface AppRegister {
}
