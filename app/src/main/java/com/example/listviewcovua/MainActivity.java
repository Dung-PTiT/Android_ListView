package com.example.listviewcovua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.DataSetObserver;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ArrayList<QuanCo> quanCoArrayList = new ArrayList();
        quanCoArrayList.add(new QuanCo("Q1", "C1"));
        quanCoArrayList.add(new QuanCo("Q2", "C2"));
        quanCoArrayList.add(new QuanCo("Q3", "C3"));
        quanCoArrayList.add(new QuanCo("Q4", "C4"));
        final String[] tenQuanCo = {"Q1", "Q2", "Q3", "Q4"};
        // Bước 2: Khởi tạo đối tượng ArrayAdapter
        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, tenQuanCo);
        // Bước 3: Gắn ArrayAdapter vào ListView
        final ListView lvDemo = (ListView) findViewById(R.id.listViewQuanCo);
        lvDemo.setAdapter(aa);
        // Bước 4: Xử lý sự kiện long click
        lvDemo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                String data = (String) tenQuanCo[i];
                for (QuanCo qc : quanCoArrayList) {
                    if (qc.getTen().equals(data)) {
                        String ten = qc.getTen();
                        String cachChoi = qc.getCachChoi();
                        Intent intent = new Intent(MainActivity.this, ChiTietQuanCoActivity.class);
                        intent.putExtra("ten", ten);
                        intent.putExtra("cachChoi", cachChoi);
                        startActivity(intent);
                        Toast.makeText(MainActivity.this, qc.getTen() + "\n" + qc.getCachChoi(), Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
