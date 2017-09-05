package com.qinchy.wechat4jdemo.controller;

import com.qinchy.wechat4jdemo.common.WeixinRequestUtils;
import com.qinchy.wechat4jdemo.common.WeixinUrlEnum;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/weixinip")
public class WeixinIpController {

    @RequestMapping(path = "/get",method = RequestMethod.GET)
    public String get(){
        return WeixinRequestUtils.request(WeixinUrlEnum.IP_GET, null,"JSON");
    }
}
