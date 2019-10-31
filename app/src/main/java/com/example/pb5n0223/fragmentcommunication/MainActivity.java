package com.example.pb5n0223.fragmentcommunication;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements FragmentOne.OnMsgSetListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void setMessage(String message) {

        FragmentTwo f2 = (FragmentTwo) getFragmentManager().findFragmentById(R.id.fragment_two);
        f2.updateInfo(message);

    }

}
