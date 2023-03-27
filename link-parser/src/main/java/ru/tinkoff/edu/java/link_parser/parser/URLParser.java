package ru.tinkoff.edu.java.link_parser.parser;

import ru.tinkoff.edu.java.link_parser.answer.URLAnswer;

public sealed interface URLParser permits StackOverflowParser, GitHubParser {

    URLAnswer parseURL(String url);

}
