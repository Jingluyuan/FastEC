package example.loo.com.fastec.generators;

import example.loo.com.latte.wechat.templates.WXEntryTemplate;
import example.loo.com.latte_annotations.annotation.EntryGenerator;

/**
 * Created by jingluyuan on 8/4/18.
 */

@EntryGenerator(
        packageName = "example.loo.com.fastec",
        entryTemplate = WXEntryTemplate.class
)
public interface WeChatEntry {
}
