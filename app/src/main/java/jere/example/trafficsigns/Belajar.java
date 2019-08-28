package jere.example.trafficsigns;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Belajar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar);

        ImageView Petunjuk=(ImageView) findViewById(R.id.btnPetunjuk);
        ImageView Peringatan=(ImageView) findViewById(R.id.btnPeringatan);
        ImageView Perintah=(ImageView) findViewById(R.id.btnPerintah);
        ImageView Larangan=(ImageView) findViewById(R.id.btnLarangan);
        ImageView Video=(ImageView) findViewById(R.id.btnVideo) ;


        Petunjuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(Belajar.this, Petunjuk.class);
                startActivity(int1);
            }
        });

        Peringatan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(Belajar.this, Peringatan.class);
                startActivity(int2);
            }
        });

        Perintah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3 = new Intent(Belajar.this, Perintah.class);
                startActivity(int3);
            }
        });

        Larangan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int4 = new Intent(Belajar.this, Larangan.class);
                startActivity(int4);
            }
        });

        Video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int5 = new Intent(Belajar.this, Video.class);
                startActivity(int5);
            }
        });

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            finish();

        return super.onOptionsItemSelected(item);
    }
}
