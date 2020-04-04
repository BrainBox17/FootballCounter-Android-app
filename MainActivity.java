package com.example.android.footballcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreHome = 0;
    int scoreVisitors = 0;
int scoreHomeFouls = 0;
    int scoreVisitorsFouls = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Home by one point.
     */
    public void addOneForHome(View view) {
        scoreHome = scoreHome + 1;
        displayForHome(scoreHome);
    }

    /**
     * Displays the given score for Home.
     */
    public void displayForHome(int score) {
        TextView scoreView = (TextView) findViewById(R.id.home_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Increase the score for Visitors by one point.
     */
    public void addOneForVisitors(View view) {
        scoreVisitors = scoreVisitors + 1;
        displayForVisitors(scoreVisitors);
    }

    /**
     * Displays the given score for Visitors.
     */
    public void displayForVisitors(int score) {
        TextView scoreView = (TextView) findViewById(R.id.visitors_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Resets the score and fouls for both teams back to 0
     */
    public void resetScoreAndFouls(View view) {
        scoreHome = 0;
        scoreVisitors = 0;
        displayForHome(scoreHome);
        displayForVisitors(scoreVisitors);
         scoreHomeFouls = 0;
         scoreVisitorsFouls = 0;
        displayForHomeFouls(scoreHomeFouls);
        displayForVisitorsFouls(scoreVisitorsFouls);

    }



    /**
     * Increase the number of fouls for Home by one.
     */
    public void addOneForHomeFouls(View view) {
        scoreHomeFouls = scoreHomeFouls + 1;
        displayForHomeFouls(scoreHomeFouls);
    }

    /**
     * Displays the given number of fouls for Home.
     */
    public void displayForHomeFouls(int score) {
        TextView scoreView = (TextView) findViewById(R.id.home_fouls);
        scoreView.setText(String.valueOf(score));
    }




    /**
     * Increase the number of fouls for visitors by one.
     */
    public void addOneForVisitorsFouls(View view) {
        scoreVisitorsFouls = scoreVisitorsFouls + 1;
        displayForVisitorsFouls(scoreVisitorsFouls);
    }

    /**
     * Displays the given number of fouls for visitors.
     */
    public void displayForVisitorsFouls(int score) {
        TextView scoreView = (TextView) findViewById(R.id.visitors_fouls);
        scoreView.setText(String.valueOf(score));
    }


}
