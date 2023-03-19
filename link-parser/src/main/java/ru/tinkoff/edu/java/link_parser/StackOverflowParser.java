package ru.tinkoff.edu.java.link_parser;

public final class StackOverflowParser extends URLParser {

    static URLAnswer parseURL(String url) {
        var parse = url.split("/");
        return new StackOverflowAnswer(Long.parseLong(parse[4]));
    }
}
