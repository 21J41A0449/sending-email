package com.example.sendingemail;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button send;
    EditText address,message,subject;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        address = findViewById(R.id.edittextmail);
        message = findViewById(R.id.editTextmessage);
        subject = findViewById(R.id.editTextsubject);
        send = findViewById(R.id.button);
        send.setOnClickListener((v) -> {
            String useraddress = address.getText().toString();
            String userMessage = message.getText().toString();
            String usersubject = subject.getText().toString();
        });

    }
    public void sendEmail(String userAddress, String userSubject, String userMessage)
    {
        String[] emailAddress = {userAddress};
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setData(Uri.parse("mailto"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL,emailAddress);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT,userSubject);
        emailIntent.putExtra(Intent.EXTRA_TEXT,userMessage);
        startActivity(Intent.createChooser(emailIntent, "email send"));

    }
}