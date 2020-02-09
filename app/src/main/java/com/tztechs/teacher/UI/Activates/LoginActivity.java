package com.tztechs.teacher.UI.Activates;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.tztechs.teacher.R;
import com.tztechs.teacher.UI.Fragments.OTPFragment;
import com.tztechs.teacher.UI.Fragments.PhoneFragment;

import java.util.Objects;


public class LoginActivity extends AppCompatActivity implements PhoneFragment.Communicator{

    ViewPager2 viewPager;
    private static final String TAG = "LoginActivity";
    FragmentTransaction ft;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        viewPager=findViewById(R.id.pager);
    }

    @Override
    public void onClick() {
//        ft.add(R.id.loginFragmentHolder,new OTPFragment());
//        getSupportFragmentManager().beginTransaction().commit();
        Log.i(TAG,"called");

    }
}
