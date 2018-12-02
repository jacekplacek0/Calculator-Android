package com.jakub.baczynski.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView _screen;
    private String display="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _screen = findViewById(R.id._screen);
        _screen.setText(display);
    }

    public void refreshScreen(){
        _screen.setText(display);
    }

    public void onClickNumber(View v){
        Button btnNumber = (Button) v;
        display += btnNumber.getText();
        refreshScreen();
    }

    public void onClickOperator(View v){
        Button btnOperator = (Button) v;
        display += btnOperator.getText();
        refreshScreen();
    }

    public void onClickResult(View v){

    }
    @Override
    public void onClick(View v) {

    }
}
