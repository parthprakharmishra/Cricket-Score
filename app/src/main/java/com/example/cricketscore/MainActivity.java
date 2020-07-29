package com.example.cricketscore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreA = 0;
    int scoreB = 0;
    int wicketA = 0;
    int wicketB = 0;

    public void oneA(View v) {
        scoreA = scoreA + 1;
        displayA(scoreA);
    }

    public void twoA(View v) {
        scoreA = scoreA + 2;
        displayA(scoreA);
    }

    public void threeA(View v) {
        scoreA = scoreA + 3;
        displayA(scoreA);
    }

    public void fourA(View v) {
        scoreA = scoreA + 4;
        displayA(scoreA);
    }

    public void sixA(View v) {
        scoreA = scoreA + 6;
        displayA(scoreA);
    }

    public void wicketA(View v) {
        if (wicketA < 10) {
            ++wicketA;
            displayAw(wicketA);
        }
    }


    public void oneB(View v) {
        scoreB = scoreB + 1;
        displayB(scoreB);
    }

    public void twoB(View v) {
        scoreB = scoreB + 2;
        displayB(scoreB);
    }

    public void threeB(View v) {
        scoreB = scoreB + 3;
        displayB(scoreB);
    }

    public void fourB(View v) {
        scoreB = scoreB + 4;
        displayB(scoreB);
    }

    public void sixB(View v) {
        scoreB = scoreB + 6;
        displayB(scoreB);
    }

    public void wicketB(View v) {
        if (wicketB < 10) {
            ++wicketB;
            displayBw(wicketB);
        }
    }


    private void displayA(int s) {
        TextView tv = (TextView) findViewById(R.id.scoreA);
        tv.setText(String.valueOf(s));
    }

    private void displayB(int s) {
        TextView tv = (TextView) findViewById(R.id.scoreB);
        tv.setText(String.valueOf(s));
    }

    private void displayBw(int s) {
        TextView tv = (TextView) findViewById(R.id.wicketBt);
        tv.setText(String.valueOf(s) + "(Wickets)");
    }

    private void displayAw(int s) {
        TextView tv = (TextView) findViewById(R.id.wicketAt);
        tv.setText(String.valueOf(s) + "(Wickets)");
    }


    public void resetScore(View v) {
        scoreA = 0;
        scoreB = 0;
        wicketA = 0;
        wicketB = 0;
        displayA(scoreA);
        displayB(scoreB);
        displayAw(wicketA);
        displayBw(wicketB);
    }

}