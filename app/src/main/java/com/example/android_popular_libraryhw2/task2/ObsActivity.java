package com.example.android_popular_libraryhw2.task2;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import com.example.android_popular_libraryhw2.R;

public class ObsActivity extends AppCompatActivity {
    Button registr;
    Button unregistr;
    Button spam;
    MyObservable myObservable;
    MyObserver myObserver;

    public static final String MY_DEBUG = "my_debug";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        registr = findViewById(R.id.registr);
        unregistr = findViewById(R.id.unregistr);
        spam = findViewById(R.id.spam);

        myObservable = new MyObservable();
        myObserver = new MyObserver();


        registr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myObservable.registr(myObserver);
            }
        });

        unregistr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myObservable.unregistr(myObserver);
            }
        });

        spam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myObservable.notifySpam();
            }
        });



    }
}