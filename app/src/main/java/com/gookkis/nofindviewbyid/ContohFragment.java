package com.gookkis.nofindviewbyid;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gookkis.nofindviewbyid.databinding.FragmentContohBinding;


public class ContohFragment extends Fragment {

    public ContohFragment() {
        // Required empty public constructor
    }

    public static ContohFragment newInstance() {
        ContohFragment fragment = new ContohFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final FragmentContohBinding binding = DataBindingUtil.inflate(inflater,
                R.layout.fragment_contoh, container, false);

        binding.btnGantiFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.textFragment.setText("Ganti Text Fragment");
            }
        });

        return binding.getRoot();
    }


}
