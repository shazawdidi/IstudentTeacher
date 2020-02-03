package com.tztechs.teacher.UI.Fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.tztechs.teacher.R;
import com.tztechs.teacher.UI.timeTable.TimeTableViewModel;


/**
 * A simple {@link Fragment} subclass.
 */
public class TimeTableFragment extends Fragment {

    private TimeTableViewModel timeTableViewModel ;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        timeTableViewModel =
                ViewModelProviders.of(this).get(TimeTableViewModel.class);
        View root = inflater.inflate(R.layout.fragment_timetable, container, false);

        return root;
    }

}
