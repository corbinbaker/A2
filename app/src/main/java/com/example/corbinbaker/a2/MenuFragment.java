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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_menu, container, false);

        mNGButton = (Button)v.findViewById(R.id.mNewGameButton);
        mNGButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {

            }
        });

        mOButton = (Button)v.findViewById(R.id.mOptionsButton);
        mOButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {

            }
        });

        mQButton = (Button)v.findViewById(R.id.mQuitButton);
        mQButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                System.exit(0);
            }
        });

        return v;
    }






}
