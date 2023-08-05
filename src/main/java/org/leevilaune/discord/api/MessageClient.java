package org.leevilaune.discord.api;

import okhttp3.Response;

import java.io.IOException;

public class MessageClient extends HTTPClient{
    public MessageClient(String apiToken) {
        super(apiToken);
    }

    public void sendMessage(String json) throws IOException {
        Response postMessageResponse = post("/channels/807397412586258435/messages",json);

        if(postMessageResponse.code() != 200){
            System.out.println(postMessageResponse);
            return;
        }
        System.out.println(postMessageResponse.body().string());

    }
}
