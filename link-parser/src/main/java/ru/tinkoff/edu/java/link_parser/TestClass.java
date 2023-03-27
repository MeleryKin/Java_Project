package ru.tinkoff.edu.java.link_parser;

import ru.tinkoff.edu.java.link_parser.answer.GitHubAnswer;
import ru.tinkoff.edu.java.link_parser.answer.StackOverflowAnswer;
import ru.tinkoff.edu.java.link_parser.answer.URLAnswer;
import ru.tinkoff.edu.java.link_parser.parser.URLParser;

import java.util.Scanner;

public class TestClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String url = sc.next();
        URLAnswer answer = LinkParser.getURLResult(url);
        if (answer instanceof GitHubAnswer) {
            System.out.println("GitHubAnswer");
        }
        if (answer instanceof StackOverflowAnswer) {
            System.out.println("StackOverflowAnswer");
        }
        if (answer == null) {
            System.out.println("Error");
        }
    }
}
