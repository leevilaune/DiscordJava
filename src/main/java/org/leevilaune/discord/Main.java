package org.leevilaune.discord;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.leevilaune.discord.api.MessageClient;
import org.leevilaune.discord.api.models.Message;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        try {
            String token = Files.readString(Path.of("src/main/resources/discord_token"));
            MessageClient client = new MessageClient(token);

            Message m = new Message();
            m.setContent("Hello World!");
            ObjectMapper mapper = new ObjectMapper();
            client.sendMessage(mapper.writeValueAsString(m));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}