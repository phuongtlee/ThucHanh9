package com.example.thuchanh2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.thuchanh2.Bai1.ContextMenu;
import com.example.thuchanh2.Bai1.ListViewActivity;
import com.example.thuchanh2.Bai1.TabSelector;
import com.example.thuchanh2.Bai1.UsingListActivity;
import com.example.thuchanh2.Bai1.UsingSpinner;
import com.example.thuchanh2.Bai1.WidgetGridView;
import com.example.thuchanh2.Bai2File.MainActivityDataBase;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnBai1Main, btnBai1, btnBai2, btnListActivity, btnUsingSpinner, btnGridview, btnTabSelector, btnContextMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBai2 = findViewById(R.id.btn_bai2);
        btnBai1Main = findViewById(R.id.btn_bai1_main);

        btnBai2.setOnClickListener(this);
        btnBai1Main.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.btn_bai1_main){
            Intent intent = new Intent(this, Bai1Main.class);
            startActivity(intent);
        } else if (id == R.id.btn_bai2){
            Intent intent = new Intent(this, MainActivityDataBase.class);
            startActivity(intent);
        }
    }
}