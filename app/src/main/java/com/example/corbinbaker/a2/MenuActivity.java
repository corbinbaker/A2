package com.example.corbinbaker.a2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

public class MenuActivity extends FragmentActivity {

    protected Fragment createFragment(){
        return new MenuFragment();
    }
}
