package com.qinchy.wechat4jdemo.service.impl;

import org.sword.wechat4j.WechatSupport;

import javax.servlet.http.HttpServletRequest;

public class Wechat4jService extends WechatSupport {

    public Wechat4jService(HttpServletRequest request) {
        super(request);
    }

    @Override
    protected void onText() {
        responseText("hello world!");
    }

    @Override
    protected void onImage() {
        responseImage("");
    }

    @Override
    protected void onVoice() {
        responseVoice("");
    }

    @Override
    protected void onVideo() {
        responseVideo("","title","description");
    }

    @Override
    protected void onShortVideo() {
        responseVideo("","title","description");
    }

    @Override
    protected void onLocation() {
        responseText("hello world!");
    }

    @Override
    protected void onLink() {
        responseText("hello world!");
    }

    @Override
    protected void onUnknown() {
        responseText("未知的消息类型");
    }

    // 以下是事件

    @Override
    protected void click() {
        responseText("菜单 - 点击菜单拉取消息");
    }

    @Override
    protected void subscribe() {
        responseText("订阅");
    }

    @Override
    protected void unSubscribe() {
        responseText("取消订阅");
    }

    @Override
    protected void scan() {
        responseText("扫描带参数二维码");
    }

    @Override
    protected void location() {
        responseText("上报地理位置");
    }

    @Override
    protected void view() {
        responseText("菜单 - 点击菜单跳转链接");
    }

    @Override
    protected void templateMsgCallback() {
        responseText("发送结果 - 模板消息发送结果");
    }

    @Override
    protected void scanCodePush() {
        responseText("菜单 - 扫码推事件(客户端跳URL)");
    }

    @Override
    protected void scanCodeWaitMsg() {
        responseText("菜单 - 扫码推事件(客户端不跳URL)");
    }

    @Override
    protected void picSysPhoto() {
        responseText("菜单 - 弹出系统拍照发图");
    }

    @Override
    protected void picPhotoOrAlbum() {
        responseText("菜单 - 弹出拍照或者相册发图");
    }

    @Override
    protected void picWeixin() {
        responseText("菜单 - 弹出微信相册发图器");
    }

    @Override
    protected void locationSelect() {
        responseText("菜单 - 弹出地理位置选择器");
    }

    @Override
    protected void kfCreateSession() {
        responseText("多客服 - 接入会话");
    }

    @Override
    protected void kfCloseSession() {
        responseText("多客服 - 关闭会话");
    }

    @Override
    protected void kfSwitchSession() {
        responseText("多客服 - 转接会话");
    }
}
