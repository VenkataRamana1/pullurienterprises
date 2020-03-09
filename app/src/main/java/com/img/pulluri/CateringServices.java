package com.img.pulluri;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class CateringServices extends AppCompatActivity {

    private static final  String TAG="CateringServices";
    private Context mContext;
    private ArrayList<String> arrayList;
    private RecyclerView mRecyclerView;
    AdView mAdview;
    private InterstitialAd mInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catering_services);
        mContext = CateringServices.this;
        arrayList = new ArrayList<String>();

        arrayList.add(Constants.catering_note);
        arrayList.add(Constants.catering_note1);
        arrayList.add(Constants.catering_note2);
        arrayList.add(Constants.catering_note3);
        mRecyclerView = (RecyclerView) findViewById(R.id.catering_services_recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        titleAdapter  adapter= new titleAdapter(mContext, arrayList, new CustomeItemClickListener() {
            @Override
            public void onItemClick(View v, int position) {

                /*Intent descIntent = new Intent(mContext,DescriptionActivity.class);
                descIntent.putExtra("titles",arrayList.get(position));
                startActivity(descIntent);*/

                Toast.makeText(mContext,arrayList.get(position),Toast.LENGTH_SHORT).show();
            }
        });
        mRecyclerView.setAdapter(adapter);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        //.setAction("Action", null).show();
                Intent contacts = new Intent(mContext,ContactUs.class);
                startActivity(contacts);
            }
        });




        MobileAds.initialize(this,"ca-app-pub-3940256099942544~3347511713");
        mAdview = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdview.loadAd(adRequest);

        /*prepareAd();

        ScheduledExecutorService scheduler =
                Executors.newSingleThreadScheduledExecutor();
        scheduler.scheduleAtFixedRate(new Runnable() {

            public void run() {
                Log.i("hello", "world");
                runOnUiThread(new Runnable() {
                    public void run() {
                        if (mInterstitialAd.isLoaded()) {
                            mInterstitialAd.show();
                        } else {
                            Log.d("TAG"," Interstitial not loaded");
                        }

                        prepareAd();


                    }
                });

            }
        }, 60, 60, TimeUnit.SECONDS);*/

    }

    /*public void prepareAd(){
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
    }*/

}
