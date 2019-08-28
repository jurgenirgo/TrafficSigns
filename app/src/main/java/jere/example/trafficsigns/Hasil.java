package jere.example.trafficsigns;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Hasil extends Activity {

    TextView txtHasil;
    TextView txtHighschool;
    Button btn_back_home;

    TinyDB tinyDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        txtHasil = findViewById(R.id.txtHasil);
        txtHighschool = findViewById(R.id.txtHighscore);
        btn_back_home = findViewById(R.id.btn_back_home_hasil);

        btn_back_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        boolean hasil = getIntent().getBooleanExtra("isFinish", false);
        int highscore = getIntent().getIntExtra("SCORE", 0);

        tinyDB = new TinyDB(getBaseContext());

        if (tinyDB.getInt("HIGHSCORE") == 0) {
            txtHighschool.setText(String.valueOf(highscore));
            tinyDB.putInt("HIGHSCORE", highscore);
            txtHighschool.setVisibility(View.GONE);
        } else {
            if (highscore > tinyDB.getInt("HIGHSCORE")) {
                tinyDB.putInt("HIGHSCORE", highscore);
                txtHighschool.setText("Hasil Terbaik : " + tinyDB.getInt("HIGHSCORE"));
            } else {
                txtHighschool.setText("Hasil Terbaik : " + tinyDB.getInt("HIGHSCORE"));
            }
        }

        if (hasil) {
            txtHasil.setText("Hasil : " + getIntent().getStringExtra("HASIL"));
        } else {
            txtHasil.setText("JAWABAN SALAH\nSCORE : " + getIntent().getStringExtra("HASIL"));
        }

        findViewById(R.id.btnCobaLagi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Hasil.this, Bermain.class));
            }
        });

        Font font = new Font(this);
        txtHasil.setTypeface(font.sourceSansProRegular());
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(Hasil.this, MainActivity.class);
        startActivity(intent);
    }
}
