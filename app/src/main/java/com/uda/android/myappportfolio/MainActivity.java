package com.uda.android.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mPopu;
    private Button mStock;
    private Button mBuild;
    private Button mMake;
    private Button mGo;
    private Button mCap;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPopu = (Button) findViewById(R.id.popular_movies);
        mStock = (Button) findViewById(R.id.stock_hawk);
        mBuild = (Button) findViewById(R.id.build_it_bigger);
        mMake = (Button) findViewById(R.id.make_your_app_material);
        mGo = (Button) findViewById(R.id.go_ubiquitous);
        mCap = (Button) findViewById(R.id.capstone);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.popular_movies:
                        showMessage(R.string.POPULAR_MOVIES);
                        break;
                    case R.id.stock_hawk:
                        showMessage(R.string.STOCK_HAWK);
                        break;
                    case R.id.build_it_bigger:
                        showMessage(R.string.BUILD_IT_BIGGER);
                        break;
                    case R.id.make_your_app_material:
                        showMessage(R.string.MAKE_YOUR_APP_MATERIAL);
                        break;
                    case R.id.go_ubiquitous:
                        showMessage(R.string.GO_UBIQUITOUS);
                        break;
                    case R.id.capstone:
                        showMessage(R.string.CAPSTONE);
                        break;
                    default:
                        break;
                }
            }
        };
        mBuild.setOnClickListener(onClickListener);
        mMake.setOnClickListener(onClickListener);
        mGo.setOnClickListener(onClickListener);
        mCap.setOnClickListener(onClickListener);
        mPopu.setOnClickListener(onClickListener);
        mStock.setOnClickListener(onClickListener);
    }

    private void showMessage(int id) {
        Toast.makeText(MainActivity.this, "This Button will launch my " + getResources().getString(id).toLowerCase() + " app!", Toast.LENGTH_SHORT).show();
    }
}
