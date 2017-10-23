package com.example.alejandroorozcobuiles.prueba.Adapters;

import android.content.Context;
import android.support.v7.widget.*;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.alejandroorozcobuiles.prueba.Models.Prospecto;
import com.example.alejandroorozcobuiles.prueba.R;

import java.util.ArrayList;

/**
 * Created by alejandroorozcobuiles on 22/10/17.
 */

public class ProspectoAdapter extends RecyclerView.Adapter<ProspectoAdapter.ViewHolder> {

    Context context;
    ArrayList<Prospecto> prospectos;

    public ProspectoAdapter(Context context, ArrayList<Prospecto> prospectos) {
        this.context = context;
        this.prospectos = prospectos;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_prospecto,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Prospecto prospecto = prospectos.get(position);
        holder.txtName.setText(prospecto.getName());
        holder.txtSurname.setText(prospecto.getSurname());
        holder.txtTelephone.setText(prospecto.getTelephone());

    }

    @Override
    public int getItemCount() {
        return prospectos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtName;
        TextView txtSurname;
        TextView txtTelephone;
        TextView txtStatus;

        public ViewHolder(View itemView) {
            super(itemView);
            txtName = (TextView) itemView.findViewById(R.id.txtName);
            txtSurname = (TextView) itemView.findViewById(R.id.txtSurname);
            txtTelephone = (TextView) itemView.findViewById(R.id.txtTelephone);
            txtStatus = (TextView) itemView.findViewById(R.id.txtStatus);
        }
    }
}
