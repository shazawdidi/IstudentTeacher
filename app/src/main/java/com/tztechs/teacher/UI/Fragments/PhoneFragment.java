package com.tztechs.teacher.UI.Fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;


import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

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
    Communicator communicator;
    private Context context;
    private String TAG = "PhoneFragment";

    public static PhoneFragment newInstance(String param1, String param2) {
        PhoneFragment fragment = new PhoneFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_phone, container, false);
        communicator = (Communicator) context;
        initComponent();
        return view;
    }

    private void initComponent() {
        Log.i(TAG, "init");
        login = view.findViewById(R.id.login);
        login.setOnClickListener(e -> {
            Log.i(TAG, "click");
            ApiClient.getClient(ApiClient.BASE_URL).create(NetworkApis.class).requsteOtp("").enqueue(new Callback<BaseResponce>() {
                @Override
                public void onResponse(Call<BaseResponce> call, Response<BaseResponce> response) {
                    communicator.onClick();
                    Log.i(TAG, "onResponse");
                }

                @Override
                public void onFailure(Call<BaseResponce> call, Throwable t) {
                    communicator.onClick();
                    Log.i(TAG, "onFailure");

                }
            });
        });
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }


    @Override
    public void onDetach() {
        super.onDetach();
    }

    public interface Communicator {
        public void onClick();
    }

}
