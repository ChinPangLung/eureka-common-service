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
@EnableBinding(Sink.class)
public class SinkReceiver {
    private static Logger logger = LoggerFactory.getLogger(StreamHelloApplication.class);

    @StreamListener(Sink.INPUT)
    public void receiver(Object payload) {
        logger.info("Receiver: " + payload);
    }
}
