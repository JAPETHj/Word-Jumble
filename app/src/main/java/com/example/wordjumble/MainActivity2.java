package com.example.wordjumble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final int[] d = {0};
        ImageButton info = findViewById(R.id.info1);
        EditText guess = findViewById(R.id.EditText2);
        guess.setText("");
        String[] enteredword = getIntent().getStringArrayExtra("WORD");
        final String[][] cluestring = {getIntent().getStringArrayExtra("CLUE")};
        ImageButton Info = findViewById(R.id.info1);
        int length = guess.length();
        int wordlength = enteredword.length;
        TextView guessbox = findViewById(R.id.guesstext);
        ImageButton reset = findViewById(R.id.reset);
        ImageButton check = findViewById(R.id.checkbtn);
        TextView cluetext = findViewById(R.id.textView2);
        ImageView heart1 = findViewById(R.id.heart1);
        ImageView heart2 = findViewById(R.id.heart2);
        ImageView heart3 = findViewById(R.id.heart3);
        Button okay = findViewById(R.id.okay);
        Button b1 = findViewById(R.id.button1);
        Button b2 = findViewById(R.id.button2);
        Button b3 = findViewById(R.id.button3);
        Button b4 = findViewById(R.id.button4);
        Button b5 = findViewById(R.id.button5);
        Button b6 = findViewById(R.id.button6);
        Button b7 = findViewById(R.id.button7);
        Button b8 = findViewById(R.id.button8);
        Button b9 = findViewById(R.id.button9);
        Button b10 = findViewById(R.id.button10);
        Button b11 = findViewById(R.id.button11);
        Button b12 = findViewById(R.id.button12);
        Button b13 = findViewById(R.id.button13);
        Button b14 = findViewById(R.id.button14);
        Button b15 = findViewById(R.id.button15);
        Button b16 = findViewById(R.id.button16);
        int lives = 3;
        cluetext.setText(wordlength + "letter word" + "cluestring");
        ArrayList<String> alphabets = new ArrayList<String>() {
            {
                add("A");
                add("B");
                add("C");
                add("D");
                add("E");
                add("F");
                add("G");
                add("H");
                add("I");
                add("J");
                add("K");
                add("L");
                add("M");
                add("N");
                add("O");
                add("P");
                add("Q");
                add("R");
                add("S");
                add("T");
                add("U");
                add("V");
                add("W");
                add("X");
                add("Y");
                add("Z");


            }
        };
        List<String> Str = Collections.emptyList();
        List<Integer> num = Collections.emptyList();
        int i = 0;
        int f = 0;
        while (i < wordlength) {
            String m = enteredword[i];
            Str.add(i, m);
            i++;
        }
        while (wordlength < 16) {
            int k = (int) (Math.random() * 25);
            String n = alphabets.get(k);
            Str.add(wordlength,n);

        }
        while (num.size() < 16) {
            int l = (int) (Math.random()*25);
            if(num.contains(l)){
                continue;
            }else{
                num.add(l);
            }
        }
        Info.setOnClickListener(v -> {
            cluetext.setVisibility(View.VISIBLE);
            okay.setVisibility(View.VISIBLE);
            guessbox.setVisibility(View.VISIBLE);
            b1.setVisibility(View.INVISIBLE);
            b2.setVisibility(View.INVISIBLE);
            b3.setVisibility(View.INVISIBLE);
            b4.setVisibility(View.INVISIBLE);
            b5.setVisibility(View.INVISIBLE);
            b6.setVisibility(View.INVISIBLE);
            b7.setVisibility(View.INVISIBLE);
            b8.setVisibility(View.INVISIBLE);
            b1.setText(Str.get(num.get(1)).toString());
            b2.setText(Str.get(num.get(2)).toString());
            b3.setText(Str.get(num.get(3)).toString());
            b4.setText(Str.get(num.get(4)).toString());
            b5.setText(Str.get(num.get(5)).toString());
            b6.setText(Str.get(num.get(6)).toString());
            b7.setText(Str.get(num.get(7)).toString());
            b8.setText(Str.get(num.get(8)).toString());
            b1.setText(Str.get(num.get(9)).toString());
            b2.setText(Str.get(num.get(10)).toString());
            b3.setText(Str.get(num.get(11)).toString());
            b4.setText(Str.get(num.get(12)).toString());
            b5.setText(Str.get(num.get(13)).toString());
            b6.setText(Str.get(num.get(14)).toString());
            b7.setText(Str.get(num.get(15)).toString());
            b8.setText(Str.get(num.get(16)).toString());

        });
        okay.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                cluetext.setVisibility(View.INVISIBLE);
                okay.setVisibility(View.INVISIBLE);
                guessbox.setVisibility(View.INVISIBLE);
                b1.setVisibility(View.VISIBLE);
                b2.setVisibility(View.VISIBLE);
                b3.setVisibility(View.VISIBLE);
                b4.setVisibility(View.VISIBLE);
                b5.setVisibility(View.VISIBLE);
                b6.setVisibility(View.VISIBLE);
                b7.setVisibility(View.VISIBLE);
                b8.setVisibility(View.VISIBLE);

            }

        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b1.setBackgroundResource(R.drawable.unclickbtn);
                guess.append(Str.get(num.get(1)).toString());
                b1.setEnabled(false);
                d[0]++;
                if(d[0] == wordlength){
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    b3.setEnabled(false);
                    b4.setEnabled(false);
                    b5.setEnabled(false);
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                    b8.setEnabled(false);
                    b9.setEnabled(false);
                    b10.setEnabled(false);
                    b11.setEnabled(false);
                    b12.setEnabled(false);
                    b13.setEnabled(false);
                    b14.setEnabled(false);
                    b15.setEnabled(false);
                    b16.setEnabled(false);
                    check.setEnabled(true);
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b2.setBackgroundResource(R.drawable.unclickbtn);
                guess.append(Str.get(num.get(2)).toString());
                b2.setEnabled(false);
                d[0]++;
                if(d[0] == wordlength){
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    b3.setEnabled(false);
                    b4.setEnabled(false);
                    b5.setEnabled(false);
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                    b8.setEnabled(false);
                    b9.setEnabled(false);
                    b10.setEnabled(false);
                    b11.setEnabled(false);
                    b12.setEnabled(false);
                    b13.setEnabled(false);
                    b14.setEnabled(false);
                    b15.setEnabled(false);
                    b16.setEnabled(false);
                    check.setEnabled(true);
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b3.setBackgroundResource(R.drawable.unclickbtn);
                guess.append(Str.get(num.get(3)).toString());
                b3.setEnabled(false);
                d[0]++;
                if(d[0] == wordlength){
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    b3.setEnabled(false);
                    b4.setEnabled(false);
                    b5.setEnabled(false);
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                    b8.setEnabled(false);
                    b9.setEnabled(false);
                    b10.setEnabled(false);
                    b11.setEnabled(false);
                    b12.setEnabled(false);
                    b13.setEnabled(false);
                    b14.setEnabled(false);
                    b15.setEnabled(false);
                    b16.setEnabled(false);
                    check.setEnabled(true);
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b4.setBackgroundResource(R.drawable.unclickbtn);
                guess.append(Str.get(num.get(4)).toString());
                b4.setEnabled(false);
                d[0]++;
                if(d[0] == wordlength){
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    b3.setEnabled(false);
                    b4.setEnabled(false);
                    b5.setEnabled(false);
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                    b8.setEnabled(false);
                    b9.setEnabled(false);
                    b10.setEnabled(false);
                    b11.setEnabled(false);
                    b12.setEnabled(false);
                    b13.setEnabled(false);
                    b14.setEnabled(false);
                    b15.setEnabled(false);
                    b16.setEnabled(false);
                    check.setEnabled(true);
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b5.setBackgroundResource(R.drawable.unclickbtn);
                guess.append(Str.get(num.get(5)).toString());
                b5.setEnabled(false);
                d[0]++;
                if(d[0] == wordlength){
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    b3.setEnabled(false);
                    b4.setEnabled(false);
                    b5.setEnabled(false);
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                    b8.setEnabled(false);
                    b9.setEnabled(false);
                    b10.setEnabled(false);
                    b11.setEnabled(false);
                    b12.setEnabled(false);
                    b13.setEnabled(false);
                    b14.setEnabled(false);
                    b15.setEnabled(false);
                    b16.setEnabled(false);
                    check.setEnabled(true);
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b6.setBackgroundResource(R.drawable.unclickbtn);
                guess.append(Str.get(num.get(6)).toString());
                b6.setEnabled(false);
                d[0]++;
                if(d[0] == wordlength){
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    b3.setEnabled(false);
                    b4.setEnabled(false);
                    b5.setEnabled(false);
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                    b8.setEnabled(false);
                    b9.setEnabled(false);
                    b10.setEnabled(false);
                    b11.setEnabled(false);
                    b12.setEnabled(false);
                    b13.setEnabled(false);
                    b14.setEnabled(false);
                    b15.setEnabled(false);
                    b16.setEnabled(false);
                    check.setEnabled(true);
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b7.setBackgroundResource(R.drawable.unclickbtn);
                guess.append(Str.get(num.get(7)).toString());
                b7.setEnabled(false);
                d[0]++;
                if(d[0] == wordlength){
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    b3.setEnabled(false);
                    b4.setEnabled(false);
                    b5.setEnabled(false);
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                    b8.setEnabled(false);
                    b9.setEnabled(false);
                    b10.setEnabled(false);
                    b11.setEnabled(false);
                    b12.setEnabled(false);
                    b13.setEnabled(false);
                    b14.setEnabled(false);
                    b15.setEnabled(false);
                    b16.setEnabled(false);
                    check.setEnabled(true);
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b8.setBackgroundResource(R.drawable.unclickbtn);
                guess.append(Str.get(num.get(8)).toString());
                b8.setEnabled(false);
                d[0]++;
                if(d[0] == wordlength){
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    b3.setEnabled(false);
                    b4.setEnabled(false);
                    b5.setEnabled(false);
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                    b8.setEnabled(false);
                    b9.setEnabled(false);
                    b10.setEnabled(false);
                    b11.setEnabled(false);
                    b12.setEnabled(false);
                    b13.setEnabled(false);
                    b14.setEnabled(false);
                    b15.setEnabled(false);
                    b16.setEnabled(false);
                    check.setEnabled(true);
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b9.setBackgroundResource(R.drawable.unclickbtn);
                guess.append(Str.get(num.get(9)).toString());
                b9.setEnabled(false);
                d[0]++;
                if(d[0] == wordlength){
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    b3.setEnabled(false);
                    b4.setEnabled(false);
                    b5.setEnabled(false);
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                    b8.setEnabled(false);
                    b9.setEnabled(false);
                    b10.setEnabled(false);
                    b11.setEnabled(false);
                    b12.setEnabled(false);
                    b13.setEnabled(false);
                    b14.setEnabled(false);
                    b15.setEnabled(false);
                    b16.setEnabled(false);
                    check.setEnabled(true);
                }
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b10.setBackgroundResource(R.drawable.unclickbtn);
                guess.append(Str.get(num.get(10)).toString());
                b10.setEnabled(false);
                d[0]++;
                if(d[0] == wordlength){
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    b3.setEnabled(false);
                    b4.setEnabled(false);
                    b5.setEnabled(false);
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                    b8.setEnabled(false);
                    b9.setEnabled(false);
                    b10.setEnabled(false);
                    b11.setEnabled(false);
                    b12.setEnabled(false);
                    b13.setEnabled(false);
                    b14.setEnabled(false);
                    b15.setEnabled(false);
                    b16.setEnabled(false);
                    check.setEnabled(true);
                }
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b11.setBackgroundResource(R.drawable.unclickbtn);
                guess.append(Str.get(num.get(11)).toString());
                b11.setEnabled(false);
                d[0]++;
                if(d[0] == wordlength){
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    b3.setEnabled(false);
                    b4.setEnabled(false);
                    b5.setEnabled(false);
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                    b8.setEnabled(false);
                    b9.setEnabled(false);
                    b10.setEnabled(false);
                    b11.setEnabled(false);
                    b12.setEnabled(false);
                    b13.setEnabled(false);
                    b14.setEnabled(false);
                    b15.setEnabled(false);
                    b16.setEnabled(false);
                    check.setEnabled(true);
                }
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b12.setBackgroundResource(R.drawable.unclickbtn);
                guess.append(Str.get(num.get(12)).toString());
                b12.setEnabled(false);
                d[0]++;
                if(d[0] == wordlength){
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    b3.setEnabled(false);
                    b4.setEnabled(false);
                    b5.setEnabled(false);
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                    b8.setEnabled(false);
                    b9.setEnabled(false);
                    b10.setEnabled(false);
                    b11.setEnabled(false);
                    b12.setEnabled(false);
                    b13.setEnabled(false);
                    b14.setEnabled(false);
                    b15.setEnabled(false);
                    b16.setEnabled(false);
                    check.setEnabled(true);
                }
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b13.setBackgroundResource(R.drawable.unclickbtn);
                guess.append(Str.get(num.get(13)).toString());
                b13.setEnabled(false);
                d[0]++;
                if(d[0] == wordlength){
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    b3.setEnabled(false);
                    b4.setEnabled(false);
                    b5.setEnabled(false);
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                    b8.setEnabled(false);
                    b9.setEnabled(false);
                    b10.setEnabled(false);
                    b11.setEnabled(false);
                    b12.setEnabled(false);
                    b13.setEnabled(false);
                    b14.setEnabled(false);
                    b15.setEnabled(false);
                    b16.setEnabled(false);
                    check.setEnabled(true);
                }
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b14.setBackgroundResource(R.drawable.unclickbtn);
                guess.append(Str.get(num.get(14)).toString());
                b14.setEnabled(false);
                d[0]++;
                if(d[0] == wordlength){
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    b3.setEnabled(false);
                    b4.setEnabled(false);
                    b5.setEnabled(false);
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                    b8.setEnabled(false);
                    b9.setEnabled(false);
                    b10.setEnabled(false);
                    b11.setEnabled(false);
                    b12.setEnabled(false);
                    b13.setEnabled(false);
                    b14.setEnabled(false);
                    b15.setEnabled(false);
                    b16.setEnabled(false);
                    check.setEnabled(true);
                }
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b15.setBackgroundResource(R.drawable.unclickbtn);
                guess.append(Str.get(num.get(15)).toString());
                b15.setEnabled(false);
                d[0]++;
                if(d[0] == wordlength){
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    b3.setEnabled(false);
                    b4.setEnabled(false);
                    b5.setEnabled(false);
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                    b8.setEnabled(false);
                    b9.setEnabled(false);
                    b10.setEnabled(false);
                    b11.setEnabled(false);
                    b12.setEnabled(false);
                    b13.setEnabled(false);
                    b14.setEnabled(false);
                    b15.setEnabled(false);
                    b16.setEnabled(false);
                    check.setEnabled(true);
                }
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b16.setBackgroundResource(R.drawable.unclickbtn);
                guess.append(Str.get(num.get(16)).toString());
                b16.setEnabled(false);
                d[0]++;
                if(d[0] == wordlength){
                    b1.setEnabled(false);
                    b2.setEnabled(false);
                    b3.setEnabled(false);
                    b4.setEnabled(false);
                    b5.setEnabled(false);
                    b6.setEnabled(false);
                    b7.setEnabled(false);
                    b8.setEnabled(false);
                    b9.setEnabled(false);
                    b10.setEnabled(false);
                    b11.setEnabled(false);
                    b12.setEnabled(false);
                    b13.setEnabled(false);
                    b14.setEnabled(false);
                    b15.setEnabled(false);
                    b16.setEnabled(false);
                    check.setEnabled(true);
                }
            }
        });
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity2.this, MainActivity.class);

                if (guess.getText().toString().equals(enteredword)) {
                    while (lives > 0) {
                        if (lives == 3) {
                            cluetext.setText("Score:500");
                        } else if (lives == 2) {
                            cluetext.setText("Score : 300");
                        }else{
                            cluetext.setText("Score :100");
                        }
                    }


                }
            }
        });
    }
}