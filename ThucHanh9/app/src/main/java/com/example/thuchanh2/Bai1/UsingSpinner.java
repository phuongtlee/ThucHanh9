package com.example.thuchanh2.Bai1;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.thuchanh2.R;

public class UsingSpinner extends Activity {

    String arr[] = {"Hàng điện tử", "Hàng hóa chất", "Hàng gia dụng"};
    TextView selection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_using_spinner);

        Spinner spinner = (Spinner) findViewById(R.id.spinner1);
        selection = (TextView) findViewById(R.id.selection_spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arr);

        adapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selection.setText(arr[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                selection.setText("");
            }
        });

        final Button button = (Button) findViewById(R.id.btnBack3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}