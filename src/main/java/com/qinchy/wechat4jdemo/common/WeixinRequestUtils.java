package com.qinchy.wechat4jdemo.common;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sword.lang.HttpUtils;
import org.sword.wechat4j.token.TokenProxy;

public class WeixinRequestUtils {

    private static Logger log = LoggerFactory.getLogger(WeixinRequestUtils.class);

    public static String request(WeixinUrlEnum urlEnum, String body, String dataType) {
        String method = urlEnum.getMethod();
        String url = urlEnum.getUrl();
        String accessToken = TokenProxy.accessToken();
        url = url.replace("{ACCESS_TOKEN}", accessToken);

        String result = "";
/*
        if (StringUtils.equalsIgnoreCase("post", method)) {
            result = HttpUtils.post(url, body, "UTF-8");
        } else {
            // get传参数加到url中吧，这里params传null
            result = HttpUtils.get(url, null, "UTF-8");
        }
*/


        if (StringUtils.equalsIgnoreCase("post", method)) {
            if (StringUtils.equalsIgnoreCase("JSON", dataType)) {
                result = HttpUtils.post(url, body);
            } else if (StringUtils.equalsIgnoreCase("XML", dataType)) {
                // 不知道传输xml和json有什么差别
                result = HttpUtils.post(url, body);
            }
        } else {
            result = HttpUtils.get(url);
        }

        return result;
    }
}
