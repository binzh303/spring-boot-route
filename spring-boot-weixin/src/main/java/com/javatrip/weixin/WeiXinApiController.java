package com.javatrip.weixin;

import com.jfinal.weixin.sdk.api.ApiResult;
import com.jfinal.weixin.sdk.api.MenuApi;
import net.dreamlu.weixin.annotation.WxApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.LinkedHashMap;

/**
 * @Author 公众号：Java旅途
 * @Description 菜单配置类
 * @Date 2020-08-23 16:05
 */
@WxApi("weixin/api")
public class WeiXinApiController {

    @GetMapping("menu")
    @ResponseBody
    public String getMenu(){
        ApiResult menu = MenuApi.getMenu();
        return menu.getJson();
    }
}
