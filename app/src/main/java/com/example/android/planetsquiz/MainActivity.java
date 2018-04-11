package com.example.android.planetsquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    int questionsCorrect = 0;
    String userName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startQuiz (View view) {
        userName = ((EditText) findViewById(R.id.user_name)).getText().toString();
        if (userName.equals("")) {
            CharSequence enterUserName = "Please enter your name.";
            int duration = Toast.LENGTH_SHORT;
            Toast userToast = Toast.makeText(getApplicationContext(), enterUserName, duration);
            userToast.show();
        } else {
            setContentView(R.layout.quiz_layout);
        }
    }

    public void checkQuestion1 () {
        CheckBox q1A1 = (CheckBox) findViewById(R.id.q1_ans1);
        boolean q1Ans1Checked = q1A1.isChecked();
        CheckBox q1A2 = (CheckBox) findViewById(R.id.q1_ans2);
        boolean q1Ans2Checked = q1A2.isChecked();
        CheckBox q1A3 = (CheckBox) findViewById(R.id.q1_ans3);
        boolean q1Ans3Checked = q1A3.isChecked();
        CheckBox q1A4 = (CheckBox) findViewById(R.id.q1_ans4);
        boolean q1Ans4Checked = q1A4.isChecked();
        if (q1Ans2Checked == true || q1Ans3Checked == true) {
            TextView question1 = (TextView) findViewById(R.id.q1);
            question1.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.clear_mark,0,0,0);
        } else if (q1Ans1Checked == false || q1Ans4Checked == false) {
            TextView question1 = (TextView) findViewById(R.id.q1);
            question1.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.clear_mark,0,0,0);
        } else if (q1Ans1Checked == true && q1Ans4Checked == true) {
            TextView question1 = (TextView) findViewById(R.id.q1);
            question1.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.check_mark,0,0,0);
            questionsCorrect += 1;
        }
    }

    public void checkQuestion2 () {
        RadioButton q2A2 =(RadioButton) findViewById(R.id.q2_ans2);
        boolean q2Ans2Checked = q2A2.isChecked();
        if (q2Ans2Checked) {
            TextView question2 = (TextView) findViewById(R.id.q2);
            question2.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.check_mark,0,0,0);
            questionsCorrect += 1;
        } else {
            TextView question2 = (TextView) findViewById(R.id.q2);
            question2.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.clear_mark,0,0,0);
        }
    }

    public void checkQuestion3 () {
        RadioButton q3A4 =(RadioButton) findViewById(R.id.q3_ans4);
        boolean q3Ans4Checked = q3A4.isChecked();
        if (q3Ans4Checked) {
            TextView question3 = (TextView) findViewById(R.id.q3);
            question3.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.check_mark,0,0,0);
            questionsCorrect += 1;
        } else {
            TextView question3 = (TextView) findViewById(R.id.q3);
            question3.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.clear_mark,0,0,0);
        }
    }

    public void checkQuestion4 () {
        CheckBox q4A1 = (CheckBox) findViewById(R.id.q4_ans1);
        boolean q4Ans1Checked = q4A1.isChecked();
        CheckBox q4A2 = (CheckBox) findViewById(R.id.q4_ans2);
        boolean q4Ans2Checked = q4A2.isChecked();
        CheckBox q4A3 = (CheckBox) findViewById(R.id.q4_ans3);
        boolean q4Ans3Checked = q4A3.isChecked();
        CheckBox q4A4 = (CheckBox) findViewById(R.id.q4_ans4);
        boolean q4Ans4Checked = q4A4.isChecked();
        if (q4Ans2Checked || q4Ans4Checked) {
            TextView question4 = (TextView) findViewById(R.id.q4);
            question4.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.clear_mark,0,0,0);
        } else if (!q4Ans1Checked || !q4Ans3Checked) {
            TextView question4 = (TextView) findViewById(R.id.q4);
            question4.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.clear_mark,0,0,0);
        } else if (q4Ans1Checked && q4Ans3Checked) {
            TextView question4 = (TextView) findViewById(R.id.q4);
            question4.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.check_mark,0,0,0);
            questionsCorrect += 1;
        }
    }

    public void checkQuestion5 () {
        RadioButton q5A2 =(RadioButton) findViewById(R.id.q5_ans2);
        boolean q5Ans2Checked = q5A2.isChecked();
        if (q5Ans2Checked) {
            TextView question5 = (TextView) findViewById(R.id.q5);
            question5.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.check_mark,0,0,0);
            questionsCorrect += 1;
        } else {
            TextView question5 = (TextView) findViewById(R.id.q5);
            question5.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.clear_mark,0,0,0);
        }
    }

    public void checkQuestion6 () {
        String q6A1 = ((EditText) findViewById(R.id.q6_ans1)).getText().toString();
        int q6Ans1Num = 0;
        try {
            q6Ans1Num = Integer.parseInt(q6A1);
        } catch(NumberFormatException nfe) {
            //System.out.println("Could not parse " + nfe);
            q6Ans1Num = 0;
        }
        if (q6Ans1Num == 8) {
            TextView question6 = (TextView) findViewById(R.id.q6);
            question6.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.check_mark,0,0,0);
            questionsCorrect += 1;
        } else {
            TextView question6 = (TextView) findViewById(R.id.q6);
            question6.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.clear_mark,0,0,0);
        }
    }

    public void checkQuestion7 () {
        RadioButton q7A2 =(RadioButton) findViewById(R.id.q7_ans2);
        boolean q7Ans2Checked = q7A2.isChecked();
        if (q7Ans2Checked) {
            TextView question7 = (TextView) findViewById(R.id.q7);
            question7.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.check_mark,0,0,0);
            questionsCorrect += 1;
        } else {
            TextView question7 = (TextView) findViewById(R.id.q7);
            question7.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.clear_mark,0,0,0);
        }
    }

    public void checkQuestion8 () {
        RadioButton q8A3 =(RadioButton) findViewById(R.id.q8_ans3);
        boolean q8Ans3Checked = q8A3.isChecked();
        if (q8Ans3Checked) {
            TextView question8 = (TextView) findViewById(R.id.q8);
            question8.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.check_mark,0,0,0);
            questionsCorrect += 1;
        } else {
            TextView question8 = (TextView) findViewById(R.id.q8);
            question8.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.clear_mark,0,0,0);
        }
    }

    public void checkAnswers (View view) {
        checkQuestion1();
        checkQuestion2();
        checkQuestion3();
        checkQuestion4();
        checkQuestion5();
        checkQuestion6();
        checkQuestion7();
        checkQuestion8();

        // Results
        if (questionsCorrect == 8) {
            CharSequence goodJob = "Stellar job " + userName + "! You got 100%.";
            int duration = Toast.LENGTH_SHORT;
            Toast goodToast = Toast.makeText(getApplicationContext(), goodJob, duration);
            goodToast.show();
        } else if (questionsCorrect == 7){
            CharSequence okayJob = "Almost! Looks like you missed one.";
            int duration = Toast.LENGTH_SHORT;
            Toast okayToast = Toast.makeText(getApplicationContext(), okayJob, duration);
            okayToast.show();
        } else {
            CharSequence badJob = "Whoops. Looks like you missed a few.";
            int duration = Toast.LENGTH_SHORT;
            Toast badToast = Toast.makeText(getApplicationContext(), badJob, duration);
            badToast.show();
        }
        questionsCorrect = 0;
    }
}
