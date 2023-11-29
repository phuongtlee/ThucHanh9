package com.example.thuchanh2.Bai1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.example.thuchanh2.R;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_activity);

        final TextView txtChon = (TextView) findViewById(R.id.txtselection);
        final ArrayList<String> list = new ArrayList<String>();
        final EditText txtTen = (EditText) findViewById(R.id.txtTen);
        final ListView lv = (ListView) findViewById(R.id.lvperson);
        final Button btn = (Button) findViewById(R.id.btnNhap);
        final Button btnBack = (Button) findViewById(R.id.btnBack);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
        lv.setAdapter(adapter);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list.add(txtTen.getText() + "");
                adapter.notifyDataSetChanged();
            }
        });

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                txtChon.setText("position :" + position + " ; value = " + list.get(position));
            }
        });
    }
}