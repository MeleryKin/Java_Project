package ru.tinkoff.edu.java.bot.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.tinkoff.edu.java.bot.dto.request.LinkUpdateRequest;

@RequestMapping("/updates")
@RestControllerAdvice
public class BotController {

    @PostMapping
    public String linkUpdate(LinkUpdateRequest linkUpdateRequest) {
        return "Ссылка обновлена.";
    }


}
