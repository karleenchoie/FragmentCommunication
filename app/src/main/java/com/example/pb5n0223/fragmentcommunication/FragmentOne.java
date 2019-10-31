package com.example.pb5n0223.fragmentcommunication;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by PB5N0223 on 3/3/2017.
 */

public class FragmentOne extends Fragment {

    EditText editText;
    Button button;
    OnMsgSetListener onMsgSetListener;
    InputMethodManager inputMethodManager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one_layout, container, false);
        editText = (EditText) view.findViewById(R.id.enterMsg);
        button = (Button) view.findViewById(R.id.displayMsgButton);
        button.setEnabled(false);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (!editText.getText().toString().equals("")){
                    button.setEnabled(true);
                } else {
                    button.setEnabled(false);
                }

            }

            @Override
            public void afterTextChanged(Editable s) {


            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Message = editText.getText().toString();
                onMsgSetListener.setMessage(Message);
                editText.clearFocus();
                button.requestFocus();

            }
        });
        return view;
    }

    public interface OnMsgSetListener {
        public void setMessage (String message);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            onMsgSetListener = (OnMsgSetListener)activity;
        }catch (Exception e){}

    }
}


