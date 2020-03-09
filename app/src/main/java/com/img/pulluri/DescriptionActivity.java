package com.img.pulluri;

import android.content.Context;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

public class DescriptionActivity extends AppCompatActivity {

    private static final String TAG = "DescriptionActivity";
    private Context mContext;
    private Bundle extraa;
    private WebView webView;
    private ViewPager viewPager;
    Button btnPrev;
    Button btnNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        mContext = DescriptionActivity.this;

        webView = (WebView) findViewById(R.id.webViewSimple);
        //btnPrev = findViewById(R.id.prev);
        //btnNext = findViewById(R.id.next);
        //btnPrev.setVisibility(View.GONE);
        //pageChange();

        extraa = getIntent().getExtras();
        if(!extraa.equals(null)){
            String data = extraa.getString("titles");
            //Log.d(TAG,"onCreate: The coming data is "+data);

            String url = "file:///android_asset/"+data+".html";

            webView.loadUrl(url);
            WebSettings webSettings = webView.getSettings();
            webSettings.setBuiltInZoomControls(true);
            webSettings.setDisplayZoomControls(false);
            webSettings.setJavaScriptEnabled(true);


        }
       /* btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(webView.canGoBack()){
                    webView.goBack();
                }
            }
        });
        btnNext.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (webView.canGoForward()){
                    webView.goForward();
                }
            }
        }));*/
    }

   /* private void pageChange() {
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionoffSet, int positionoffSetPixel) {

            }

            @Override
            public void onPageSelected(int position) {
                int page = position;
                switch (position){
                    case 0:
                        btnPrev.setVisibility(View.GONE);
                        btnNext.setVisibility(View.VISIBLE);
                        break;
                    case 1:
                        btnPrev.setVisibility(View.VISIBLE);
                        btnNext.setVisibility(View.VISIBLE);
                        break;
                    case 2:
                        btnPrev.setVisibility(View.VISIBLE);
                        btnNext.setVisibility(View.GONE);
                        break;

                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

    public void prev(View view) {
        viewPager.setCurrentItem(viewPager.getCurrentItem() - 1,true);
    }

    public void next(View view) {
        viewPager.setCurrentItem(viewPager.getCurrentItem() + 1,true);
    }
*/
}
