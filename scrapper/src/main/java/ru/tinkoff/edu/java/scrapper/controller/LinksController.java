package ru.tinkoff.edu.java.scrapper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.tinkoff.edu.java.scrapper.dto.request.AddLinkRequest;
import ru.tinkoff.edu.java.scrapper.dto.request.RemoveLinkRequest;
import ru.tinkoff.edu.java.scrapper.dto.response.LinkResponse;
import ru.tinkoff.edu.java.scrapper.dto.response.ListLinksResponse;
import ru.tinkoff.edu.java.scrapper.service.StackOverflowService;

import java.net.URI;
import java.util.ArrayList;

@RestController
@RequestMapping("/links")
public class LinksController {
    @GetMapping(
            path = "/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ListLinksResponse getLinks(@PathVariable Long id) {
        return new ListLinksResponse(new ArrayList<>(), 0);
    }

    @PostMapping(
            path = "/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public LinkResponse addLink(@PathVariable Long id,
                                @RequestBody AddLinkRequest addLinkRequest) {
        return new LinkResponse(1L, URI.create("temp.url.com/path"));
    }

    @DeleteMapping(
            path = "/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public LinkResponse deleteLink(@PathVariable Long id,
                             @RequestBody RemoveLinkRequest removeLinkRequest) {
        return new LinkResponse(1L,  URI.create("temp.url.com/path"));
    }
}
