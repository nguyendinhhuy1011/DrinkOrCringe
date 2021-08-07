package com.example.drinkorcringe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Activity4 extends AppCompatActivity {
    TextView txtPlayerTop1, txtPlayerTop2,txtPlayerTop3,txtPointTop1, txtPointTop2, txtPointTop3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        txtPlayerTop1 = (TextView) findViewById(R.id.top1);
        txtPlayerTop2 = (TextView) findViewById(R.id.top2);
        txtPlayerTop3 = (TextView) findViewById(R.id.top3);
        txtPointTop1 = (TextView) findViewById(R.id.pointTop1);
        txtPointTop2 = (TextView) findViewById(R.id.pointTop2);
        txtPointTop3 = (TextView) findViewById(R.id.pointTop3);

        // sort point
            Collections.sort(Secondactivity.arraylistplayer, new Comparator<Player>() {
                @Override
                public int compare(Player o1, Player o2) {
                    if (o1.getPoint() <o2.getPoint()){
                    return 1;
                    } else {
                        if (o1.getPoint()== o2.getPoint()) {
                            return 0;
                        } else {
                            return -1;
                        }
                    }
            }
        });
        System.out.println("txtPointTop1" + txtPointTop1);
        System.out.println("txtPlayerTop1" + txtPlayerTop1);

        System.out.println(Secondactivity.arraylistplayer.get(0).getName()
                +" "+Secondactivity.arraylistplayer.get(0).getPoint() );
        System.out.println(Secondactivity.arraylistplayer.get(1).getName()
                +" "+Secondactivity.arraylistplayer.get(1).getPoint() );
//        System.out.println(Secondactivity.arraylistplayer.get(2).getName()
//                +" "+Secondactivity.arraylistplayer.get(2).getPoint() );

            txtPlayerTop1.setText(Secondactivity.arraylistplayer.get(0).getName());
            txtPointTop1.setText(Secondactivity.arraylistplayer.get(0).getPoint()+"");
            txtPlayerTop2.setText(Secondactivity.arraylistplayer.get(1).getName());
            txtPointTop2.setText(Secondactivity.arraylistplayer.get(1).getPoint()+"");
            if (Secondactivity.arraylistplayer.size()<=2){
                txtPlayerTop3.setText("No player");
                txtPointTop3.setText("0");
            }
            if (Secondactivity.arraylistplayer.size()>2){
                txtPlayerTop3.setText(Secondactivity.arraylistplayer.get(2).getName());
                txtPointTop3.setText(Secondactivity.arraylistplayer.get(2).getPoint()+"");
            }


//        for (int i = 0; i < 2; i++) {
//            txtPointTop1.setText(Secondactivity.arraylistplayer.get(0).getPoint());
//            txtPointTop2.setText(Secondactivity.arraylistplayer.get(1).getPoint());
//            txtPointTop3.setText(Secondactivity.arraylistplayer.get(2).getPoint());
//        }
    }
}