package ru.tinkoff.edu.java.link_parser;

public final class GitHubParser extends URLParser {

    public static URLAnswer parseURL(String url) {
        var parse = url.split("/");
        return new GitHubAnswer(parse[3], parse[4]);
    }

}
