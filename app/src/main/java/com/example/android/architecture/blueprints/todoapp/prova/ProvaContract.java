package com.example.android.architecture.blueprints.todoapp.prova;

import com.example.android.architecture.blueprints.todoapp.BasePresenter;
import com.example.android.architecture.blueprints.todoapp.BaseView;
import com.example.android.architecture.blueprints.todoapp.tasks.TasksContract;

import java.util.List;

public interface ProvaContract {

    interface View extends BaseView<TasksContract.Presenter> {

    }

    interface Presenter extends BasePresenter {

        List<Integer> generateRandomNumbers(int howMany, int min, int max);
        List<Integer> sort (List<Integer> randomNumbers);

    }
}
