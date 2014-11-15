package edu.chalmers.bookmanager;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.TextView;


public class DetailActivity extends ActionBarActivity {

    private BookManager bookManager;
    private Book book;
    private TextView titleText;
    private TextView authorText;
    private TextView courseText;
    private TextView priceText;
    private TextView isbnText;
    private TextView currencyText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        bookManager = new SimpleBookManager();
        book = bookManager.getBook(0);

        titleText = (TextView)findViewById(R.id.titleText);
        authorText = (TextView)findViewById(R.id.authorText);
        courseText = (TextView)findViewById(R.id.courseText);
        priceText = (TextView) findViewById(R.id.priceText);
        isbnText = (TextView)findViewById(R.id.isbnText);
        currencyText = (TextView)findViewById(R.id.currencyText);

        titleText.setText(book.getTitle());
        authorText.setText(book.getAuthor());
        courseText.setText(book.getCourse());
        priceText.setText(book.getPrice() + "");
        isbnText.setText(book.getIsbn());
        currencyText.setText(getResources().getText(R.string.SEK));

    }




}
