package com.example.admin.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnReset, btnTeamA, btnTeamB, btnFreeThrowA, btnFreeThrowB,btnTwoA, btnTwoB;
    private TextView txtTeamA, txtTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTeamA = (Button)findViewById(R.id.btnThree_tmA);
        btnTeamB = (Button) findViewById(R.id.btnThree_tmB);

        btnTwoA = (Button) findViewById(R.id.btnTwo_tmA);
        btnTwoB = (Button)findViewById(R.id.btnTwo_tmB);

        btnFreeThrowA = (Button) findViewById(R.id.btnFreeThrowA);
        btnFreeThrowB = (Button) findViewById(R.id.btnFreeThrowB);

        btnReset = (Button)findViewById(R.id.btnReset);

        txtTeamA = (TextView) findViewById(R.id.teamA_sore);
        txtTeamB = (TextView) findViewById(R.id.teamB_score);

        btnTeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cValue = txtTeamA.getText().toString();

                int countValue = Integer.parseInt(cValue);
                countValue = 3+ countValue;

                txtTeamA.setText(String.valueOf(countValue));


            }
        });

        btnTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cValue = txtTeamB.getText().toString();

                int countValue = Integer.parseInt(cValue);
                countValue = 3+ countValue;

                txtTeamB.setText(String.valueOf(countValue));


            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtTeamA.setText(String.valueOf(0));
                txtTeamB.setText(String.valueOf(0));
            }
        });

        btnTwoA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cValue = txtTeamA.getText().toString();

                int countValue = Integer.parseInt(cValue);
                countValue = 2+ countValue;

                txtTeamA.setText(String.valueOf(countValue));


            }
        });

        btnTwoB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cValue = txtTeamB.getText().toString();

                int countValue = Integer.parseInt(cValue);
                countValue = 2+ countValue;

                txtTeamB.setText(String.valueOf(countValue));


            }
        });

        btnFreeThrowA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cValue = txtTeamA.getText().toString();

                int countValue = Integer.parseInt(cValue);
                countValue = 1+ countValue;

                txtTeamA.setText(String.valueOf(countValue));


            }
        });

        btnFreeThrowB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cValue = txtTeamB.getText().toString();

                int countValue = Integer.parseInt(cValue);
                countValue = 1+ countValue;

                txtTeamB.setText(String.valueOf(countValue));


            }
        });




    }



}
