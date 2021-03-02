package com.jepster.imageactivity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ImageFragment extends Fragment {

    public ImageFragment() {
        super(R.layout.fragment_image);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_image, container, false);
    }

    public void setText(CharSequence inText) {
        if (getView() != null) {
            TextView textView = getView().findViewById(R.id.image_activity_text_view);
            textView.setText(inText);
        }
    }
}