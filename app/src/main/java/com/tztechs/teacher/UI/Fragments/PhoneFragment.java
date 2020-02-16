package com.tztechs.teacher.UI.Fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;


import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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
    EditText phoneNumber;
    TextView tvPhoneNumber;

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
        phoneNumber=view.findViewById(R.id.phoneNumber);
        login.setOnClickListener(e -> {
            Log.i(TAG, "click");
            if (phoneNumber.getText().length()==9){
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
            }
        });
        phoneNumber.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Log.i(TAG,"new Text: "+charSequence);
                communicator.onPhoneNumberEntered(charSequence.toString());
            }
            @Override
            public void afterTextChanged(Editable editable) {}
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
        public void onPhoneNumberEntered(String phone);
    }

}
