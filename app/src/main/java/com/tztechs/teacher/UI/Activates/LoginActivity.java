package com.tztechs.teacher.UI.Activates;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.tztechs.teacher.R;
import com.tztechs.teacher.UI.Fragments.OTPFragment;
import com.tztechs.teacher.UI.Fragments.PhoneFragment;
import com.tztechs.teacher.UI.ViewPagerAdapter;

import java.util.Objects;


public class LoginActivity extends AppCompatActivity implements PhoneFragment.Communicator , OTPFragment.Communicator{

    ViewPager2 viewPager;
    private static final String TAG = "LoginActivity";
    FragmentTransaction ft;
    TextView tvPhoneNumber;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Log.i(TAG,"getLifecycle: "+getLifecycle().toString());
        viewPager=findViewById(R.id.pager);
        viewPager.setUserInputEnabled(false);
        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager(),getLifecycle(),2));
        tvPhoneNumber=findViewById(R.id.tvPhoneNumber);

    }

    @Override
    public void onClick() {
//        ft.add(R.id.loginFragmentHolder,new OTPFragment());
//        getSupportFragmentManager().beginTransaction().commit();
        Log.i(TAG,"called");
        viewPager.setCurrentItem(1);
    }

    @Override
    public void onPhoneNumberEntered(String phone) {
        tvPhoneNumber.setText("+249-"+phone);
    }

    @Override
    public void onBackPressed() {
        if (viewPager.getCurrentItem()>0){
            Snackbar.make((ConstraintLayout)findViewById(R.id.container),"Are you sure you wont to EXIT", BaseTransientBottomBar.LENGTH_LONG).setAction(
                    "Exit", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            myPack();
                        }
                    }
            ).setActionTextColor(getResources().getColor(R.color.orange)).show();
            return;
        }
        super.onBackPressed();
    }
    private void myPack(){
        super.onBackPressed();
    }

    @Override
    public void onOtpEntered(String otp) {
        tvPhoneNumber.getText().toString();
    }

    @Override
    public void updatePhoneNumber() {
        viewPager.setCurrentItem(0);
    }
}
