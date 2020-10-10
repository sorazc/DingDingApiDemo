package cn.zc.dingding.demo.util;

import cn.zc.dingding.demo.config.DingTalkConfig;
import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.request.OapiGettokenRequest;
import com.dingtalk.api.response.OapiGettokenResponse;
import com.taobao.api.ApiException;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;

import static cn.zc.dingding.demo.config.DingTalkConfig.URL_GET_TOKKEN;

/**
 * 获取access_token工具类
 */
@Log4j
public class AccessTokenUtil {

    public static String getToken() throws RuntimeException {
        try {
            DefaultDingTalkClient client = new DefaultDingTalkClient(URL_GET_TOKKEN);
            OapiGettokenRequest request = new OapiGettokenRequest();

            request.setAppkey(DingTalkConfig.APP_KEY);
            request.setAppsecret(DingTalkConfig.APP_SECRET);
            request.setHttpMethod("GET");
            OapiGettokenResponse response = client.execute(request);
            String accessToken = response.getAccessToken();
            return accessToken;
        } catch (ApiException e) {
            log.error("getAccessToken failed", e);
            throw new RuntimeException();
        }
    }
}
