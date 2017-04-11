package com.example.mysmall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import net.wequick.small.Small;

public class LaunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

    }

    public void test(View view) {
        Small.setUp(this, new Small.OnCompleteListener() {
            @Override
            public void onComplete() {
                Small.openUri("main", LaunchActivity.this);
            }
        });
    }

    public void goToRxJava(View view) {
        Small.setUp(this, new Small.OnCompleteListener() {
            @Override
            public void onComplete() {
                Small.openUri("test", LaunchActivity.this);
            }
        });
    }

    public void goToReader(View view) {
        Small.setUp(this, new Small.OnCompleteListener() {
            @Override
            public void onComplete() {
                Small.openUri("reader", LaunchActivity.this);
            }
        });
    }
}
