package ru.tinkoff.edu.java.scrapper.client;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import reactor.core.publisher.Mono;

@HttpExchange(
        accept = MediaType.APPLICATION_JSON_VALUE,
        contentType = MediaType.APPLICATION_JSON_VALUE
)
public interface StackOverflowClient {
    @GetExchange("/questions/{id}?site=stackoverflow")
    Mono<StackOverflowQuestionsResponse> fetchQuestion(@PathVariable Integer id);

    @GetExchange("/questions/{ids}?site=stackoverflow")
    Mono<StackOverflowQuestionsResponse> fetchQuestions(@PathVariable String ids);
}