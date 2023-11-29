package com.example.thuchanh2.Bai1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

import com.example.thuchanh2.R;

public class WidgetGridView extends Activity {

    String[] arr = {"Ipad", "Iphone", "New Ipad", "SamSung", "Nokia",
                    "Sony Ericson", "LG", "Q-Mobile", "HTC", "Blackberry",
                    "G Phone", "FPT - Phone", "HK Phone"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widget_grid_view);

        final TextView selection = (TextView) findViewById(R.id.selection_grid_view);
        final GridView gridView = (GridView) findViewById(R.id.gridView1);
        final Button button = (Button) findViewById(R.id.btnBack2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                selection.setText(arr[position]);
            }
        });
    }
}