package com.javier.picassoexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imgview);

        Picasso.with(this)
                .load("http://androgeek.com/wp-content/uploads/2010/03/free-large-android256.jpg")
                .into(imageView);
    }

    public void picMagic(View view) {
        Picasso.with(this)
                .load("http://www.returnofkings.com/wp-content/uploads/2016/10/game-of-thrones-667x398.jpg")
                .into(imageView);

    }
}
