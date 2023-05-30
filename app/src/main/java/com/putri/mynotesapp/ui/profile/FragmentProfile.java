package com.putri.mynotesapp.ui.profile;

/*
 * NIM : 10120040
 *Nama : Putri Silva Amrillah
 *Kelas : IF1
 *Email : putri.10120040@mahasiswa.unikom.ac.id
 * */


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.putri.mynotesapp.DialogAbout;
import com.putri.mynotesapp.R;

import androidx.fragment.app.Fragment;

public class FragmentProfile extends Fragment {
    ImageView Instagram, Whatsapp, Telegram, Gmail, Github, Linkedin, Maps;
    TextView Abouts;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_profile, container, false);


        Abouts = root.findViewById(R.id.about);



        Abouts.setOnClickListener(view -> {
            DialogAbout DialogAbout = new DialogAbout();
            DialogAbout.show(requireFragmentManager(),"Putri Silva Amrillah");
        });

        return root;
    }
}

