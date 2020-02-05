package com.tztechs.teacher.Models;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TakeAttendanceViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TakeAttendanceViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is attendance fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}