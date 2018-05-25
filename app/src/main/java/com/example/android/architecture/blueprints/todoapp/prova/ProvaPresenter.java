package com.example.android.architecture.blueprints.todoapp.prova;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProvaPresenter implements ProvaContract.Presenter {
    @Override
    public List<Integer> generateRandomNumbers(int howMany, int min, int max) {

        int i;
        List<Integer> randomList = new ArrayList<>();
        Random rand = null;

        for (i=0; i<howMany; i++)
        {
            Integer randomNum = rand.nextInt((max - min) + 1) + min;
            randomList.add(randomNum);
        }
        return randomList;

    }

    @Override
    public List<Integer> sort(List<Integer> randomNumbers) {
        return null;
    }

    @Override
    public void start() {

    }
}
