package com.example.yathra;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class HomePage extends AppCompatActivity {

    TextView txtTimetableHome, txtTrainHome, txtStationHome, txtTicketHome, calenderHome, txtStopWatch , aboutUs , help ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        txtTimetableHome = findViewById(R.id.txtTimetableHome);
        txtTrainHome = findViewById(R.id.txtTrainHome);
        txtStationHome = findViewById(R.id.txtStationHome);
        txtTicketHome = findViewById(R.id.txtTicketHome);
        calenderHome = findViewById(R.id.calenderHome);
        txtStopWatch = findViewById(R.id.txtStopWatch);
        aboutUs = findViewById(R.id.txtAboutUs);
        help = findViewById(R.id.help);


        txtStopWatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentWatch = new Intent(HomePage.this, StopWatchPage.class);
                startActivity(intentWatch);
            }
        });

        calenderHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentCalendar = new Intent(HomePage.this, calenderViewPage.class);
                startActivity(intentCalendar);
            }
        });


        txtTimetableHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_1 = new Intent(HomePage.this, TimetableHome.class);
                startActivity(intent_1);
            }
        });

        txtTrainHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_2 = new Intent(HomePage.this, TrainHome.class);
                startActivity(intent_2);
            }
        });

        txtTicketHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_4 = new Intent(HomePage.this, TicketHome.class);
                startActivity(intent_4);
            }
        });

        txtStationHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_3 = new Intent(HomePage.this, StationHome.class);
                startActivity(intent_3);
            }
        });

        aboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_4 = new Intent(HomePage.this, AboutUs.class);
                startActivity(intent_4);
            }
        });

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_5 = new Intent(HomePage.this, Help.class);
                startActivity(intent_5);
            }
        });


    }
}