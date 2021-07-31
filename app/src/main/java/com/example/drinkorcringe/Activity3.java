package com.example.drinkorcringe;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class Activity3 extends AppCompatActivity {

    ImageView imgRotate;
    ArrayList <String> arraylisttruth;
    ArrayList <String> arraylistdare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        arraylisttruth = new ArrayList<>();
        arraylisttruth.add("What was the most embarrassing thing you’ve ever done on a date?");
        arraylisttruth.add("Have you ever cheated on your partner?");
        arraylisttruth.add("How many person have you slept with?");
        arraylisttruth.add("What's your biggest fear?");
        arraylisttruth.add("Who was your first celebrity crush?");
        arraylisttruth.add("Have you ever cheated in an exam?");
        arraylisttruth.add("What's the biggest mistake you've ever made?");
        arraylisttruth.add("Who would you like to kiss in this table?");
        arraylisttruth.add("What's your worst habit?");
        arraylisttruth.add("What is your biggest lie?");
        arraylisttruth.add("Have you been cheated?");
        arraylisttruth.add("What's a secret you've never told anyone?");
        arraylisttruth.add("What's the most drunk you've ever been?");
        arraylisttruth.add("Have you ever broken the law?");
        arraylisttruth.add("Have you ever peed in the pool?");
        arraylisttruth.add("What's your biggest regret?");
        arraylisttruth.add("What's the biggest misconception about you?");
        arraylisttruth.add("Why did your last relationship break down?");
        arraylisttruth.add("Have you ever lied to break up?");
        arraylisttruth.add("Will you forgive someone if they cheated on you?");



        arraylistdare = new ArrayList<>();
        arraylistdare.add("Show the most embarrassing photo on your phone");
        arraylistdare.add("Let the rest of the group DM someone from your Instagram account\n");
        arraylistdare.add("Trying to get a phone number from strangers");
        arraylistdare.add("Call your ex and tell them you miss them");
        arraylistdare.add("Call your crush and ask them out on a date");
        arraylistdare.add("Pour syrup on someone’s cheek and lick it off");
        arraylistdare.add("Let the rest of the group DM someone from your Instagram account");
        arraylistdare.add("Call your mom and tell her you’re pregnant. If you’re a guy," +
                " call your mom and tell her you got a girl pregnant");
        arraylistdare.add("Call one person and borrow 1,000,000 vnd");
        arraylistdare.add("Take an embarrassing selfie and post it on Facebook");
        arraylistdare.add("Call your best friend and confess that you love her/him");
        arraylistdare.add("Do 10 push-ups");
        arraylistdare.add("Like 10 pictures of your ex");
        arraylistdare.add("Read out loud the last 5 text messages");
        arraylistdare.add("Give someone your phone and let them send one text to anyone in your contact");
        arraylistdare.add("Let the person to your left draw on your face with a pen");
        arraylistdare.add("Call your lover and said that you cheated on him/her");



        imgRotate = (ImageView) findViewById(R.id.spinRotate);
        Animation animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
        imgRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animRotate);
                animRotate.setDuration(2000);

                Dialog1();
            }
        });


    }
    private void Dialog1(){
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_custom);

        TextView txtplayer = (TextView) dialog.findViewById(R.id.textViewplayer1);
        Random random = new Random();
        int playerrandom = random.nextInt(Secondactivity.arraylistplayer.size());
        txtplayer.setText(Secondactivity.arraylistplayer.get(playerrandom));
        Button buttontruth = (Button) dialog.findViewById(R.id.buttontruth) ;
        Button buttondare = (Button) dialog.findViewById(R.id.buttondare) ;
        buttontruth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog2();
            }
        });
        buttondare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog3();
            }
        });
        dialog.show();
    }
    private void Dialog2(){
        Dialog dialog2 = new Dialog(this);
        dialog2.setContentView(R.layout.dialog_truth);
        TextView txttruth = (TextView) dialog2.findViewById(R.id.textViewtruth);
        Random random = new Random();
        int truthrandom = random.nextInt(arraylisttruth.size());
        txttruth.setText(arraylisttruth.get(truthrandom));
        dialog2.show();
    }
    private void Dialog3(){
        Dialog dialog3 = new Dialog(this);
        dialog3.setContentView(R.layout.dialog_dare);
        TextView txtdare = (TextView) dialog3.findViewById(R.id.textViewdare);
        Random random = new Random();
        int dareRandom = random.nextInt(arraylistdare.size());
        txtdare.setText(arraylistdare.get(dareRandom));
        dialog3.show();
    }
}