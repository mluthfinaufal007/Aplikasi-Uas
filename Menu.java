package com.example.asus.projekuas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {
    Button tutor, kredit, keluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        tutor = (Button) findViewById(R.id.apps);
        kredit = (Button) findViewById(R.id.about);
        keluar = (Button) findViewById(R.id.exit);

        tutor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu.this, Mulai.class);
                Menu.this.startActivity(intent);
            }
        });
        kredit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Menu.this, Credit.class);
                Menu.this.startActivity(intent2);
            }
        });
        keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
