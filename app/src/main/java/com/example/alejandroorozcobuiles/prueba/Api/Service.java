package com.example.alejandroorozcobuiles.prueba.Api;

import com.example.alejandroorozcobuiles.prueba.Models.Prospecto;
import com.example.alejandroorozcobuiles.prueba.Models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by alejandroorozcobuiles on 22/10/17.
 */

public interface Service {
        public String BASE_URL = "http://directotesting.igapps.co/";

        @GET("/application/login")
        Call<User> groupList(@Query("email") String email, @Query("password") String password);

        @GET("/sch/prospects.json")
        Call<ArrayList<Prospecto>> listProspectos(@Header("token") String authToken);

}
