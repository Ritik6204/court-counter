package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    // --------- display for team A--------------------------
    public void displayTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    // --------- display for team B--------------------------
    public void displayTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    //--------------------for team A-------------------------
    public void addThreePoints(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayTeamA(scoreTeamA);
    }

    public void addTwoPoints(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayTeamA(scoreTeamA);
    }

    public void FreePoint(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayTeamA(scoreTeamA);
    }
    //------------------for team B------------------------------

    public void addThreePointsB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayTeamB(scoreTeamB);
    }

    public void addTwoPointsB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayTeamB(scoreTeamB);
    }

    public void FreePointB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayTeamB(scoreTeamB);
    }
    public void reset(View view){
      scoreTeamA =0;
      scoreTeamB = 0;
      displayTeamA(scoreTeamA);
      displayTeamB(scoreTeamB);
    }
}