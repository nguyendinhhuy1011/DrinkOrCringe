package com.example.drinkorcringe;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class PlayerAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Player> playerList;

    public PlayerAdapter(Context context, int layout, List<Player> playerList) {
        this.context = context;
        this.layout = layout;
        this.playerList = playerList;
    }

    @Override
    public int getCount() {
        return playerList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);

        view = inflater.inflate(layout,null);

        // ánh xạ view
        TextView txtName = (TextView) view.findViewById(R.id.textViewnameplayer);

        // gán giá trị
        Player player = playerList.get(i);
        txtName.setText(player.getName());
        return view;
    }
}
