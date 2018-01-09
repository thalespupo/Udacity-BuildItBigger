package com.tapura.bigbadjokes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BadJokesActivity extends AppCompatActivity {

    public static final String JOKE = "joke";
    TextView mTVJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bad_jokes);

        mTVJoke = (TextView) findViewById(R.id.text_view_joke);

        if (getIntent().hasExtra(JOKE)) {
            mTVJoke.setText(getIntent().getStringExtra(JOKE));
        }
    }
}
