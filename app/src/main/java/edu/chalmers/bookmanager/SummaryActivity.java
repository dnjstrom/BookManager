package edu.chalmers.bookmanager;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class SummaryActivity extends ActionBarActivity {

    private BookManager bookManager;
    private Book book;
    private TextView totalCostText;
    private TextView mostExpensiveItemText;
    private TextView leastExpensiveItemText;
    private TextView averagePriceText;
    private TextView bookCountText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        bookManager = new SimpleBookManager();
        book = bookManager.getBook(0);

        totalCostText = (TextView)findViewById(R.id.totalCostText);
        mostExpensiveItemText = (TextView)findViewById(R.id.mostExpensiveItemText);
        leastExpensiveItemText = (TextView)findViewById(R.id.leastExpensiveItemText);
        averagePriceText = (TextView) findViewById(R.id.averagePriceText);
        bookCountText = (TextView)findViewById(R.id.bookCountText);

        totalCostText.setText(bookManager.getTotalCost() + " " + getResources().getString(R.string.SEK));
        mostExpensiveItemText.setText(bookManager.getMaxPrice() + " " + getResources().getString(R.string.SEK));
        leastExpensiveItemText.setText(bookManager.getMinPrice() + " " + getResources().getString(R.string.SEK));
        averagePriceText.setText(bookManager.getMeanPrice() + " " + getResources().getString(R.string.SEK));
        bookCountText.setText(bookManager.count() + " books in your library");

    }


}
