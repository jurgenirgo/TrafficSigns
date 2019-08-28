package jere.example.trafficsigns;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Bermain extends Activity {
    RadioGroup radioGroup;
    RadioButton answer1, answer2, answer3, answer4;
    ImageView imageView;
    Button btnNext;

    ArrayList<ArrayModel> list;

    int image = 0;
    String jawaban = null;
    String pilihan_1 = null;
    String pilihan_2 = null;
    String pilihan_3 = null;

    int urutan = 0;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bermain);

        imageView = findViewById(R.id.imageView);
        radioGroup = findViewById(R.id.radioGroup);
        answer1 = findViewById(R.id.rbJawaban1);
        answer2 = findViewById(R.id.rbJawaban2);
        answer3 = findViewById(R.id.rbJawaban3);
        answer4 = findViewById(R.id.rbJawaban4);
        btnNext = findViewById(R.id.btnNext);

        list = Array.getDataSoal();

        String[] arr = new String[]{
                list.get(urutan).getJawaban(),
                list.get(urutan).getPilihan_1(),
                list.get(urutan).getPilihan_2(),
                list.get(urutan).getPilihan_3()
        };

        Collections.shuffle(Arrays.asList(arr));

        answer1.setText(arr[0]);
        answer2.setText(arr[1]);
        answer3.setText(arr[2]);
        answer4.setText(arr[3]);

        imageView.setImageDrawable(getResources().getDrawable(list.get(urutan).getGambar(), null));

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (radioGroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(Bermain.this, "silahkan pilih!", Toast.LENGTH_SHORT).show();
                } else {

                    String answer = null;

                    switch (radioGroup.getCheckedRadioButtonId()) {
                        case R.id.rbJawaban1:
                            answer = answer1.getText().toString();
                            break;
                        case R.id.rbJawaban2:
                            answer = answer2.getText().toString();
                            break;
                        case R.id.rbJawaban3:
                            answer = answer3.getText().toString();
                            break;
                        case R.id.rbJawaban4:
                            answer = answer4.getText().toString();
                            break;
                    }

                    if (list.get(urutan).getJawaban().equals(answer)) {
                        score++;
                        lanjutSoal();
                    } else {
                        lanjutSoal();
                    }
                }
            }
        });
    }

    public void lanjutSoal() {
        urutan++;

        radioGroup.clearCheck();

        if (urutan == Array.getDataSoal().size()) {
            startActivity(new Intent(Bermain.this, Hasil.class)
                    .putExtra("HASIL", String.valueOf(String.valueOf(score * 10) + " / " + String.valueOf(urutan * 10)))
                    .putExtra("SCORE", score * 10)
                    .putExtra("isFinish", true)
            );
        } else {
            String[] arr = new String[]{
                    list.get(urutan).getJawaban(),
                    list.get(urutan).getPilihan_1(),
                    list.get(urutan).getPilihan_2(),
                    list.get(urutan).getPilihan_3()
            };

            Collections.shuffle(Arrays.asList(arr));

            imageView.setImageDrawable(getResources().getDrawable(list.get(urutan).getGambar(), null));
            answer1.setText(arr[0]);
            answer2.setText(arr[1]);
            answer3.setText(arr[2]);
            answer4.setText(arr[3]);
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(Bermain.this, MainActivity.class);
        startActivity(intent);
    }
}
