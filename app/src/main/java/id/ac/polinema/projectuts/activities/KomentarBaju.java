package id.ac.polinema.projectuts.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import id.ac.polinema.projectuts.R;
import id.ac.polinema.projectuts.fragments.KatalogBajuWomen;
import id.ac.polinema.projectuts.fragments.KatalogWomenFragment;

public class KomentarBaju extends AppCompatActivity {

    private String warna, nama, ukuran, komentar;
    private KatalogBajuWomen katalogBajuWomen;

    public static final String nama_key = "nama";
    public static final String warna_key = "warna";
    public static final String ukuran_key = "ukuran";
    public static final String komentar_key = "komentar";


    private TextView namaInput;
    private TextView warnaInput;
    private TextView ukuranInput;
    private EditText komentarInput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komentar_baju);

//        komentarInput = (EditText)findViewById(R.id.komentar);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            warna = extras.getString("warna_key");
            nama = extras.getString("nama_key");
            ukuran = extras.getString("ukuran_key");
            komentar = extras.getString("komentar_key");
            FragmentTransaction fragment;
            fragment = getSupportFragmentManager().beginTransaction();
            fragment.replace(R.id.frame_out, new KatalogBajuWomen().newInstance(nama, warna, ukuran, komentar)).commit();
        }
    }

    public void handleKomentar(View view) {

        if (komentar != null) {
            KatalogBajuWomen katalogBajuWomen = (KatalogBajuWomen) getSupportFragmentManager().findFragmentById(R.id.frame_out);
            komentarInput = katalogBajuWomen.getView().findViewById(R.id.komentar);
            komentar = komentarInput.getText().toString();
            Bundle bundle = new Bundle();
            bundle.putString("nama_key", nama);
            bundle.putString("warna_key", warna);
            bundle.putString("ukuran_key", ukuran);
            bundle.putString("komentar_key", komentar);
            Intent i = new Intent(this, Result.class);
            i.putExtras(bundle);
            startActivity(i);
        }
        else {
            Toast.makeText(getApplicationContext(), "Komentar Harus Diisi", Toast.LENGTH_SHORT).show();
        }



    }
}
