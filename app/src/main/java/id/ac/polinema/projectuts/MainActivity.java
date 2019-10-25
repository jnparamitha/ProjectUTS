package id.ac.polinema.projectuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import id.ac.polinema.projectuts.activities.KatalogBajuActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handlerClickKatalogBaju(View view)
    {
        Intent intent = new Intent(this, KatalogBajuActivity.class);
        startActivity(intent);
    }

    public void handleExit(View view) {
        finish(); }
}
