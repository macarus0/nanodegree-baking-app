package com.example.macarus0.bakingapp.View;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.example.macarus0.bakingapp.R;

public class StepActivity extends AppCompatActivity {

    public static final String STEP_ID = "step_id";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step);

        Intent intent = getIntent();
        int stepId = intent.getIntExtra(STEP_ID, 0);

        StepFragment stepFragment = new StepFragment();
        stepFragment.setStepId(stepId);
        FragmentManager fragmentManager = getSupportFragmentManager();

        fragmentManager.beginTransaction()
                .add(R.id.step_container, stepFragment)
                .commit();

    }
}