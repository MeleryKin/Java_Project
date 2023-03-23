package ru.tinkoff.edu.java.link_parser.parser;

import ru.tinkoff.edu.java.link_parser.answer.URLAnswer;
import ru.tinkoff.edu.java.link_parser.answer.StackOverflowAnswer;

import java.util.regex.Pattern;

public final class StackOverflowParser implements URLParser {

    public static URLAnswer parseURL(String url) {
        if (!Pattern.matches("(^(https?://)stackoverflow\\.com/questions/\\d*/[^/ ]*/?)", url)) {
            return null;
        }

        var parse = url.split("/");
        return new StackOverflowAnswer(Long.parseLong(parse[4]));
    }
}
