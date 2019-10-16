package id.ac.polinema.projectuts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import id.ac.polinema.projectuts.activities.KomentarBaju;
import id.ac.polinema.projectuts.fragments.KatalogBajuWomen;
import id.ac.polinema.projectuts.fragments.KatalogMenFragment;
import id.ac.polinema.projectuts.fragments.KatalogWomenFragment;

public class KatalogBajuActivity extends AppCompatActivity {

    public  static final String nama_key = "nama";
    public  static final String warna_key = "warna";
    public  static final String ukuran_key = "ukuran";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_katalog_baju);
    }

    public void handlerClickWomen(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        KatalogWomenFragment katalogWomenFragment = (KatalogWomenFragment) getSupportFragmentManager().findFragmentByTag("KATALOG_WOMEN_FRAGMENT");
        if (katalogWomenFragment != null && katalogWomenFragment.isVisible()) {
            fragmentTransaction.commit();
        } else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.KatalogBaju, new KatalogWomenFragment(), "KATALOG_WOMEN_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void handlerClickMen(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        KatalogMenFragment katalogMenFragment = (KatalogMenFragment) getSupportFragmentManager().findFragmentByTag("KATALOG_MEN_FRAGMENT");
        if (katalogMenFragment != null && katalogMenFragment.isVisible()) {
            fragmentTransaction.commit();
        } else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.KatalogBaju, new KatalogMenFragment(), "KATALOG_MEN_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void handleBaju1(View view) {
        Bundle bundle = new Bundle();
        bundle.putString("nama_key","Baju a");
        bundle.putString("warna_key","Cream a");
        bundle.putString("ukuran_key","XL a");

        Intent i = new Intent(this, KomentarBaju.class);
        i.putExtras(bundle);
        startActivity(i);
    }

    public void handleBaju2(View view) {
        Bundle bundle = new Bundle();
        bundle.putString("nama_key","Baju ");
        bundle.putString("warna_key","Biru ");
        bundle.putString("ukuran_key","L ");

        Intent i = new Intent(this, KomentarBaju.class);
        i.putExtras(bundle);
        startActivity(i);
    }

    public void handleMen1(View view) {
        Bundle bundle = new Bundle();
        bundle.putString("nama_key","Baju laki ");
        bundle.putString("warna_key","Hitam ");
        bundle.putString("ukuran_key","L ");

        Intent i = new Intent(this, KomentarBaju.class);
        i.putExtras(bundle);
        startActivity(i);
    }
}
