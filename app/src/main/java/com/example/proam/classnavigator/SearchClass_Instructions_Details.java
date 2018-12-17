package com.example.proam.classnavigator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SearchClass_Instructions_Details extends AppCompatActivity {
    String TextName;
    int resid;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_class__instructions__details);
        Bundle Extras=getIntent().getExtras();
        TextView textView = (TextView) findViewById(R.id.txtdrawer_1);
        //imageView=(ImageView)findViewById(R.id.img1);
        if(Extras !=null)
        {
            resid=Extras.getInt("ImgID");
            TextName=Extras.getString("Text");
        }
        Toast.makeText(getBaseContext(), getString(resid),Toast.LENGTH_LONG).show();
        textView.setText(TextName);

        //Set Image Source Dynamically
//        int resID=getResources().getIdentifier(ImageName,"drawable",getPackageName());
        //imageView.setImageResource(resid);

    }
}
