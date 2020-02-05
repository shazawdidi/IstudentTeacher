package com.tztechs.teacher.UI.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.tztechs.teacher.R;
import com.tztechs.teacher.Models.TakeAttendanceViewModel;

public class TakeAttendanceFragment extends Fragment {

    private TakeAttendanceViewModel takeAttendanceViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        takeAttendanceViewModel =
                ViewModelProviders.of(this).get(TakeAttendanceViewModel.class);
        View root = inflater.inflate(R.layout.fragment_attendance, container, false);

        return root;
    }
}