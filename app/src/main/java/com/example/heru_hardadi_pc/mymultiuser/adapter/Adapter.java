package com.example.heru_hardadi_pc.mymultiuser.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.heru_hardadi_pc.mymultiuser.R;
import com.example.heru_hardadi_pc.mymultiuser.data.Data;

import java.util.List;

/**
 * Created by Kuncoro on 26/03/2016.
 */
public class Adapter extends BaseAdapter {
    private Activity activity;
    private LayoutInflater inflater;
    private List<Data> items;

    public Adapter(Activity activity, List<Data> items) {
        this.activity = activity;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int location) {
        return items.get(location);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (inflater == null)
            inflater = (LayoutInflater) activity
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null)
            convertView = inflater.inflate(R.layout.list_row, null);

        TextView id = (TextView) convertView.findViewById(R.id.id);
        TextView tanggal = (TextView) convertView.findViewById(R.id.tanggal);
        TextView alamat = (TextView) convertView.findViewById(R.id.alamat);
        TextView jam = (TextView) convertView.findViewById(R.id.jam);
        TextView atasnama = (TextView) convertView.findViewById(R.id.atasnama);
        TextView acara = (TextView) convertView.findViewById(R.id.acara);
        TextView team = (TextView) convertView.findViewById(R.id.team);

        Data data = items.get(position);

        id.setText(data.getId());
        tanggal.setText(data.getTanggal());
        alamat.setText(data.getAlamat());
        jam.setText(data.getJam());
        atasnama.setText(data.getAtasnama());
        acara.setText(data.getAcara());
        team.setText(data.getTeam());


        return convertView;
    }

}