package com.jepster.a403demo_creatinganandroidlibraryremake;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.jepster.imageactivity.ImageActivity;

public class MainActivityFragment extends Fragment {
    public MainActivityFragment() { }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    public void launchLibraryActivity(View view) {
        Log.d("MainFragment", "Launched by " + view.toString());
        Intent intent = new Intent(getContext(), ImageActivity.class);
        startActivity(intent);
    }

}
