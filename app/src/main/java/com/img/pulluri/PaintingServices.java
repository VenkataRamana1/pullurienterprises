package com.img.pulluri;

import android.content.Context;
import android.content.Intent;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class PaintingServices extends AppCompatActivity {

    private static final  String TAG="PaintingServices";
    private Context mContext;
    private ArrayList<String> arrayList;
    private RecyclerView mRecyclerView;
    AdView mAdview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_painting_services);
        mContext = PaintingServices.this;
        arrayList = new ArrayList<String>();

        arrayList.add(Constants.Interior_paintings);
        arrayList.add(Constants.Exterior__paintings);
        arrayList.add(Constants.Paint_your_home);
        arrayList.add(Constants.Designs_by_Professionals);
        mRecyclerView = (RecyclerView) findViewById(R.id.title_layout_recyclerView);
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
    }
}
