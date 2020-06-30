package com.example.android_popular_libraryhw2.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.android_popular_libraryhw2.R;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    public static final String MY_DEBUG = "my_debug";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyTask myTask = new MyTask();
                myTask.execute();
                Log.d(MY_DEBUG, "Метод вызвавший AsyncTask завершился");
            }
        });
    }

    private class MyTask extends AsyncTask<Void, Void, Void>{

        @Override
        protected Void doInBackground(Void... voids) {
            try {
                for (int i = 0; i < 5; i++) {
                    TimeUnit.SECONDS.sleep(1);
                    Log.d(MY_DEBUG, "doInBackground: " + Thread.currentThread().getName() + ": " + i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }
    }
};