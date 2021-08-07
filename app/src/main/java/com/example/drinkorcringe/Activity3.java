package com.example.drinkorcringe;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class Activity3 extends AppCompatActivity {

    ImageView imgRotate;
    ArrayList <String> arraylisttruth;
    ArrayList <String> arraylistdare;
    int playerrandom;
    static int count =0;

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
        arraylisttruth.add("When was the last time you peed in bed?");
        arraylisttruth.add("What is the biggest lie you have ever told?");
        arraylisttruth.add("Tell us your most embarrassing vomit story?");
        arraylisttruth.add("What do you really hope your parents never find out about?");
        arraylisttruth.add("What have you done that people here would judge you most for doing?");
        arraylisttruth.add("What is the most disgusting habit you have?");
        arraylisttruth.add("What is the most embarrassing thing you have put up on social media?");
        arraylisttruth.add("What is the grossest thing you have had in your mouth?");
        arraylisttruth.add("Who have you loved but they didn’t love you back?");
        arraylisttruth.add("What was the cruellest joke you played on someone?");

        arraylistdare = new ArrayList<>();
        arraylistdare.add("Show the most embarrassing photo on your phone");
        arraylistdare.add("Let the rest of the group DM someone from your Instagram account");
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
        arraylistdare.add("CSay something dirty to the person on your left.");
        arraylistdare.add("Eat a banana without using your hands.");
        arraylistdare.add("Twerk for a minute");
        arraylistdare.add("Eat a raw onion");
        arraylistdare.add("Eat a spoonful of mustard");
        arraylistdare.add("Put 10 different available liquids into a cup and drink it");
        arraylistdare.add("Say two honest things about everyone else in the group");
        arraylistdare.add("Put as many snacks into your mouth at once as you can");
        arraylistdare.add("Do four cartwheels in a row");
        arraylistdare.add("Tell the saddest story you know");
        arraylistdare.add("Kiss the opposite-sex person to your left");
        arraylistdare.add("Get slapped on the face by the person of your choosing");



        imgRotate = (ImageView) findViewById(R.id.spinRotate);
        Animation animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);

        imgRotate.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                view.startAnimation(animRotate);
                animRotate.setDuration(1000);
                count++;
//                System.out.println(count);
                if (count == 11){
//                    System.out.println("change screen");
                    Intent intent4 = new Intent(Activity3.this,Activity4.class);
                    startActivity(intent4);
                } else {
                    Dialog1();
                }
            }
        });



    }
    private void Dialog1(){
        Dialog dialog = new Dialog(this);

        dialog.setContentView(R.layout.dialog_custom);

        TextView txtplayer = (TextView) dialog.findViewById(R.id.textViewplayer1);
        Random random = new Random();
        playerrandom = random.nextInt(Secondactivity.arraylistplayer.size());
        txtplayer.setText(Secondactivity.arraylistplayer.get(playerrandom).getName());
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
        Button buttoncompletetruth = (Button) dialog2.findViewById(R.id.buttoncompletetruth);
        Button buttonfailedtruth = (Button) dialog2.findViewById(R.id.buttonfailedtruth);
        buttoncompletetruth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Secondactivity.arraylistplayer.get(playerrandom).addpoint();
                Toast.makeText(Activity3.this,""+Secondactivity.arraylistplayer
                .get(playerrandom).getName()+" get 1 point",Toast.LENGTH_SHORT).show();
                Intent intent3 = new Intent(Activity3.this,Activity3.class);
                startActivity(intent3);
            }
        });

        buttonfailedtruth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Secondactivity.arraylistplayer.get(playerrandom).losepoint();
                Toast.makeText(Activity3.this,""+Secondactivity.arraylistplayer
                .get(playerrandom).getName()+" lose 1 point and have to drink 1 shot"
                        ,Toast.LENGTH_SHORT).show();
                Intent intent3 = new Intent(Activity3.this,Activity3.class);
                startActivity(intent3);
            }
        });
        dialog2.show();
    }
    private void Dialog3(){
        Dialog dialog3 = new Dialog(this);
        dialog3.setContentView(R.layout.dialog_dare);
        TextView txtdare = (TextView) dialog3.findViewById(R.id.textViewdare);
        Random random = new Random();
        int dareRandom = random.nextInt(arraylistdare.size());
        txtdare.setText(arraylistdare.get(dareRandom));
        Button buttoncompletedare = (Button) dialog3.findViewById(R.id.buttoncomplete2dare);
        Button buttonfaileddare = (Button) dialog3.findViewById(R.id.buttonfaileddare) ;
        buttoncompletedare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Secondactivity.arraylistplayer.get(playerrandom).add2point();
                Toast.makeText(Activity3.this,""+Secondactivity.arraylistplayer
                        .get(playerrandom).getName()+" get 2 points",Toast.LENGTH_SHORT).show();
                Intent intent3 = new Intent(Activity3.this,Activity3.class);
                startActivity(intent3);
            }
        });
        buttonfaileddare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Secondactivity.arraylistplayer.get(playerrandom).losepoint();
                Toast.makeText(Activity3.this,""+Secondactivity.arraylistplayer
                        .get(playerrandom).getName()+" Loses 1 point and have to drink 1 shot",
                        Toast.LENGTH_SHORT).show();
                Intent intent3 = new Intent(Activity3.this,Activity3.class);
                startActivity(intent3);
            }
        });
        dialog3.show();
    }
}