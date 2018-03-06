package com.example.corbinbaker.a2;

import android.app.Fragment;
import android.support.v4.app.FragmentActivity;

/**
 * Created by Corbin Baker on 3/5/2018.
 */

public class OptionsActivity extends FragmentActivity{
    protected Fragment createFragment(){
        return new OptionsFragment();
    }
}
