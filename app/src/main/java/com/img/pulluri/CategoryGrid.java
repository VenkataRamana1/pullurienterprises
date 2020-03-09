package com.img.pulluri;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class CategoryGrid extends Activity {
    private ImageView imageView;
    private ImageView imageView1;
    private ImageView imageView2;
    private ImageView imageView3;
    private ImageView imageView4;
    private ImageView imageView5;
    private ImageView imageView6;
    private ImageView imageView7;
    private InterstitialAd mInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_grid);

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        imageView = findViewById(R.id.javaQuestions);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mInterstitialAd.isLoaded()){
                    mInterstitialAd.show();
                }
                else {
                    Intent intent = new Intent(CategoryGrid.this,MainActivity.class);
                    startActivity(intent);
                }

                mInterstitialAd.setAdListener(new AdListener(){
                    @Override
                    public void onAdClosed(){
                        super.onAdClosed();
                        Intent intent = new Intent(CategoryGrid.this,MainActivity.class);
                        startActivity(intent);
                        mInterstitialAd.loadAd(new AdRequest.Builder().build());
                    }
                });

            }
        });
        imageView1 = findViewById(R.id.htmlQuestions);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mInterstitialAd.isLoaded()){
                    mInterstitialAd.show();
                }
                else {
                    Intent intent = new Intent(CategoryGrid.this,ElectricalServices.class);
                    startActivity(intent);
                }

                mInterstitialAd.setAdListener(new AdListener(){
                    @Override
                    public void onAdClosed(){
                        super.onAdClosed();
                        Intent intent = new Intent(CategoryGrid.this,ElectricalServices.class);
                        startActivity(intent);
                        mInterstitialAd.loadAd(new AdRequest.Builder().build());
                    }
                });

            }
        });

        imageView2 = findViewById(R.id.educationalServices);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mInterstitialAd.isLoaded()){
                    mInterstitialAd.show();
                }
                else {
                    Intent intent = new Intent(CategoryGrid.this,EducationalServices.class);
                    startActivity(intent);
                }

                mInterstitialAd.setAdListener(new AdListener(){
                    @Override
                    public void onAdClosed(){
                        super.onAdClosed();
                        Intent intent = new Intent(CategoryGrid.this,EducationalServices.class);
                        startActivity(intent);
                        mInterstitialAd.loadAd(new AdRequest.Builder().build());
                    }
                });

            }
        });

                imageView3 = findViewById(R.id.jobServices);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryGrid.this, JobServices.class);
                startActivity(intent);
            }
        });

        imageView4 = findViewById(R.id.homeautomation);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryGrid.this, HomeAutomation.class);
                startActivity(intent);
            }
        });

        imageView5 = findViewById(R.id.paintServices);
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryGrid.this, PaintingServices.class);
                startActivity(intent);
            }
        });
        imageView6 = findViewById(R.id.cateringServices);
        imageView6.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryGrid.this, CateringServices.class);
                startActivity(intent);
            }
        }));

        imageView7 = findViewById(R.id.webandmobileServices);
        imageView7.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mInterstitialAd.isLoaded()){
                    mInterstitialAd.show();
                }
                else {
                    Intent intent = new Intent(CategoryGrid.this,WebMobileServices.class);
                    startActivity(intent);
                }

                mInterstitialAd.setAdListener(new AdListener(){
                    @Override
                    public void onAdClosed(){
                        super.onAdClosed();
                        Intent intent = new Intent(CategoryGrid.this,WebMobileServices.class);
                        startActivity(intent);
                        mInterstitialAd.loadAd(new AdRequest.Builder().build());
                    }
                });

            }
        }));
    }
}
