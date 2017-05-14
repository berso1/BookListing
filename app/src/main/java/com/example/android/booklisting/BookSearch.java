package com.example.android.booklisting;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by berso on 5/14/17.
 */

public class BookSearch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_list);

        Intent i = getIntent();
        String text = i.getStringExtra ( "TextBox" );

        TextView book_text_view = (TextView) findViewById(R.id.book);
        book_text_view.setText(text);
    }
}

