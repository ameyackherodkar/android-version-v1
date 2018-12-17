package com.example.proam.classnavigator;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class SearchClass_Instructions_LHW_Elevator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchclass__instructions);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
    public void row1click(View view)
    {
            Intent I1 =new Intent(this,SearchClass_Instructions_ExpandedView.class);
            I1.putExtra("ImgID",R.drawable.lhwest_elevator_1);
            I1.putExtra("Text","Go to Exit");
            I1.putExtra("Title","lhwest_elevator");
            startActivity(I1);
    }
    public void row2click(View view)
    {
        Intent I1 =new Intent(this,SearchClass_Instructions_ExpandedView.class);
        I1.putExtra("ImgID",R.drawable.lhwest_elevator_2);
        I1.putExtra("Text","Walk Straight through this hallway");
        I1.putExtra("Title","lhwest_elevator");
        startActivity(I1);
    }
    public void row3click(View view)
    {
        Intent I1 =new Intent(this,SearchClass_Instructions_ExpandedView.class);
        I1.putExtra("ImgID",R.drawable.lhwest_elevator_3);
        I1.putExtra("Text","Take Left ");
        I1.putExtra("Title","lhwest_elevator");
        startActivity(I1);
    }
    public void row4click(View view)
    {
        Intent I1 =new Intent(this,SearchClass_Instructions_ExpandedView.class);
        I1.putExtra("ImgID",R.drawable.lhwest_elevator_4);
        I1.putExtra("Text","Walk Straight towards the exit");
        I1.putExtra("Title","lhwest_elevator");
        startActivity(I1);
    }
    public void row5click(View view)
    {
        Intent I1 =new Intent(this,SearchClass_Instructions_ExpandedView.class);
        I1.putExtra("ImgID",R.drawable.lhwest_elevator_5);
        I1.putExtra("Text","At the Exit take left");
        I1.putExtra("Title","lhwest_elevator");
        startActivity(I1);
    }
    public void row6click(View view)
    {
        Intent I1 =new Intent(this,SearchClass_Instructions_ExpandedView.class);
        I1.putExtra("ImgID",R.drawable.lhwest_elevator_6);
        I1.putExtra("Text","Walk Straight towards the elevator");
        I1.putExtra("Title","lhwest_elevator");
        startActivity(I1);
    }
    public void row7click(View view)
    {
        Intent I1 =new Intent(this,SearchClass_Instructions_ExpandedView.class);
        I1.putExtra("ImgID",R.drawable.lhwest_elevator_7);
        I1.putExtra("Text","Do you see the phone at the right ?");
        I1.putExtra("Title","lhwest_elevator");
        startActivity(I1);
    }
    public void row8click(View view)
    {
        Intent I1 =new Intent(this,SearchClass_Instructions_ExpandedView.class);
        I1.putExtra("ImgID",R.drawable.lhwest_elevator_8);
        I1.putExtra("Text","Your Elevator is at the right");
        I1.putExtra("Title","lhwest_elevator");
        startActivity(I1);
    }

}
