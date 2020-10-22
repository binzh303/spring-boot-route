package com.javatrip.weixin;

import com.jfinal.weixin.sdk.msg.in.InTextMsg;
import com.jfinal.weixin.sdk.msg.in.event.InFollowEvent;
import com.jfinal.weixin.sdk.msg.in.event.InMenuEvent;
import com.jfinal.weixin.sdk.msg.out.OutImageMsg;
import com.jfinal.weixin.sdk.msg.out.OutNewsMsg;
import com.jfinal.weixin.sdk.msg.out.OutTextMsg;
import com.jfinal.weixin.sdk.msg.out.OutVideoMsg;
import lombok.extern.slf4j.Slf4j;
import net.dreamlu.weixin.annotation.WxMsgController;
import net.dreamlu.weixin.spring.DreamMsgControllerAdapter;

/**
 * @Author 公众号：Java旅途
* @Description 微信服务验证及菜单、回复等事件实现类
 * @Date 2020-08-23 12:22
 */
@WxMsgController("/weixin/wx")
@Slf4j
public class WeiXinMsgController extends DreamMsgControllerAdapter {
    @Override
    protected void processInFollowEvent(InFollowEvent inFollowEvent) {

     /*   OutTextMsg defaultMsg = new OutTextMsg(inFollowEvent);
        // 关注
        if(InFollowEvent.EVENT_INFOLLOW_SUBSCRIBE.equals(inFollowEvent.getEvent())){
            // 可将关注用户录入db，此处可以获取到用户openid
            String openId = inFollowEvent.getFromUserName();
            // 查询db，根据响应消息类型封装消息体
            if("文本消息"){
                OutTextMsg otm = new OutTextMsg(inFollowEvent);
                otm.setContent("消息内容");
                render(otm);
                return;
            }else if("图片消息"){
                OutImageMsg oim = new OutImageMsg(inFollowEvent);
                // 这里需要调用微信提供的素材接口，将图片上传至素材库。
                oim.setMediaId("图片素材id");
                render(oim);
                return;
            }else if("图文消息"){
                OutNewsMsg onm = new OutNewsMsg(inFollowEvent);
                onm.addNews("标题","简介","图片地址","图文链接");
                render(onm);
                return;
            }else if("视频消息"){
                OutVideoMsg ovm = new OutVideoMsg(inFollowEvent);
                ovm.setTitle("标题");
                ovm.setDescription("简介");
                ovm.setMediaId("视频素材id");
                render(ovm);
                return;
            }else{
                defaultMsg.setContent("感谢关注");
            }
        }
        // 取消关注
        if(InFollowEvent.EVENT_INFOLLOW_UNSUBSCRIBE.equals(inFollowEvent.getEvent())){
            log.info("用户取消关注了");
            // 此处可以将取消关注的用户更新db
        }*/
    }

    @Override
    protected void processInTextMsg(InTextMsg inTextMsg) {

/*        String content = inTextMsg.getContent();
        // 根据用户发送的content去查询db中的响应内容
        if("文本消息"){
            OutTextMsg otm = new OutTextMsg(inTextMsg);
            otm.setContent("消息内容");
            render(otm);
            return;
        }else if("图片消息"){
            OutImageMsg oim = new OutImageMsg(inTextMsg);
            // 这里需要调用微信提供的素材接口，将图片上传至素材库。
            oim.setMediaId("图片素材id");
            render(oim);
            return;
        }else if("图文消息"){
            OutNewsMsg onm = new OutNewsMsg(inTextMsg);
            onm.addNews("标题","简介","图片地址","图文链接");
            render(onm);
            return;
        }else if("视频消息"){
            OutVideoMsg ovm = new OutVideoMsg(inTextMsg);
            ovm.setTitle("标题");
            ovm.setDescription("简介");
            ovm.setMediaId("视频素材id");
            render(ovm);
            return;
        }else{
            OutTextMsg otm = new OutTextMsg(inTextMsg);
            otm.setContent("暂未查到关键词...");
        }*/
    }

    @Override
    protected void processInMenuEvent(InMenuEvent inMenuEvent) {
    /*    String eventKey = inMenuEvent.getEventKey();
        // 根据用户发送的content去查询db中的响应内容
        if("文本消息"){
            OutTextMsg otm = new OutTextMsg(inMenuEvent);
            otm.setContent("消息内容");
            render(otm);
            return;
        }else if("图片消息"){
            OutImageMsg oim = new OutImageMsg(inMenuEvent);
            // 这里需要调用微信提供的素材接口，将图片上传至素材库。
            oim.setMediaId("图片素材id");
            render(oim);
            return;
        }else if("图文消息"){
            OutNewsMsg onm = new OutNewsMsg(inMenuEvent);
            onm.addNews("标题","简介","图片地址","图文链接");
            render(onm);
            return;
        }else if("视频消息"){
            OutVideoMsg ovm = new OutVideoMsg(inMenuEvent);
            ovm.setTitle("标题");
            ovm.setDescription("简介");
            ovm.setMediaId("视频素材id");
            render(ovm);
            return;
        }else{
            OutTextMsg otm = new OutTextMsg(inMenuEvent);
            otm.setContent("无效链接，请重试...");
        }*/
    }
}
