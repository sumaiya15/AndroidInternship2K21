package com.example.examplework;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class SecondWork extends Worker {

    public SecondWork(@NonNull  Context context, @NonNull  WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @Override
    public Result doWork() {
        Log.i("APSSDC","This Is The Second Work");
        return Result.success();
    }
}
