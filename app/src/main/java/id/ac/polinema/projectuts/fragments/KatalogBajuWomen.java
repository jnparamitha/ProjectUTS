package id.ac.polinema.projectuts.fragments;


import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import id.ac.polinema.projectuts.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link KatalogBajuWomen#newInstance} factory method to
 * create an instance of this fragment.
 */
public class KatalogBajuWomen extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    public static final String nama_key = "nama";
    public static final String warna_key = "warna";
    public static final String ukuran_key = "ukuran";
    public static final String komentar_key = "komentar";

    // TODO: Rename and change types of parameters
    private String nama_bj;
    private String warna_bj;
    private String ukuran_bj;
    private String komentar_bj;


    public KatalogBajuWomen() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param nama   Parameter 1.
     * @param warna  Parameter 2.
     * @param ukuran Parameter 2.
     * @return A new instance of fragment KatalogBajuWomen.
     */
    // TODO: Rename and change types and number of parameters
    public static KatalogBajuWomen newInstance(String nama, String warna, String ukuran, String komentar) {
        KatalogBajuWomen fragment = new KatalogBajuWomen();
        Bundle args = new Bundle();
        args.putString(nama_key, nama);
        args.putString(warna_key, warna);
        args.putString(ukuran_key, ukuran);
        args.putString(komentar_key, komentar);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            nama_bj = getArguments().getString(nama_key);
            warna_bj = getArguments().getString(warna_key);
            ukuran_bj = getArguments().getString(ukuran_key);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_katalog_baju_women, container, false);
        TextView nama_otp = view.findViewById(R.id.nama);
        TextView warna_otp = view.findViewById(R.id.warna);
        TextView ukuran_otp = view.findViewById(R.id.ukuran);
        nama_otp.setText("Nama Baju : " + nama_bj);
        warna_otp.setText("Warna Baju : " + warna_bj);
        ukuran_otp.setText("Ukuran Baju Tersedia : " + ukuran_bj);
        return view;
    }
}
