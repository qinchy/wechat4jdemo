package com.qinchy.wechat4jdemo.controller;

import com.alibaba.fastjson.JSON;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.sword.wechat4j.exception.WeChatException;
import org.sword.wechat4j.menu.Menu;
import org.sword.wechat4j.menu.MenuManager;

@RestController
@RequestMapping(path = "/menu")
public class MenuController {

    private Logger log = LoggerFactory.getLogger(MenuController.class);
    private static MenuManager menuManager;

    static {
        menuManager = new MenuManager();
    }

    @RequestMapping(path = "/get", method = RequestMethod.GET)
    public String get() {
        Menu menu = menuManager.getMenu();
        return JSONObject.fromObject(menu).toString();
    }

    @RequestMapping(path = "/create", method = RequestMethod.POST)
    public String create(String body) {
        if (StringUtils.isBlank(body)) {
            return "菜单body为空";
        }

        try {
            JSONObject.fromObject(body);
        } catch (Exception e) {
            log.error("菜单文本不是合法的json串", e);
        }

        Menu menu = JSON.parseObject(body, Menu.class);

        try {
            menuManager.create(menu);
            return "{\"isSuccess\":true}";
        } catch (WeChatException e) {
            log.error(e.getMessage(), e);
            return "{\"isSuccess\":false,\"errorMsg\":" + e.getMessage() + "}";
        }

    }

    @RequestMapping(path = "/delete", method = RequestMethod.GET)
    public String delete() {
        try {
            menuManager.delete();
            return "{\"isSuccess\":true}";
        } catch (WeChatException e) {
            log.error(e.getMessage(), e);
            return "{\"isSuccess\":false,\"errorMsg\":" + e.getMessage() + "}";
        }
    }
}
