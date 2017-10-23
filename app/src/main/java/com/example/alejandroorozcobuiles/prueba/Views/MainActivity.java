package com.example.alejandroorozcobuiles.prueba.Views;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.alejandroorozcobuiles.prueba.Api.PruebaService;
import com.example.alejandroorozcobuiles.prueba.Models.User;
import com.example.alejandroorozcobuiles.prueba.R;

import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    EditText txtUsername;
    EditText txtPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUsername = (EditText) findViewById(R.id.txtUsername);
        txtPassword = (EditText) findViewById(R.id.txtPassword);

    }

    public void Login(View view) {
        Call<User> service = PruebaService.getApi().groupList(txtUsername.getText().toString(),txtPassword.getText().toString());
            service.enqueue(new Callback<User>() {
                @Override
                public void onResponse(Call<User> call, Response<User> response) {
                    if(response.isSuccessful()){

                        SharedPreferences prefs =
                                getSharedPreferences("MisPreferencias",Context.MODE_PRIVATE);

                        SharedPreferences.Editor editor = prefs.edit();
                        editor.putString("email", response.body().getEmail());
                        editor.putString("authToken", response.body().getAuthToken());
                        editor.commit();

                        Intent intentProspectos = new Intent(MainActivity.this,ProspectosActivity.class);
                        startActivity(intentProspectos);

                    }else{
                        try {
                            JSONObject jObjError = new JSONObject(response.errorBody().string());
                            Toast.makeText(MainActivity.this, jObjError.getString("error"), Toast.LENGTH_LONG).show();
                        } catch (Exception e) {
                            Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_LONG).show();
                        }
                    }
                }

                @Override
                public void onFailure(Call<User> call, Throwable t) {

                }
            });
    }
}
