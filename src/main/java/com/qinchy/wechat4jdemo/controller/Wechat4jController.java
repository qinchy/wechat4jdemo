package com.qinchy.wechat4jdemo.controller;

import com.qinchy.wechat4jdemo.service.impl.Wechat4jService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping(path = "/Wechat4jServlet")
public class Wechat4jController {

    Logger log = LoggerFactory.getLogger(Wechat4jController.class);

    @RequestMapping(method = RequestMethod.GET)
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        Wechat4jService service = new Wechat4jService(request);
        String result = service.execute();
        try {
            response.getOutputStream().write(result.getBytes());
        } catch (IOException e) {
            log.error("消息处理出错:", e);
        }
    }

    @RequestMapping(method = RequestMethod.POST)
    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        Wechat4jService service = new Wechat4jService(request);
        String result = service.execute();
        try {
            response.getOutputStream().write(result.getBytes());
        } catch (IOException e) {
            log.error("消息处理出错:", e);
        }
    }
}
