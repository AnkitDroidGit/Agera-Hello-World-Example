package com.freeankit.helloworldbyagera;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.google.android.agera.Updatable;

/**
 * @author by Ankit Kumar (ankitdroiddeveloper@gmail.com) on 12/11/17 (MM/DD/YYYY )
 **/

public class JavaMainActivity extends AppCompatActivity {
    MyDataSupplier myDataSupplier = new MyDataSupplier();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView = findViewById(R.id.textView);
        // Create an Updatable
        Updatable updatable = new Updatable() {
            @Override
            public void update() {
                Log.d("AGERA", myDataSupplier.get());
                textView.setText(myDataSupplier.get());
            }
        };
        myDataSupplier.addUpdatable(updatable);

        myDataSupplier.accept("Hello Agera!");
    }
}
