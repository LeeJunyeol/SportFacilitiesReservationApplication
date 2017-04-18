package com.project.sportfacilitiesreservationapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by JUO on 13/04/2017.
 */

public class SettingLayout extends Fragment {
    View v;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
         v = inflater.inflate(R.layout.setting, container, false);
        return v;
    }
}
