package com.freeankit.helloworldbyagera;

import android.support.annotation.NonNull;

import com.google.android.agera.Observable;
import com.google.android.agera.Receiver;
import com.google.android.agera.Supplier;
import com.google.android.agera.Updatable;

import java.util.ArrayList;
import java.util.List;

/**
 * @author by Ankit Kumar (ankitdroiddeveloper@gmail.com) on 12/11/17 (MM/DD/YYYY )
 **/

public class MyDataSupplier implements Observable, Supplier<String>, Receiver<String> {
    List<Updatable> mUpdatables = new ArrayList<>();

    private String mValue;

    @Override
    public void addUpdatable(@NonNull Updatable updatable) {
        mUpdatables.add(updatable);
    }

    @Override
    public void removeUpdatable(@NonNull Updatable updatable) {
        mUpdatables.remove(updatable);
    }

    @Override
    public void accept(@NonNull String value) {
        mValue = value;
        // Notify the updatables that we have new data
        for (Updatable updatable : mUpdatables) {
            updatable.update();
        }
    }

    @NonNull
    @Override
    public String get() {
        return mValue;
    }
}
