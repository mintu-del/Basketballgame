package com.example.practiceset2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
       int scoreTeamA=0;
    int scoreTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
public void threepointsA(View view){
       scoreTeamA+=3;
        displayForTeamA(scoreTeamA);
    }
    public void twopointsA(View view){
        scoreTeamA+=2;
        displayForTeamA(scoreTeamA);
    }
    public void FreethrowA(View view){
        scoreTeamA+=1;
        displayForTeamA(scoreTeamA);
    }
    public void threepointsB(View view){
        scoreTeamB+=3;
        displayForTeamB(scoreTeamB);
    }
    public void twopointsB(View view){
        scoreTeamB+=2;
        displayForTeamB(scoreTeamB);
    }
    public void FreethrowB(View view){
        scoreTeamB+=1;
        displayForTeamB(scoreTeamB);
    }
   public void Reset(View view){
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
   }
}
