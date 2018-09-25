package ru.gorshckov.book;

import java.io.Serializable;

public class Book implements Serializable {

    private static final long serialVersionUID = -5423222256312811932L;
    private String Title;
    private String AuthorName;
    private int YearofPublish;

    public Book(String title, String authorName, int yearofPublish) {
        Title = title;
        AuthorName = authorName;
        YearofPublish = yearofPublish;
    }

    public String getTitle() {
        return Title;
    }


    public String getAuthorName() {
        return AuthorName;
    }


    public int getYearofPublish() {
        return YearofPublish;
    }

        @Override
    public String toString() {
        return
                "  Title='" + Title + '\'' +
                ", AuthorName='" + AuthorName + '\'' +
                ", YearofPublish=" + YearofPublish+'\n';

    }
}
