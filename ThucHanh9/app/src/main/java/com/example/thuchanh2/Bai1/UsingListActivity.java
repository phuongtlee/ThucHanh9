package com.example.thuchanh2.Bai1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.thuchanh2.R;

public class UsingListActivity extends ListActivity {

    TextView selection;
    String[] items = {"this", "is", "a", "really", "really1","really2", "really3", "really4", "really5", "silly", "list" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_using_list);

        final Button button = (Button) findViewById(R.id.btnBack1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,items));

        selection = (TextView) findViewById(R.id.selection);

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        String text = "position:" + position + " " + items[position];
        selection.setText(text);
    }
}