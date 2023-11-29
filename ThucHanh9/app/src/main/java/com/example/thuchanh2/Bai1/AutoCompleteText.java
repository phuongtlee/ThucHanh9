package com.example.thuchanh2.Bai1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;

import com.example.thuchanh2.R;

public class AutoCompleteText extends Activity implements TextWatcher {

    TextView selection;
    AutoCompleteTextView autoCompleteTextView;
    String arr[] = {"hà nội", "huế", "Sài Gòn", "Hà giang", "Hội an", "Kiên Giang",
            "Lâm Đồng", "Long khánh"};

    MultiAutoCompleteTextView mul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_text);

        selection = findViewById(R.id.selection);
        autoCompleteTextView = findViewById(R.id.edit_auto);
        mul = findViewById(R.id.mul_edit_auto);
        mul.addTextChangedListener(this);
        autoCompleteTextView.addTextChangedListener(this);
        autoCompleteTextView.setAdapter(new ArrayAdapter<String>(this,
                            android.R.layout.simple_list_item_1, arr));
        mul.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr));
        mul.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
//        selection.setText(autoCompleteTextView.getText());
//        selection.setText(mul.getText());
    }

    @Override
    public void afterTextChanged(Editable s) {

    }
}