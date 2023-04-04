package ru.tinkoff.edu.java.bot.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.tinkoff.edu.java.bot.dto.request.LinkUpdateRequest;

@RestController
@RequestMapping("/updates")
public class UpdatesController {

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void linkUpdate(@RequestBody LinkUpdateRequest request) {

    }

}
