package com.tztechs.teacher.UI;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.tztechs.teacher.UI.Fragments.OTPFragment;
import com.tztechs.teacher.UI.Fragments.PhoneFragment;

public class ViewPagerAdapter extends FragmentStateAdapter {

    int count;

    public ViewPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle, int count) {
        super(fragmentManager, lifecycle);
        this.count = count;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            default:
                return new PhoneFragment();
            case 1:
                return new OTPFragment();
        }
    }

    @Override
    public int getItemCount() {
        return count;
    }
}
