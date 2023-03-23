package ru.tinkoff.edu.java.link_parser.answer;

import ru.tinkoff.edu.java.link_parser.answer.GitHubAnswer;
import ru.tinkoff.edu.java.link_parser.answer.StackOverflowAnswer;

public abstract sealed class URLAnswer permits GitHubAnswer, StackOverflowAnswer {

}
