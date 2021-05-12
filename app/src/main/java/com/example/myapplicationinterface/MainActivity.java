package com.example.myapplicationinterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ProfileFragment.FragmentAListener {

    private ProfileFragment fragmentProfile;
    private OtherFragment fragmentOther;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentProfile = new ProfileFragment();
        fragmentOther = new OtherFragment();

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_a, fragmentProfile)
                .replace(R.id.container_b, fragmentOther)
                .commit();
    }

    @Override
    public void onInputASent(CharSequence input) {
        fragmentOther.updateEditText(input);

    }
}
