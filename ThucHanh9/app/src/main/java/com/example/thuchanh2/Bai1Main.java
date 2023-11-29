package com.example.thuchanh2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.thuchanh2.Bai1.AutoCompleteText;
import com.example.thuchanh2.Bai1.ContextMenu;
import com.example.thuchanh2.Bai1.ListViewActivity;
import com.example.thuchanh2.Bai1.TabSelector;
import com.example.thuchanh2.Bai1.TimeSelection;
import com.example.thuchanh2.Bai1.UsingListActivity;
import com.example.thuchanh2.Bai1.UsingSpinner;
import com.example.thuchanh2.Bai1.WidgetGridView;

public class Bai1Main extends AppCompatActivity implements View.OnClickListener {

    Button btnTimePicker,btnAutoComplete, btnBai1, btnListActivity, btnUsingSpinner, btnGridview, btnTabSelector, btnContextMenu, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1_main);

        btnBai1 = findViewById(R.id.btn_bai1);
        btnListActivity = findViewById(R.id.btn_extendsListActivity);
        btnUsingSpinner = findViewById(R.id.btn_using_spinner);
        btnGridview = findViewById(R.id.btn_using_gridview);
        btnTabSelector = findViewById(R.id.btn_tab_selector);
        btnContextMenu = findViewById(R.id.btn_context_menu);
        btnAutoComplete = findViewById(R.id.btn_autocomplete_text);
        btnTimePicker = findViewById(R.id.btn_time_picker);
        btnBack = findViewById(R.id.btnBack5);

        btnBai1.setOnClickListener(this);
        btnListActivity.setOnClickListener(this);
        btnUsingSpinner.setOnClickListener(this);
        btnGridview.setOnClickListener(this);
        btnTabSelector.setOnClickListener(this);
        btnContextMenu.setOnClickListener(this);
        btnBack.setOnClickListener(this);
        btnAutoComplete.setOnClickListener(this);
        btnTimePicker.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.btn_bai1){
            Intent intent = new Intent(this, ListViewActivity.class);
            startActivity(intent);
        } else if (id == R.id.btn_extendsListActivity) {
            Intent intent = new Intent(this, UsingListActivity.class);
            startActivity(intent);
        } else if (id == R.id.btn_using_spinner) {
            Intent intent = new Intent(this, UsingSpinner.class);
            startActivity(intent);
        } else if (id == R.id.btn_using_gridview) {
            Intent intent = new Intent(this, WidgetGridView.class);
            startActivity(intent);
        } else if (id == R.id.btn_tab_selector) {
            Intent intent = new Intent(this, TabSelector.class);
            startActivity(intent);
        }else if (id == R.id.btn_context_menu) {
            Intent intent = new Intent(this, ContextMenu.class);
            startActivity(intent);
        } else if (id == R.id.btn_autocomplete_text) {
            Intent intent = new Intent(this, AutoCompleteText.class);
            startActivity(intent);
        } else if (id == R.id.btn_time_picker) {
            Intent intent = new Intent(this, TimeSelection.class);
            startActivity(intent);
        } else if (id == R.id.btnBack5){
            finish();
        }
    }
}