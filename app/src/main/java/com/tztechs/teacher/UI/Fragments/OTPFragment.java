package com.tztechs.teacher.UI.Fragments;

import android.content.Context;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.alimuzaffar.lib.pin.PinEntryEditText;
import com.tztechs.teacher.NetWork.ApiClient;
import com.tztechs.teacher.NetWork.NetworkApis;
import com.tztechs.teacher.R;

import java.security.PublicKey;

public class OTPFragment extends Fragment {

    PinEntryEditText otpEntry;
    TextView tvUpdate;
    View view;
    private Context context;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view= inflater.inflate(R.layout.fragment_otp, container, false);
        initViews();
        return view;
    }

    private void initViews() {
        otpEntry= view.findViewById(R.id.otpEntry);
        tvUpdate=view.findViewById(R.id.tvUpdate);
        Communicator communicator=(Communicator)context;
        otpEntry.setOnPinEnteredListener(new PinEntryEditText.OnPinEnteredListener() {
            @Override
            public void onPinEntered(CharSequence str) {
//                ApiClient.getClient(ApiClient.BASE_URL).create(NetworkApis.class).varfiyOtp(str,)
                communicator.onOtpEntered(str.toString());
            }
        });
        tvUpdate.setOnClickListener(e->{
            communicator.updatePhoneNumber();
        });
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context=context;
    }

    public interface Communicator {
        public void onOtpEntered(String otp);
        public void updatePhoneNumber();
    }
}
