package com.example.anshul_bharath.projectfinale;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button calendarButton;
    private Button addButton;
    private Button eventsButton;
    private Button mapButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calendarButton = (Button) findViewById(R.id.calendarButton);
        calendarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCalendar();
            }
        });

        addButton = (Button) findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuickAdd();
            }
        });

        eventsButton = (Button) findViewById(R.id.eventsButton);
        eventsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEvents();
            }
        });

        mapButton = (Button) findViewById(R.id.eventsButton);
        mapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMap();
            }
        });


    }

    public void openCalendar() {
        Intent intent = new Intent(this, Calendar.class);
        startActivity(intent);

    }

    public void openQuickAdd() {
        Intent intent = new Intent(this, quickAdd.class);
        startActivity(intent);

    }

    public void openEvents() {
        Intent intent = new Intent(this, Events.class);
        startActivity(intent);

    }

    public void openMap() {
        Intent intent = new Intent(this, Map.class);
        startActivity(intent);

    }
}
