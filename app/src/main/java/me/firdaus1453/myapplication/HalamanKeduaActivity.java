package me.firdaus1453.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HalamanKeduaActivity extends AppCompatActivity {

    // TODO 1 membuat variable untuk view
    private Button btn1,btn2;
    private TextView txt1,txt2;

    // membuat variable untuk nilai score
    int score1,score2;


    private static final String STATE_RESULT = "state_result";
    private static final String STATE_RESULT2 = "state_result2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_kedua);

        //TODO 2 mengisi variable view
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);

        // Membuat method/fungsi untuk klik pada button
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // membuat increment +1 untuk variable score1
                score1++;

                // Menampilkan nilai score1 ke dalam TextView txt1
                txt1.setText(String.valueOf(score1));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // membuat increment +1 untuk variable score1
                score2++;

                // Menampilkan nilai score1 ke dalam TextView txt1
                txt2.setText(String.valueOf(score2));
            }
        });

        if(savedInstanceState != null){
            // Mengambil nilai dari rotate
            String key1 = savedInstanceState.getString("key1");
            String key2 = savedInstanceState.getString("key1");

            // memasukkan nilai hasil rotate ke dalam variable score1 dan score2
            score1 =  Integer.valueOf(key1);
            score2 = Integer.valueOf(key2);

            // Menampilkan angka ke txt1 dan txt2
            txt1.setText(key1);
            txt2.setText(key2);
        }

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        // save data dari txt1 dan txt2 ke dalam key1 dan key2 pada saat rotate
        outState.putString("key1", txt1.getText().toString());
        outState.putString("key2", txt2.getText().toString());
        super.onSaveInstanceState(outState);
    }
}
