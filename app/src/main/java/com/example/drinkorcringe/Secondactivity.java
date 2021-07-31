package com.example.drinkorcringe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Secondactivity extends AppCompatActivity {
    ListView lvplayer;
    Button buttonAdd , buttonupdate;
    EditText edtPlayer;
    int position =-1;
    static ArrayList <String> arraylistplayer;
    Button buttonPlaygame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);

        lvplayer = (ListView) findViewById(R.id.listplayer);
        buttonAdd = (Button) findViewById(R.id.addplayer);
        buttonupdate = (Button) findViewById(R.id.buttonupdate);
        edtPlayer = (EditText) findViewById(R.id.editTextplayer);
        buttonPlaygame = (Button) findViewById(R.id.buttonplaygame);
        arraylistplayer = new ArrayList<>();
        arraylistplayer.add("Player 1");
        arraylistplayer.add("Player 2");

        ArrayAdapter adapter = new ArrayAdapter (Secondactivity.this,
                android.R.layout.simple_list_item_1, arraylistplayer);

        lvplayer.setAdapter(adapter);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String player = edtPlayer.getText().toString();
                arraylistplayer.add(player);
                adapter.notifyDataSetChanged();
                Toast.makeText(Secondactivity.this, "Added player successfully", Toast.LENGTH_SHORT).show();
            }
        });
        buttonPlaygame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Secondactivity.this,Activity3.class);
                startActivity(intent2);
            }
        });
        lvplayer.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                edtPlayer.setText(arraylistplayer.get(i));
                position = i;
            }
        });
        buttonupdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arraylistplayer.set(position,edtPlayer.getText().toString());
                adapter.notifyDataSetChanged();
                Toast.makeText(Secondactivity.this,"Updated successfully",Toast.LENGTH_SHORT).show();
            }
        });
        lvplayer.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int i, long id) {
                arraylistplayer.remove(i);
                adapter.notifyDataSetChanged();
                Toast.makeText(Secondactivity.this,"Deleted successfully",Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }
}