package edu.chalmers.bookmanager;

import java.util.ArrayList;

/**
 * Created by oliver on 14-11-05.
 */
public interface BookManager {
    public int count();
    public Book getBook(int index);
    public Book createBook();
    public ArrayList<Book> getAllBooks();
    public void removeBook(Book book);
    public void moveBook (int from, int to);
    public int getMinPrice();
    public int getMaxPrice();
    public float getMeanPrice();
    public int getTotalCost();
    public void saveChanges();
}

