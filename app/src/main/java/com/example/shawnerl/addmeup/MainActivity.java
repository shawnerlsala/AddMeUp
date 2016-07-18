package com.example.shawnerl.addmeup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText mTvFirstNum;
    private Button mBtnClick;
    private EditText mTvSecondNum;
    private TextView mTvResult;

    double firstNum, secondNum,sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTvFirstNum= (EditText) findViewById(R.id.TvFirstNum);
        mTvSecondNum= (EditText) findViewById(R.id.TvSecondNum);
        mTvResult=(TextView) findViewById(R.id.tvResult);
    }

    public void addNum(View view) {
        try {
            firstNum = Double.parseDouble(mTvFirstNum.getText().toString());

            secondNum = Double.parseDouble(mTvSecondNum.getText().toString());
            sum = firstNum + secondNum;
            mTvResult.setText(Double.toString(sum));

        } catch (Exception e) {
        }
    }


}
