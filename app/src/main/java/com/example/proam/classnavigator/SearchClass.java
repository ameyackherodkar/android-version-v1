package com.example.proam.classnavigator;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import static com.example.proam.classnavigator.R.array.SourceSpinnerArray;
import static com.example.proam.classnavigator.R.array.DestinationSpinnerArray;

public class SearchClass extends AppCompatActivity {
    String Source,Destination;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchclass);
        final Button _btnGo = (Button)findViewById(R.id.btnGo);
        final Spinner sourcespinner=(Spinner)findViewById(R.id.sourcespinner);
        final Spinner destinationspinner=(Spinner)findViewById(R.id.destinationspinner);

        //Setting up for source spinner array
        ArrayAdapter<CharSequence> sourceAdapter = ArrayAdapter.createFromResource(this,
                R.array.SourceSpinnerArray, android.R.layout.simple_spinner_item);
        sourceAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sourcespinner.setAdapter(sourceAdapter);

        //Setting up for destination spinner array
        final ArrayAdapter<CharSequence> destinationAdapter = ArrayAdapter.createFromResource(this,
                R.array.DestinationSpinnerArray, android.R.layout.simple_spinner_item);
        sourceAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        destinationspinner.setAdapter(destinationAdapter);

        /* keep button disable when source or destination is not selected on btn selected */
        /*if(destinationspinner.getSelectedItemPosition()==0 || sourcespinner.getSelectedItemPosition()==0)
        {
             _btnGo.setEnabled(false);
        }*/

        //validation for source = destination
        sourcespinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    _btnGo.setEnabled(false);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        destinationspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    _btnGo.setEnabled(false);
                }
               if (position > 0)
               {

                   if(sourcespinner.getSelectedItem().toString()== destinationspinner.getSelectedItem().toString())
                   {
                       Toast.makeText(getBaseContext(),"Source and Destination cannot be same",Toast.LENGTH_LONG).show();
                       _btnGo.setEnabled(false);
                   }
                   else
                   {
                       Source=sourcespinner.getSelectedItem().toString();
                       Destination=destinationspinner.getSelectedItem().toString();
                       _btnGo.setEnabled(true);
                   }
               }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        _btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StartSearchClass(sourcespinner.getSelectedItem().toString(),destinationspinner.getSelectedItem().toString());
            }
        });


    }
    public void StartSearchClass(String source , String destination)
    {
        Intent intent;
        if(source.equals("Lecture Hall West") && destination.equals("Elevator"))
        {
            intent=new Intent(this,SearchClass_Instructions_LHW_Elevator.class);
            startActivity(intent);
        }
        else if(source.equals("Lecture Hall West") && destination.equals("Cafeteria"))
        {
            intent=new Intent(this,SearchClass_Instructions_LHW_Cafeteria.class);
            startActivity(intent);
        }
        else if(source.equals("Elevator") && destination.equals("Lecture Hall West"))
        {
            intent=new Intent(this,SearchClass_Instructions_Elevator_LHW.class);
            startActivity(intent);
        }
        else if(source.equals("Cafeteria") && destination.equals("Lecture Hall West"))
        {
            intent=new Intent(this,SearchClass_Instructions_Cafeteria_LHW.class);
            startActivity(intent);
        }


    }





}
