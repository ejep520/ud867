package com.jepster.a404exercise_createanandroidlibraryremake;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.jepster.a404exercise_createanandroidlibraryremake.databinding.ActivityMainBinding;
import com.jepster.imageactivity.ImageFragment;
import com.jepster.jollyjoke.Joker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private boolean mJokeVisible = false;
    private ImageFragment mFragment;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.mainButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        if (mJokeVisible) {
            binding.mainFragmentContainer.removeAllViewsInLayout();
            transaction.remove(mFragment);
            transaction.commit();
            mFragment = null;
        } else {
            mFragment = new ImageFragment();
            transaction.add(R.id.main_fragment_container, mFragment, null);
            transaction.commitNow();
            mFragment.setText(Joker.getJoke());
        }
        mJokeVisible = !mJokeVisible;
    }
}