package com.example.thuchanh2.Bai1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.Toast;

import com.example.thuchanh2.R;

public class TabSelector extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_selector);

        final TabHost tab = (TabHost)  findViewById(android.R.id.tabhost);
        tab.setup();
        TabHost.TabSpec spec;
        spec = tab.newTabSpec("t1").setContent(R.id.tab1).setIndicator("1-Login");
        tab.addTab(spec);
        spec=tab.newTabSpec("t2").setContent(R.id.tab2).setIndicator("2-Help");
        tab.addTab(spec);
        tab.setCurrentTab(0);
        tab.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                String s = "Tab tag =" + tabId + "; index =" + tab.getCurrentTab();
                Toast.makeText(getApplicationContext(), s, Toast.LENGTH_LONG).show();
            }
        });
    }
}