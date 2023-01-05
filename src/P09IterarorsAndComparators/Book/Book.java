package P09IterarorsAndComparators.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book implements Comparable<Book> {
    private String title;
    private int year;
    private List<String> authors;

    public int getYear() {
        return year;
    }

    public Book(String title, int year, String...authors) {
        this.title = title;
        this.year = year;
        this.authors = new ArrayList<>(Arrays.asList(authors));
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int compareTo(Book bookTwo) {
        System.out.println();
        int result =bookTwo.getTitle().compareTo(this.title);
        if (result ==0 ){
            result =  Integer.compare(this.year, bookTwo.getYear());
        }
        return result;
    }
}
