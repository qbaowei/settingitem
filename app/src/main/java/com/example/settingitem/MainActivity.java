package com.example.settingitem;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.qbw.settingitem.NumberView;
import com.qbw.settingitem.VerticalSettingItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VerticalSettingItem vis = findViewById(R.id.vsi);
        NumberView numberView = vis.getNumberView();

        numberView.setNumber(10);
        numberView.setTextColor(Color.parseColor("#aa0000"));

        NumberView numberView1 = findViewById(R.id.nv111);
        numberView1.setNumber(10);
    }
}
