package com.example.android_popular_libraryhw2.task3;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.android_popular_libraryhw2.R;


import org.reactivestreams.Subscription;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class RxsActivity extends AppCompatActivity {
    Button registrrx;
    Button unregistrrx;
    Subscription msubscription;
    public static final String MY_DEBUG = "my_debug";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        registrrx = findViewById(R.id.registr_rx);
        unregistrrx = findViewById(R.id.unregistr_rx);
        final Observable<Long> observable = Observable.interval(1000, TimeUnit.MILLISECONDS);


        final Observer<Long> observer = new Observer<Long>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(Long aLong) {
                Log.d(MY_DEBUG, "Сообщение");
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        };






        registrrx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                observable.subscribe(observer);
            }
        });

        unregistrrx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //observable.unsubscribeOn()
            }
        });
    }
}