package org.yunzhong.verification.integration;

import lombok.Data;

@Data
public class RequestTransformerOutput {
    private String messageId;
    private Object payload;
    
    public RequestTransformerOutput(String messageId, Object payload) {
        this.messageId = messageId;
        this.payload = payload;
    }
}
