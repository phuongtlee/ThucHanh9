package com.example.thuchanh2.Bai1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.thuchanh2.R;

public class ContextMenu extends AppCompatActivity {

    Button btn1, btn2, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_menu);

        btn1 = findViewById(R.id.btnctmnu1);
        btn2 = findViewById(R.id.btnctmnu2);
        btnBack = findViewById(R.id.btnBack4);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        registerForContextMenu(btn1);
        registerForContextMenu(btn2);
    }

    @Override
    public void onCreateContextMenu(android.view.ContextMenu menu, View v, android.view.ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        if (v.getId() == R.id.btnctmnu1){
            getMenuInflater().inflate(R.menu.contextmenu1, menu);
        } else if (v.getId() == R.id.btnctmnu2) {
            contextmenu2(menu);
        }
    }

    public void contextmenu2(Menu menu){
        int groupId = 1;
        menu.add(groupId, 113, 0, "Red");
        menu.add(groupId, 114, 1, "Green");
        menu.add(groupId, 115, 2, "Blue");
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        Typeface typeface = ResourcesCompat.getFont(this, R.font.arial);
        int id = item.getItemId();
        if (id == R.id.mnubold){
            btn1.setTypeface(typeface, Typeface.BOLD);
        } else if (id == R.id.mnuitalic){
            btn1.setTypeface(typeface, Typeface.ITALIC);
        } else if (id == R.id.mnuunderline){
            SpannableString string = new SpannableString(btn1.getText().toString());
            string.setSpan(new UnderlineSpan(), 0, string.length(), 0);
            btn1.setText(string);
        } else if (id == 113){
            btn2.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
        } else if (id == 114){
            btn2.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        } else if (id == 115){
            btn2.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_dark));
        }
        return super.onContextItemSelected(item);
    }
}