package com.example.android.architecture.blueprints.todoapp.prova;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.architecture.blueprints.todoapp.R;

import java.util.ArrayList;
import java.util.List;

public class ProvaActivity extends AppCompatActivity {

    private ProvaPresenter mPresenter;
    private List<Integer> randomList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prova);

        mPresenter = new ProvaPresenter();

        randomList = new ArrayList<>();
        randomList = mPresenter.generateRandomNumbers(100, 0, 100);

    }
}
