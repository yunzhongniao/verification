package org.yunzhong.verification.integration;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LanchingChannelHandler {

    public Object launch(RequestTransformerOutput transformer){
        log.info("end point for message {}",transformer.getMessageId());
        return new Object();
    }
    
}
