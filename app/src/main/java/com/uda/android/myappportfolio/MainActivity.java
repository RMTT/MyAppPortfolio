package com.uda.android.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mPopu;
    private Button mStock;
    private Button mBuild;
    private Button mMake;
    private Button mGo;
    private Button mCap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPopu= (Button) findViewById(R.id.popular_movies);
        mStock = (Button) findViewById(R.id.stock_hawk);
        mBuild = (Button) findViewById(R.id.build_it_bigger);
        mMake = (Button) findViewById(R.id.make_your_app_material);
        mGo = (Button) findViewById(R.id.go_ubiquitous);
        mCap = (Button) findViewById(R.id.capstone);

        mPopu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"This Button will launch my "+ getResources().getString(R.string.POPULAR_MOVIES).toLowerCase()+" app!",Toast.LENGTH_SHORT).show();
            }
        });

        mStock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"This Button will launch my "+ getResources().getString(R.string.STOCK_HAWK).toLowerCase()+" app!",Toast.LENGTH_SHORT).show();
            }
        });

        mCap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"This Button will launch my "+ getResources().getString(R.string.CAPSTONE).toLowerCase()+" app!",Toast.LENGTH_SHORT).show();
            }
        });

        mGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"This Button will launch my "+ getResources().getString(R.string.GO_UBIQUITOUS).toLowerCase()+" app!",Toast.LENGTH_SHORT).show();
            }
        });

        mMake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"This Button will launch my "+ getResources().getString(R.string.MAKE_YOUR_APP_MATERIAL).toLowerCase()+" app!",Toast.LENGTH_SHORT).show();
            }
        });

        mBuild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"This Button will launch my "+ getResources().getString(R.string.BUILD_IT_BIGGER).toLowerCase()+" app!",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
