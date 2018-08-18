package example.loo.com.fastec.generators;

import example.loo.com.latte.wechat.templates.WXPayEntryTemplate;
import example.loo.com.latte_annotations.annotation.PayEntryGenerator;

/**
 * Created by jingluyuan on 8/4/18.
 */

@PayEntryGenerator(
        packageName = "example.loo.com.fastec",
        payEntryTemplate = WXPayEntryTemplate.class
)
public interface WeChatPayEntry {
}
