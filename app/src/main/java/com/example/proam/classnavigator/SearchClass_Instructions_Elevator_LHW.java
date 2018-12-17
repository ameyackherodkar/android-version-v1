package com.example.proam.classnavigator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SearchClass_Instructions_Elevator_LHW extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_class__instructions__elevator__lhw);
    }

    public void row1click(View view)
    {
        Intent I1 =new Intent(this,SearchClass_Instructions_ExpandedView.class);
        I1.putExtra("ImgID",R.drawable.elevator_lhwest_1);
        I1.putExtra("Text","turn left");
        I1.putExtra("Title","elevator_lhwest");
        startActivity(I1);
    }
    public void row2click(View view)
    {
        Intent I1 =new Intent(this,SearchClass_Instructions_ExpandedView.class);
        I1.putExtra("ImgID",R.drawable.elevator_lhwest_2);
        I1.putExtra("Text","Walk Straight");
        I1.putExtra("Title","elevator_lhwest");
        startActivity(I1);
    }
    public void row3click(View view)
    {
        Intent I1 =new Intent(this,SearchClass_Instructions_ExpandedView.class);
        I1.putExtra("ImgID",R.drawable.elevator_lhwest_3);
        I1.putExtra("Text","Take Right ");
        I1.putExtra("Title","elevator_lhwest");
        startActivity(I1);
    }
    public void row4click(View view)
    {
        Intent I1 =new Intent(this,SearchClass_Instructions_ExpandedView.class);
        I1.putExtra("ImgID",R.drawable.elevator_lhwest_4);
        I1.putExtra("Text","Walk Straight through the hallway");
        I1.putExtra("Title","elevator_lhwest");
        startActivity(I1);
    }
    public void row5click(View view)
    {
        Intent I1 =new Intent(this,SearchClass_Instructions_ExpandedView.class);
        I1.putExtra("ImgID",R.drawable.elevator_lhwest_5);
        I1.putExtra("Text","Turn Right");
        I1.putExtra("Title","elevator_lhwest");
        startActivity(I1);
    }
    public void row6click(View view)
    {
        Intent I1 =new Intent(this,SearchClass_Instructions_ExpandedView.class);
        I1.putExtra("ImgID",R.drawable.elevator_lhwest_6);
        I1.putExtra("Text","Walk Straight");
        I1.putExtra("Title","elevator_lhwest");
        startActivity(I1);
    }
    public void row7click(View view)
    {
        Intent I1 =new Intent(this,SearchClass_Instructions_ExpandedView.class);
        I1.putExtra("ImgID",R.drawable.elevator_lhwest_7);
        I1.putExtra("Text","your destination is on the right");
        I1.putExtra("Title","elevator_lhwest");
        startActivity(I1);
    }
    public void row8click(View view)
    {
        Intent I1 =new Intent(this,SearchClass_Instructions_ExpandedView.class);
        I1.putExtra("ImgID",R.drawable.elevator_lhwest_8);
        I1.putExtra("Text","Your Lecture Hall West is at the right");
        I1.putExtra("Title","elevator_lhwest");
        startActivity(I1);
    }

}
