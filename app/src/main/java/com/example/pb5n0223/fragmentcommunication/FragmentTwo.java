package com.example.pb5n0223.fragmentcommunication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by PB5N0223 on 3/3/2017.
 */

public class FragmentTwo extends Fragment {

    TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two_layout, container, false);
        textView = (TextView)view.findViewById(R.id.msgView);
        textView.setVisibility(View.GONE);
        return view;
    }
    public  void updateInfo (String message){

        textView.setText(message);
        textView.setVisibility(View.VISIBLE);

    }
}
