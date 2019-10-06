package id.ac.polinema.projectuts.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.ac.polinema.projectuts.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class KatalogWomenFragment extends Fragment {


    public KatalogWomenFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_katalog_women, container, false);
    }

}
