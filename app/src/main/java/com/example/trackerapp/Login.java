package com.example.trackerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Login extends AppCompatActivity {

    EditText etNumber;
    //FirebaseDatabase database = FirebaseDatabase.getInstance();
    //DatabaseReference myRef = database.getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etNumber=findViewById(R.id.EDTNumber);
    }

    public void BuNext(View view) {

        GlobalInfo.PhoneNumber=GlobalInfo.FormatPhoneNumber(etNumber.getText().toString());
        GlobalInfo.UpdatesInfo(GlobalInfo.PhoneNumber);
        finish();
        Intent intent=new Intent(this,MyTrackers.class);
        startActivity(intent);


    }
}
