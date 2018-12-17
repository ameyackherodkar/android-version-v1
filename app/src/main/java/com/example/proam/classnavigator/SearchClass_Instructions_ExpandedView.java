package com.example.proam.classnavigator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;

public class SearchClass_Instructions_ExpandedView extends AppCompatActivity {
    String TextName,Title;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_class__instructions__expanded_view);
        Bundle Extras=getIntent().getExtras();

        ImageView imageView=(ImageView)findViewById(R.id.img1);
        TextView textView = (TextView) findViewById(R.id.txtdrawer_1);
        Button btnYes=(Button)findViewById(R.id.btnYes);
        Button btnNo=(Button)findViewById(R.id.btnNo);
        if(Extras !=null)
        {
            //Set Image in Image drawer dynamically
            int resid=Extras.getInt("ImgID");
            imageView.setImageResource(resid);
            TextName=Extras.getString("Text");
            Title=Extras.getString("Title");
        }

        //Set Text View drawer text dynamically
        textView.setText(TextName);

        //Yes Button On Click Listener
        btnYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Title.equals("lhwest_elevator")) {
                    Intent intent = new Intent(getBaseContext(), SearchClass_Instructions_LHW_Elevator.class);
                    startActivity(intent);
                }
                else if(Title.equals("lhwest_cafeteria")) {
                    Intent intent = new Intent(getBaseContext(), SearchClass_Instructions_LHW_Cafeteria.class);
                    startActivity(intent);
                }
                else if(Title.equals("elevator_lhwest")) {
                    Intent intent = new Intent(getBaseContext(), SearchClass_Instructions_Elevator_LHW.class);
                    startActivity(intent);
                }
                else if(Title.equals("cafeteria_lhwest")) {
                    Intent intent = new Intent(getBaseContext(), SearchClass_Instructions_Cafeteria_LHW.class);
                    startActivity(intent);
                }
            }
        });
        //No Button On Click Listener
        btnNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),"Please try again",Toast.LENGTH_LONG).show();
            }
        });

    }
}
