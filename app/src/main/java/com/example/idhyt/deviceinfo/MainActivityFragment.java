package com.example.idhyt.deviceinfo;

import android.content.Intent;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.idhyt.deviceinfo.ui.CPUActivity;
import com.example.idhyt.deviceinfo.ui.GPUActivity;
import com.example.idhyt.deviceinfo.ui.MiscActivity;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View fragment_view = inflater.inflate(R.layout.fragment_main, container, false);

        View v_btn_cpu = fragment_view.findViewById(R.id.btn_cpu);

        v_btn_cpu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivityFragment.this.startActivity(new Intent(
                        MainActivityFragment.this.getActivity(), CPUActivity.class
                ));
            }
        });

        View v_btn_gpu = fragment_view.findViewById(R.id.btn_gpu);
        v_btn_gpu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivityFragment.this.startActivity(new Intent(
                        MainActivityFragment.this.getActivity(), GPUActivity.class
                ));
            }
        });


        View v_btn_misc = fragment_view.findViewById(R.id.btn_misc);
        v_btn_misc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivityFragment.this.startActivity(new Intent(
                        MainActivityFragment.this.getActivity(), MiscActivity.class
                ));
            }
        });
        return fragment_view;
    }
}
