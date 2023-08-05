package org.leevilaune.discord.api.models;

import org.leevilaune.discord.api.MessageClient;
import org.leevilaune.discord.api.models.embed.Embed;

import java.util.Arrays;

public class Message {

    private String content;
    private String nonce;
    private boolean tts;
    private Embed[] embeds;

    public Message(){
        this.tts = false;
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getNonce() {
        return nonce;
    }

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    public boolean isTts() {
        return tts;
    }

    public void setTts(boolean tts) {
        this.tts = tts;
    }

    public Embed[] getEmbeds() {
        return embeds;
    }

    public void setEmbeds(Embed[] embeds) {
        this.embeds = embeds;
    }

    @Override
    public String toString() {
        return "Message{" +
                "content='" + content + '\'' +
                ", nonce='" + nonce + '\'' +
                ", tts=" + tts +
                ", embeds=" + Arrays.toString(embeds) +
                '}';
    }
}
