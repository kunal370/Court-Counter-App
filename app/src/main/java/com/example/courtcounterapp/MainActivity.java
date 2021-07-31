package com.example.courtcounterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int ScoreTeamA=0;
    int ScoreTeamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Context context = getApplicationContext();
        CharSequence text = "welcome to court counter app";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void twoteama(View view){
        ScoreTeamA = ScoreTeamA+2;
        displayForTeamA(ScoreTeamA);
    }
    public void freeteama(View view){
        ScoreTeamA = ScoreTeamA+1;
        displayForTeamA(ScoreTeamA);
    }
    public void threeteama(View view){
        ScoreTeamA = ScoreTeamA+3;
        displayForTeamA(ScoreTeamA);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.valueteama); scoreView.setText(String.valueOf(score));
    }
    public void twoteamb(View view){
        ScoreTeamB = ScoreTeamB+2;
        displayForTeamB(ScoreTeamB);
    }
    public void freeteamb(View view){
        ScoreTeamB = ScoreTeamB+1;
        displayForTeamB(ScoreTeamB);
    }
    public void threeteamb(View view){
        ScoreTeamB = ScoreTeamB+3;
        displayForTeamB(ScoreTeamB);
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.valueteamb);
        scoreView.setText(String.valueOf(score));
    }
    public void reset(View view){

        ScoreTeamA = 0;
        ScoreTeamB = 0;
        displayForTeamB(ScoreTeamA);
        displayForTeamA(ScoreTeamB);

    }
}