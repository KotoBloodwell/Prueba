package com.example.alejandroorozcobuiles.prueba.Views;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.alejandroorozcobuiles.prueba.Adapters.ProspectoAdapter;
import com.example.alejandroorozcobuiles.prueba.Api.PruebaService;
import com.example.alejandroorozcobuiles.prueba.Models.Prospecto;
import com.example.alejandroorozcobuiles.prueba.Models.User;
import com.example.alejandroorozcobuiles.prueba.R;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProspectosActivity extends AppCompatActivity {

    RecyclerView recyclerProspectos;
    ProspectoAdapter prospectosAdapter;
    ArrayList<Prospecto> prospectos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prospectos);
        
        prospectos = new ArrayList<Prospecto>();

        prospectosAdapter = new ProspectoAdapter(this,prospectos);

        recyclerProspectos = (RecyclerView) findViewById(R.id.recyclerProspectos);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        recyclerProspectos.setLayoutManager(llm);
        recyclerProspectos.setAdapter(prospectosAdapter);

        SharedPreferences prefs = getSharedPreferences("MisPreferencias", Context.MODE_PRIVATE);
        String authToken = prefs.getString("authToken", "error");

        Call<ArrayList<Prospecto>> service = PruebaService.getApi().listProspectos(authToken);
        service.enqueue(new Callback<ArrayList<Prospecto>>() {
            @Override
            public void onResponse(Call<ArrayList<Prospecto>> call, Response<ArrayList<Prospecto>> response) {
                prospectos.addAll(response.body());
                prospectosAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<ArrayList<Prospecto>> call, Throwable t) {
                Toast.makeText(ProspectosActivity.this, "Error", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
