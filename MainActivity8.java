package com.example.iradu.nbacourtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity8 extends AppCompatActivity {
    int scoreC;
    int scoreG;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
    }
    public void addThreeForCav(View V){
        scoreC=scoreC+3;
        displayForCav(scoreC);
    }
    public void addTwoForCav(View V){
        scoreC=scoreC+2;
        displayForCav(scoreC);
    }
    public void addOneForCav(View V){
        scoreC=scoreC+1;
        displayForCav(scoreC);
    }




    public void addThreeForWar(View V){
        scoreG=scoreG+3;
        displayForWar(scoreG);
    }
    public void addTwoForWar(View V){
        scoreG=scoreG+2;
        displayForWar(scoreG);
    }
    public void addOneForWar(View V){
        scoreG=scoreG+1;
        displayForWar(scoreG);
    }

    public void resetScore(View V){
        scoreC=0;
        scoreG=0;
        displayForWar(scoreG);
        displayForCav(scoreC);

    }


    public void displayForCav(int scoreC){
        TextView scoreView = (TextView)findViewById(R.id.cle_Text_View);
        scoreView.setText(String.valueOf(scoreC));
    }

    public void displayForWar(int scoreG){
        TextView scoreView = (TextView)findViewById(R.id.gs_Text_View);
        scoreView.setText(String.valueOf(scoreG));

    }
}
