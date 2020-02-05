package com.tztechs.teacher.UI.Fragments;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.tztechs.teacher.Models.BaseResponce;
import com.tztechs.teacher.NetWork.ApiClient;
import com.tztechs.teacher.NetWork.NetworkApis;
import com.tztechs.teacher.R;
import com.tztechs.teacher.UI.Activates.BaseComponent;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class PhoneFragment extends Fragment {
Button login;
    View view;
    private Context context;
    public static PhoneFragment newInstance(String param1, String param2) {
        PhoneFragment fragment = new PhoneFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         view= inflater.inflate(R.layout.fragment_phone, container, false);
        initComponent();
        return view;
    }

    private void initComponent() {
        login=view.findViewById(R.id.login);
        login.setOnClickListener(e->{
            ApiClient.getClient(ApiClient.BASE_URL).create(NetworkApis.class).requsteOtp("").enqueue(new Callback<BaseResponce>() {
                @Override
                public void onResponse(Call<BaseResponce> call, Response<BaseResponce> response) {

                }

                @Override
                public void onFailure(Call<BaseResponce> call, Throwable t) {

                }
            });
        });
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context=context;
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

}
