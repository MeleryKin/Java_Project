package ru.tinkoff.edu.java.bot.dto.request;

import java.net.URI;

public record LinkUpdateRequest(Long id, URI link, String description, Integer[] tgChatIds) {
}
