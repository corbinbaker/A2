package com.example.corbinbaker.a2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Corbin Baker on 3/5/2018.
 */

public class MenuFragment extends Fragment {
    private Button mNGButton;
    private Button mOButton;
    private Button mQButton;


    @Override
    public void onCreate(Bundle savedInstanceState) {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_menu, container, false);

        mNGButton = (Button)v.findViewById(R.id.mNewGameButton);
        mOButton = (Button)v.findViewById(R.id.mOptionsButton);
        mQButton = (Button)v.findViewById(R.id.mQuitButton);

        return v;
    }






}
