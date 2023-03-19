package ru.tinkoff.edu.java.link_parser;

public final class GitHubAnswer extends URLAnswer {

    public String userName;
    public String userRepo;

    public GitHubAnswer(String userName, String userRepo) {
        this.userName = userName;
        this.userRepo = userRepo;
    }
}
