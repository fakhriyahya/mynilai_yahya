package com.example.mynilai_muhammadfakhriyahya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Halaman_Input_Bobot extends AppCompatActivity {
    Button login3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_input_bobot);
        login3=(Button) findViewById(R.id.login3);

        login3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Halaman_Input_Bobot.this,Halaman_lihat_Hasil.class);
                startActivity(intent);
            }
        });
    }
}