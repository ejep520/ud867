package com.jepster.a401demoremake;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.jepster.javajoke.Joker;

public class MainFragmentActivity extends Fragment {


    public MainFragmentActivity() { }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        TextView textView = rootView.findViewById(R.id.text_zero);
        Joker myJoker = new Joker();
        textView.setText(myJoker.getJoke());
        return rootView;
    }
}
