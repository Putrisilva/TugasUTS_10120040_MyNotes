package com.putri.mynotesapp;

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

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import androidx.fragment.app.DialogFragment;

public class DialogAbout extends DialogFragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.about,container,false);
    }
}
