package org.leevilaune.discord.api;

import okhttp3.*;

import java.io.IOException;

public class HTTPClient {

    private OkHttpClient client;
    private String apiToken;
    private String baseUrl;

    public HTTPClient(String apiToken){
        this.client = new OkHttpClient();
        this.apiToken = apiToken;
        this.baseUrl = "https://discord.com/api/v10";
    }
    protected Request.Builder getBaseRequest(String url){
        return new Request.Builder().header("Authorization","Bot " + apiToken).url(baseUrl+url);
    }
    protected Response get(String url) throws IOException {
        return client.newCall(getBaseRequest(url).build()).execute();
    }
    protected Response post(String url,String request) throws IOException {
        RequestBody body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"),request);
        return client.newCall(getBaseRequest(url).post(body).build()).execute();
    }
}
