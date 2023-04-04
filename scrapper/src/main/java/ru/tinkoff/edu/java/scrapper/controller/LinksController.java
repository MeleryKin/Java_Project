package ru.tinkoff.edu.java.scrapper.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.tinkoff.edu.java.scrapper.dto.request.AddLinkRequest;
import ru.tinkoff.edu.java.scrapper.dto.request.RemoveLinkRequest;
import ru.tinkoff.edu.java.scrapper.dto.response.LinkResponse;
import ru.tinkoff.edu.java.scrapper.dto.response.ListLinksResponse;

import java.net.URI;
import java.util.ArrayList;

@RestController
@RequestMapping("/links")
public class LinksController {
    @GetMapping(
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ListLinksResponse getLinks(@RequestHeader Long id) {
        return new ListLinksResponse(new ArrayList<>(), 0);
    }

    @PostMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public LinkResponse addLink(@RequestHeader Long id,
                                @RequestBody AddLinkRequest addLinkRequest) {
        return new LinkResponse(1L, URI.create("temp.url.com/path"));
    }

    @DeleteMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public LinkResponse deleteLink(@RequestHeader Long id,
                             @RequestBody RemoveLinkRequest removeLinkRequest) {
        return new LinkResponse(1L,  URI.create("temp.url.com/path"));
    }
}
