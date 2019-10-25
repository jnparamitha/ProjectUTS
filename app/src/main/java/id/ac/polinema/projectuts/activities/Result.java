package id.ac.polinema.projectuts.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import id.ac.polinema.projectuts.MainActivity;
import id.ac.polinema.projectuts.R;

public class Result extends AppCompatActivity {

    private TextView namaText;
    private TextView warnaText;
    private TextView ukuranText;
    private TextView komentarText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        namaText=findViewById(R.id.nama);
        warnaText=findViewById(R.id.warna);
        ukuranText=findViewById(R.id.ukuran);
        komentarText=findViewById(R.id.komentar);

        Bundle extras = getIntent().getExtras();
        if (extras != null)
        {
            String nama = extras.getString("nama_key");
            String warna = extras.getString("warna_key");
            String ukuran = extras.getString("ukuran_key");
            String komentar = extras.getString("komentar_key");


            namaText.setText(nama);
            warnaText.setText(warna);
            ukuranText.setText(ukuran);
            komentarText.setText(komentar);
        }
    }

    public void handleBack3(View view) {
        Intent intent = new Intent(this, KatalogBajuActivity.class);
        startActivity(intent);
    }
}
