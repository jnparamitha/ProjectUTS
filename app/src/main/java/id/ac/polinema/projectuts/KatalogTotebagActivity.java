package id.ac.polinema.projectuts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import id.ac.polinema.projectuts.fragments.KatalogMenFragment;
import id.ac.polinema.projectuts.fragments.KatalogWomenFragment;

public class KatalogTotebagActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_katalog_totebag);
    }

}
