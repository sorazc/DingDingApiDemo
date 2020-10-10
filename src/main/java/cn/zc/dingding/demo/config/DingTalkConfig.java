package cn.zc.dingding.demo.config;

/**
 * @ClassName DingTalkConfig
 * @Description
 * @Author zc
 * @Date 2020/10/10 14:03
 */
public class DingTalkConfig {

    /**
     * 开发者后台->应用开发-企业内部应用->选择您创建的小程序->应用首页-查看详情->查看AppKey
     */
    public static final String APP_KEY = "dinghmvznk0ar4tzrqx8";

    /**
     * 开发者后台->应用开发-企业内部应用->选择您创建的小程序->应用首页-查看详情->查看AppSecret
     */
    public static final String APP_SECRET="ZAjIUcAcshnaohFoauJVB7VXiYZN-f1uGXH4exk_8OIPORVX3GKhAN3s3JSPf_vm";

    /**
     * 钉钉网关gettoken地址
     */
    public static final String URL_GET_TOKKEN = "https://oapi.dingtalk.com/gettoken";

    /**
     *获取用户在企业内userId的接口URL
     */
    public static final String URL_GET_USER_INFO = "https://oapi.dingtalk.com/user/getuserinfo";

    /**
     *获取用户姓名的接口url
     */
    public static final String URL_USER_GET = "https://oapi.dingtalk.com/user/get";

}
