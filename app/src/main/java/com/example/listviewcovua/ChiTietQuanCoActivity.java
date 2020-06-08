package com.example.listviewcovua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ChiTietQuanCoActivity extends AppCompatActivity {

    TextView tvTen, tvCachChoi;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet_quan_co);
        tvTen = findViewById(R.id.tvTen);
        tvCachChoi = findViewById(R.id.tvCachChoi);
        Intent intent = getIntent();
        String ten = intent.getStringExtra("ten");
        tvTen.setText(ten);
        String cachChoi = intent.getStringExtra("cachChoi");
        tvCachChoi.setText(cachChoi);
        if (ten.equals("Q1")) {
            imageView = findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.user);
        } else {
            Toast.makeText(ChiTietQuanCoActivity.this, "Không có ảnh", Toast.LENGTH_SHORT).show();

        }
    }
}
