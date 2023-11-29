package com.example.thuchanh2.Bai1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TimePicker;

import com.example.thuchanh2.R;

public class TimeSelection extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_selection);

        doWork();
    }

    public void doWork(){
        Button b1 = findViewById(R.id.btnAnalogClock);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnalogClock analogClock = new AnalogClock(TimeSelection.this);
                ((LinearLayout) findViewById(R.id.mylayout)).addView(analogClock);
            }
        });

        Button b2 = findViewById(R.id.btnChronometer);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Chronometer chronometer
                         = new Chronometer(TimeSelection.this);
                ((LinearLayout) findViewById(R.id.mylayout)).addView(chronometer);
            }
        });

        Button b3 = findViewById(R.id.btnTimePicker);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog.OnTimeSetListener callback = new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        ((TextView) findViewById(R.id.txtdate)).setText(hourOfDay + " - " + minute +"@@@"+ view.getCurrentHour() + " - " + view.getCurrentMinute());
                    }
                };
                TimePickerDialog time = new TimePickerDialog(TimeSelection.this, callback, 11, 30, true);
                time.show();
            }
        });

        Button b4 = findViewById(R.id.btnDatePickerDialog);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog.OnDateSetListener callback = new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        ((TextView) findViewById(R.id.txtdate)).setText((dayOfMonth+1) + "/" +
                                (month +1) +"/" + year);
                    }
                };
                DatePickerDialog pic = new DatePickerDialog(TimeSelection.this, callback, 2012, 11, 30);
                pic.setTitle("My DateTime Picker");
                pic.show();
            }
        });
    }
}