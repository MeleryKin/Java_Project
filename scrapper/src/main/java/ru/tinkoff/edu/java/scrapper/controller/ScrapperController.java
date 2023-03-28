package ru.tinkoff.edu.java.scrapper.controller;

import org.springframework.web.bind.annotation.*;
import ru.tinkoff.edu.java.scrapper.dto.request.AddLinkRequest;
import ru.tinkoff.edu.java.scrapper.dto.request.RemoveLinkRequest;

@RequestMapping("/test")
@RestController

public class ScrapperController {

    @GetMapping
    public String testController() {
        return "Works correctly.";
    }

    @PostMapping("/tg-chat/{id}")
    public String registerChat(@PathVariable Long id) {
        return "Чат успешно зарегистрирован.";
    }

    @DeleteMapping("/tg-chat/{id}")
    public String deleteChat(@PathVariable Long id) {
        return "Чат удален.";
    }

    @GetMapping("/links")
    public String getLinks(Long id) {
        return "Отправлены отслеживаемые ссылки";
    }

    @PostMapping("/links")
    public String addLink(Long id, AddLinkRequest addLinkRequest) {
        return "Отслеживание ссылки добавлено";
    }

    @DeleteMapping("/links")
    public String deleteLink(Long id, RemoveLinkRequest removeLinkRequest) {
        return "Отслеживание ссылки удалено";
    }
}
