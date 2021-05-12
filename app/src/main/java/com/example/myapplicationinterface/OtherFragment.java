package com.example.myapplicationinterface;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class OtherFragment extends Fragment {

    private TextView textView;

    public OtherFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_other, container, false);

        textView = v.findViewById(R.id.text_view);

        return v;
    }

    public void updateEditText(CharSequence newText) {
        textView.setText(newText);
    }
}
