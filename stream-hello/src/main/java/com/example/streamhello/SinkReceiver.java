package com.example.streamhello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * @Title: SinkReceiver
 * @Author: long-zp
 * @Date: 2018/7/24 10:52
 * @version: V1.0
 * @Description: Created with IntelliJ IDEA.
 **/

/**
 * 该注解用来指定一个或者多个定义了@Input或者@Output注解的接口，以实现对消息通道的绑定。
 *
 * @EnableBinding(Sink.class)表示绑定了Sink接口，该接口是spring cloud stream中默认实现的对输入消息通道绑定的定义
 */
@EnableBinding(Sink.class)
public class SinkReceiver {
    private static Logger logger = LoggerFactory.getLogger(StreamHelloApplication.class);

    /**
     * 把receiver方法注册为input消息通道的事件监听器
     *
     * @param payload
     */
    @StreamListener(Sink.INPUT)
    public void receiver(Object payload) {
        logger.info("Receiver: " + payload.toString());
    }
}
