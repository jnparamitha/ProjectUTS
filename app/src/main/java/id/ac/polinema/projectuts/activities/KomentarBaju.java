package id.ac.polinema.projectuts.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Toast;

import id.ac.polinema.projectuts.R;
import id.ac.polinema.projectuts.fragments.KatalogBajuWomen;
import id.ac.polinema.projectuts.fragments.KatalogWomenFragment;

public class KomentarBaju extends AppCompatActivity {

    private String warna,nama,ukuran;
    private int id;
    private KatalogBajuWomen katalogBajuWomen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komentar_baju);
        Bundle extras = getIntent().getExtras();
        if(extras != null){
            warna = extras.getString("warna_key");
            nama = extras.getString("nama_key");
            ukuran = extras.getString("ukuran_key");
            FragmentTransaction fragment;
                fragment = getSupportFragmentManager().beginTransaction();
                fragment.replace(R.id.komentar,new KatalogBajuWomen().newInstance(nama,warna,ukuran)).commit();
        }
    }
}
