package com.tztechs.teacher.UI.Fragments;

import android.content.Context;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.tztechs.teacher.R;

public class OTPFragment extends Fragment {

    TextView otp;
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_otp, container, false);
        initViews();
        return view;
    }

    private void initViews() {
        otp=view.findViewById(R.id.edtOtp);
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }




}
