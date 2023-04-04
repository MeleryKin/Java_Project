package ru.tinkoff.edu.java.scrapper.scheduler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Slf4j
@Component
public class LinkUpdaterScheduler {

    @Scheduled(fixedDelayString = "#{@applicationConfig.scheduler.interval}")
    public void update() {
        log.info("Update on: " + LocalDateTime.now());
    }
}