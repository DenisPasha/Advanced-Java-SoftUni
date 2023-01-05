package P09IterarorsAndComparators.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book {
    private String title;
    private int year;
    private List<String>authorsList;

    public Book(String title, int year, String... authors) {
        this.title = title;
        this.year = year;
        this.authorsList = new ArrayList<>(Arrays.asList(authors));
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getAuthorsList() {
        return authorsList;
    }

    public void setAuthorsList(List<String> authorsList) {
        this.authorsList = authorsList;
    }
}
