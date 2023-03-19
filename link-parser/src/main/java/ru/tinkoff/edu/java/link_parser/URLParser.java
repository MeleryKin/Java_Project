package ru.tinkoff.edu.java.link_parser;

import java.util.regex.Pattern;

public abstract sealed class URLParser permits StackOverflowParser, GitHubParser {

    public static URLAnswer getURLResult(String url) {
        if (Pattern.matches("(^(https?://)github\\.com/[^/ ]*/[^/ ]*/?)", url)) {
            return GitHubParser.parseURL(url);
        }
        if (Pattern.matches("(^(https?://)stackoverflow\\.com/questions/\\d*/[^/ ]*/?)", url)) {
            return StackOverflowParser.parseURL(url);
        }
        return null;
    }

}
