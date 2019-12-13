package com.example.workshop1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Browse
        Button browse = findViewById(R.id.Browse);
        browse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.iss.nus.edu.sg/");
                Intent i = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(i);

            }
        });

        //Dial
        Button dial = findViewById(R.id.dial);
        dial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri urig = Uri.parse("tel:(+65)12345678");
                Intent g = new Intent(Intent.ACTION_DIAL,urig);
                startActivity(g);


            }
        });

        //Contact
        Button contact = findViewById(R.id.contacts);
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uric = Uri.parse("content://contacts/people");
                Intent c = new Intent(Intent.ACTION_VIEW,uric);
                startActivity(c);

            }
        });

        //Geolacation
        Button geo = findViewById(R.id.geo);
        geo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uril = Uri.parse("geo:1.296643,103.776398");
                Intent gl = new Intent(Intent.ACTION_VIEW,uril);
                startActivity(gl);
            }
        });


        //SMS
        Button sms = findViewById(R.id.sms);
        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uris = Uri.parse("smsto:12345678");
                Intent sms = new Intent(Intent.ACTION_SENDTO,uris);
                sms.putExtra("sms_body","Grab Coffee?");

                startActivity(sms);

            }
        });


        //Email
        Button email = findViewById(R.id.email);
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri urim = Uri.parse("mailto:someone@somewhere.com");
                Intent em = new Intent(Intent.ACTION_SENDTO,urim);
                em.putExtra(Intent.EXTRA_SUBJECT, "Yo!");
                em.putExtra(Intent.EXTRA_TEXT, "Want to grab lunch today?");
                startActivity(em);

            }
        });




    }


}
