package com.xys.ratingbarguide;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RatingBar customRatingbar = (RatingBar) findViewById(R.id.origin_ratingbar);
        customRatingbar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Toast.makeText(MainActivity.this, String.valueOf(rating), Toast.LENGTH_SHORT).show();
            }
        });

        RatingBarView originRatingbar = (RatingBarView) findViewById(R.id.custom_ratingbar);
        originRatingbar.setOnRatingListener(new RatingBarView.OnRatingListener() {
            @Override
            public void onRating(Object bindObject, int RatingScore) {
                Toast.makeText(MainActivity.this, String.valueOf(RatingScore), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
