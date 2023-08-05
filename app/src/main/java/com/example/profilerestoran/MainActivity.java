package com.example.profilerestoran;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView phoneButton = findViewById(R.id.phone);
        phoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = "085601557348";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNumber));
                startActivity(intent);
            }
        });

        ImageView emailButton = findViewById(R.id.email);
        emailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String emailAddress = "yoshinoya@gmail.com";
                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:" + emailAddress));
                startActivity(intent);
            }
        });

        ImageView locationButton = findViewById(R.id.location);
        locationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String latitude = "-6.985113892361878";
                String longitude = "110.40855189677741";
                String label = "Yoshinoya";
                String uriString = "geo:" + latitude + "," + longitude + "?q=" + latitude + "," + longitude + "(" + label + ")";
                Uri locationUri = Uri.parse(uriString);
                Intent intent = new Intent(Intent.ACTION_VIEW, locationUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

    }
}
