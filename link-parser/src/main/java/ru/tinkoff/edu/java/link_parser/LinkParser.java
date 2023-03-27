package ru.tinkoff.edu.java.link_parser;

import ru.tinkoff.edu.java.link_parser.answer.URLAnswer;
import ru.tinkoff.edu.java.link_parser.parser.GitHubParser;
import ru.tinkoff.edu.java.link_parser.parser.StackOverflowParser;

public class LinkParser {

    static GitHubParser gitHubParser = new GitHubParser();
    static StackOverflowParser stackOverflowParser = new StackOverflowParser();

    public static URLAnswer getURLResult(String url) {
        URLAnswer result;
        if ((result = gitHubParser.parseURL(url)) != null) {
            return result;
        }
        if ((result = stackOverflowParser.parseURL(url)) != null) {
            return result;
        }
        return null;
    }

}
