package com.example.tab_layout2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class Adateroffragment extends FragmentStateAdapter {
    public Adateroffragment(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if(position == 0){
            return new CHATSFRAGMENT();
        } else if (position == 1) {
            return new UPDATESFRAGMENTS();
        }
        else {
            return new CALLSFRAGMENTS();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
