package edu.chalmers.bookmanager;

import java.util.ArrayList;

/**
 * Created by oliver on 14-11-05.
 */


public class SimpleBookManager implements BookManager {

    private ArrayList<Book> library;

    public SimpleBookManager() {
        library = new ArrayList<>();
        // create 5 books
        library.add(new Book(
                "Hómēros",
                "Iliás",
                100,
                "1001gigvtyjiu6fbhjhd",
                "Greek"
        ));
        library.add(new Book(
                "Hómēros",
                "Odýsseia",
                101,
                "1001gigvtyjiu7fbhjhd",
                "Greek"
        ));
        library.add(new Book(
                "Máo Zédōng",
                "Máo zhǔxí yǔlù",
                1,
                "1001gig2tyjiu7fbhjhd",
                "Politics"
        ));
        library.add(new Book(
                "Unknown",
                "Epic of Gilgamesh",
                2000000,
                "1001gigblablajiu7fbhjhd",
                "History"
        ));
        library.add(new Book(
                "William Shakespeare",
                "A Midsummer Night's Dream",
                236,
                "3y54shtre5uyiu7fbhjhd",
                "English"
        ));

    }

    @Override
    public int count() {
        return library.size();
    }

    @Override
    public Book getBook(int index) {
        return library.get(index);
    }

    @Override
    public Book createBook() {
        Book book = new Book();
        library.add(book);
        return book;
    }

    @Override
    public ArrayList<Book> getAllBooks() {
        return library;
    }

    @Override
    public void removeBook(Book book) {
        library.remove(book);
    }

    @Override
    public void moveBook(int from, int to) {
        Book book = library.get(from);
        library.remove(from);
        library.add(to, book);
    }

    @Override
    public int getMinPrice() {
        if (count() == 0) {
            throw new IndexOutOfBoundsException("Empty library");
        }
        int minPrice = Integer.MAX_VALUE;
        for (Book book : library) {
            if (book.getPrice() < minPrice) {
                minPrice = book.getPrice();
            }

        }
        return minPrice;
    }

    @Override
    public int getMaxPrice() {
        if (count() == 0) {
            throw new IndexOutOfBoundsException("Empty library");
        }
        int maxPrice = Integer.MIN_VALUE;
        for (Book book : library) {
            if (book.getPrice() > maxPrice) {
                maxPrice = book.getPrice();
            }

        }
        return maxPrice;
    }

    @Override
    public float getMeanPrice() {
        return getTotalCost() / (float) count();
    }

    @Override
    public int getTotalCost() {
        int total = 0;
        for (Book book : library) {
            total += book.getPrice();
        }
        return total;
    }

    @Override
    public void saveChanges() {

    }
}
