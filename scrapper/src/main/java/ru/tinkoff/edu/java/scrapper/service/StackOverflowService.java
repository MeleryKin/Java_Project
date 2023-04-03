package ru.tinkoff.edu.java.scrapper.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import ru.tinkoff.edu.java.scrapper.client.StackOverflowClient;
import ru.tinkoff.edu.java.scrapper.client.StackOverflowQuestionResponse;
import ru.tinkoff.edu.java.scrapper.client.StackOverflowQuestionsResponse;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class StackOverflowService {
    private final StackOverflowClient stackOverflowClient;

    public Mono<StackOverflowQuestionResponse> fetchQuestion(Integer id) {
        return stackOverflowClient
                .fetchQuestion(id)
                .map(item -> item.items().get(0));
    }

    public Mono<List<StackOverflowQuestionResponse>> fetchQuestions(List<Integer> ids) {
        return stackOverflowClient
                .fetchQuestions(ids
                        .stream()
                        .map(Object::toString)
                        .collect(Collectors.joining(";")))
                .map(StackOverflowQuestionsResponse::items);
    }
}