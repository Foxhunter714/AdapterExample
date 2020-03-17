package com.nrc7.book;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.container, BookListFragment.newInstance("",""), "listFragment")
                .commit();
    }

    @Override
    public void onBackPressed() {
        getSupportFragmentManager().beginTransaction()
                .add(R.id.container, BookListFragment.newInstance("",""), "listFragment")
                .remove(getSupportFragmentManager().findFragmentByTag("detailsFr"))
                .commit();
    }
}
