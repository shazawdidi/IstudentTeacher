package com.tztechs.teacher.UI.Activates;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.tztechs.teacher.R;
import com.tztechs.teacher.UI.Fragments.PhoneFragment;

import java.util.Objects;


public class LoginActivity extends AppCompatActivity {



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.loginFragmentHolder,new PhoneFragment());
        ft.commit();
    }
}
