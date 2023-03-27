package ru.tinkoff.edu.java.link_parser.parser;

import ru.tinkoff.edu.java.link_parser.answer.URLAnswer;
import ru.tinkoff.edu.java.link_parser.answer.GitHubAnswer;

import java.util.regex.Pattern;

public final class GitHubParser implements URLParser {

    public URLAnswer parseURL(String url) {
        if (!Pattern.matches("(^(https?://)github\\.com/[^/ ]+/[^/ ]+/?)", url)) {
            return null;
        }

        var parse = url.split("/");
        return new GitHubAnswer(parse[3], parse[4]);
    }

}
