package ru.tinkoff.edu.java.bot.service;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.commands.BotCommand;

public interface Command {

    String command();

    String description();

    SendMessage handle(Update update);

    default Message message(Update update) {
        return update.getMessage();
    }

    default BotCommand toApiCommand() {
        return new BotCommand(command(), description());
    }

}
