package com.qinchy.wechat4jdemo.service.impl;

import org.sword.wechat4j.WechatSupport;

import javax.servlet.http.HttpServletRequest;

public class Wechat4jService extends WechatSupport {

    public Wechat4jService(HttpServletRequest request) {
        super(request);
    }

    @Override
    protected void onText() {
        String msgType = super.wechatRequest.getMsgType();
        String msgContent = super.wechatRequest.getContent();
        responseText("你的消息已经收到！消息类型：" + msgType + "，消息内容是：" + msgContent);
    }

    @Override
    protected void onImage() {
        String msgContent = super.wechatRequest.getMediaId();
        responseImage(msgContent);
    }

    @Override
    protected void onVoice() {
        String msgContent = super.wechatRequest.getMediaId();
        responseVoice(msgContent);
    }

    @Override
    protected void onVideo() {
        String msgContent = super.wechatRequest.getMediaId();
        String title = super.wechatRequest.getTitle();
        String description = super.wechatRequest.getDescription();
        responseVideo(msgContent, title, description);
    }

    @Override
    protected void onShortVideo() {
        responseVideo("", "title", "description");
    }

    @Override
    protected void onLocation() {
        String msgType = super.wechatRequest.getMsgType();
        String msgContent = super.wechatRequest.getLabel();
        responseText("你的消息已经收到！消息类型：" + msgType + "，消息内容是：" + msgContent);
    }

    @Override
    protected void onLink() {
        String msgType = super.wechatRequest.getMsgType();
        String msgContent = super.wechatRequest.getUrl();
        responseText("你的消息已经收到！消息类型：" + msgType + "，消息内容是：" + msgContent);
    }

    @Override
    protected void onUnknown() {
        responseText("未知的消息类型！");
    }

    // 以下是事件

    /**
     * 菜单 - 点击菜单拉取消息
     */
    @Override
    protected void click() {
        String msgType = super.wechatRequest.getMsgType();
        String msgContent = super.wechatRequest.getMediaId();
        responseText("你的消息已经收到！消息类型：" + msgType + "，消息内容是：" + msgContent);
    }

    /**
     * 订阅
     */
    @Override
    protected void subscribe() {
        String msgType = super.wechatRequest.getMsgType();
        String msgContent = super.wechatRequest.getMediaId();
        responseText("你的消息已经收到！消息类型：" + msgType + "，消息内容是：" + msgContent);
    }

    /**
     * 取消订阅
     */
    @Override
    protected void unSubscribe() {
        String msgType = super.wechatRequest.getMsgType();
        String msgContent = super.wechatRequest.getMediaId();
        responseText("你的消息已经收到！消息类型：" + msgType + "，消息内容是：" + msgContent);
    }

    /**
     * 扫描带参数二维码
     */
    @Override
    protected void scan() {
        String msgType = super.wechatRequest.getMsgType();
        String msgContent = super.wechatRequest.getMediaId();
        responseText("你的消息已经收到！消息类型：" + msgType + "，消息内容是：" + msgContent);
    }

    /**
     * 上报地理位置
     */
    @Override
    protected void location() {
        String msgType = super.wechatRequest.getMsgType();
        String msgContent = super.wechatRequest.getMediaId();
        responseText("你的消息已经收到！消息类型：" + msgType + "，消息内容是：" + msgContent);
    }

    /**
     * 菜单 - 点击菜单跳转链接
     */
    @Override
    protected void view() {
        String msgType = super.wechatRequest.getMsgType();
        String msgContent = super.wechatRequest.getMediaId();
        responseText("你的消息已经收到！消息类型：" + msgType + "，消息内容是：" + msgContent);
    }

    /**
     * 发送结果 - 模板消息发送结果
     */
    @Override
    protected void templateMsgCallback() {
        String msgType = super.wechatRequest.getMsgType();
        String msgContent = super.wechatRequest.getMediaId();
        responseText("你的消息已经收到！消息类型：" + msgType + "，消息内容是：" + msgContent);
    }

    /**
     * 菜单 - 扫码推事件(客户端跳URL)
     */
    @Override
    protected void scanCodePush() {
        String msgType = super.wechatRequest.getMsgType();
        String msgContent = super.wechatRequest.getMediaId();
        responseText("你的消息已经收到！消息类型：" + msgType + "，消息内容是：" + msgContent);
    }

    /**
     * 菜单 - 扫码推事件(客户端不跳URL)
     */
    @Override
    protected void scanCodeWaitMsg() {
        String msgType = super.wechatRequest.getMsgType();
        String msgContent = super.wechatRequest.getMediaId();
        responseText("你的消息已经收到！消息类型：" + msgType + "，消息内容是：" + msgContent);
    }

    /**
     * 菜单 - 弹出系统拍照发图
     */
    @Override
    protected void picSysPhoto() {
        String msgType = super.wechatRequest.getMsgType();
        String msgContent = super.wechatRequest.getMediaId();
        responseText("你的消息已经收到！消息类型：" + msgType + "，消息内容是：" + msgContent);
    }

    /**
     * 菜单 - 弹出拍照或者相册发图
     */
    @Override
    protected void picPhotoOrAlbum() {
        String msgType = super.wechatRequest.getMsgType();
        String msgContent = super.wechatRequest.getMediaId();
        responseText("你的消息已经收到！消息类型：" + msgType + "，消息内容是：" + msgContent);
    }

    /**
     * 菜单 - 弹出微信相册发图器
     */
    @Override
    protected void picWeixin() {
        String msgType = super.wechatRequest.getMsgType();
        String msgContent = super.wechatRequest.getMediaId();
        responseText("你的消息已经收到！消息类型：" + msgType + "，消息内容是：" + msgContent);
    }

    /**
     * 菜单 - 弹出地理位置选择器
     */
    @Override
    protected void locationSelect() {
        String msgType = super.wechatRequest.getMsgType();
        String msgContent = super.wechatRequest.getMediaId();
        responseText("你的消息已经收到！消息类型：" + msgType + "，消息内容是：" + msgContent);
    }

    /**
     * 多客服 - 接入会话
     */
    @Override
    protected void kfCreateSession() {
        String msgType = super.wechatRequest.getMsgType();
        String msgContent = super.wechatRequest.getMediaId();
        responseText("你的消息已经收到！消息类型：" + msgType + "，消息内容是：" + msgContent);
    }

    /**
     * 多客服 - 关闭会话
     */
    @Override
    protected void kfCloseSession() {
        String msgType = super.wechatRequest.getMsgType();
        String msgContent = super.wechatRequest.getMediaId();
        responseText("你的消息已经收到！消息类型：" + msgType + "，消息内容是：" + msgContent);
    }

    /**
     * 多客服 - 转接会话
     */
    @Override
    protected void kfSwitchSession() {
        String msgType = super.wechatRequest.getMsgType();
        String msgContent = super.wechatRequest.getMediaId();
        responseText("你的消息已经收到！消息类型：" + msgType + "，消息内容是：" + msgContent);
    }
}
