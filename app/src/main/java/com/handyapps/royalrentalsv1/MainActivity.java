package com.handyapps.royalrentalsv1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button locationfinder,neareststore,problem,contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        locationfinder = (Button) findViewById(R.id.locationButton);
        problem = (Button) findViewById(R.id.problemButton);
        neareststore = (Button) findViewById(R.id.nearestStoreButton);
        contact = (Button) findViewById(R.id.contactButton);

        locationfinder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent locationIntent = new Intent(MainActivity.this,LocationFinder.class);
                startActivity(locationIntent);
            }
        });

        problem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent problemIntent = new Intent(MainActivity.this,Problem.class);
                startActivity(problemIntent);
            }
        });

        neareststore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nearestIntent = new Intent(MainActivity.this,NearestStore.class);
                startActivity(nearestIntent);
            }
        });

        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent contactIntent = new Intent(MainActivity.this,Contact.class);
                startActivity(contactIntent);
            }
        });

    }
}
