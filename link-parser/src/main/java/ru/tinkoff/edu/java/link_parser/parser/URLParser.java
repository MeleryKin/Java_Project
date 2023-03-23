package ru.tinkoff.edu.java.link_parser.parser;

import ru.tinkoff.edu.java.link_parser.answer.URLAnswer;

public sealed interface URLParser permits StackOverflowParser, GitHubParser {

    static URLAnswer getURLResult(String url) {
        URLAnswer result;
        if ((result = GitHubParser.parseURL(url)) != null) {
            return result;
        }
        if ((result = StackOverflowParser.parseURL(url)) != null) {
            return result;
        }
        return null;
    }

    static URLAnswer parseURL(String url) {
        return null;
    }

}
