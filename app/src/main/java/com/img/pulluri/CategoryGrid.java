package com.img.pulluri;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.view.View;
import android.widget.ImageView;

public class CategoryGrid extends Activity {
    private ImageView imageView;
    private ImageView imageView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_grid);

        imageView = findViewById(R.id.javaQuestions);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryGrid.this,MainActivity.class);
                startActivity(intent);
            }
        });
        imageView1 = findViewById(R.id.htmlQuestions);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryGrid.this,descripion.class);
                startActivity(intent);
            }
        });
    }
}
