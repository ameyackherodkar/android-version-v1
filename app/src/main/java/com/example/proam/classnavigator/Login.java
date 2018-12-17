package com.example.proam.classnavigator;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    SQLiteDatabase db;
    SQLiteOpenHelper openHelper;
    Button _btnLogin,_btnRegister;
    EditText _txtEmail, _txtPass;
    Cursor cursor;
    String userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        openHelper = new DatabaseHelper(this);
        db = openHelper.getReadableDatabase();
        _btnLogin = (Button) findViewById(R.id.btnLogin);
        _btnRegister=(Button)findViewById(R.id.btnRegister);
        _txtEmail = (EditText) findViewById(R.id.txtEmailID);
        _txtPass = (EditText) findViewById(R.id.txtPassword);

        _btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = _txtEmail.getText().toString();
                String password = _txtPass.getText().toString();
                cursor = db.rawQuery("select * from " + DatabaseHelper.TABLE_NAME + " WHERE " + DatabaseHelper.COL_5 + "=? AND " + DatabaseHelper.COL_4 + "=?",new  String[]{email,password});
                if(cursor !=null)
                {
                    if(cursor.getCount()>0)
                    {
                        cursor.moveToNext();
                        userName=cursor.getString(1);
                        //Toast.makeText(getApplicationContext(),"from login page username : " +userName,Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(getBaseContext(), Homepage.class);
                        intent.putExtra("username","Welcome "+userName);
                        startActivity(intent);
                        //return true;
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"error",Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
        _btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerintent = new Intent(getBaseContext(),MainActivity.class);

                startActivity(registerintent);
            }
        });
    }
}
