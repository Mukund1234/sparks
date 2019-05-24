package com.example.santhoshnetha99.ideamanager.services;


import retrofit2.Call;
import retrofit2.http.GET;

public interface MessageService {
    @GET("messages")
    Call<String> getMessages();
}
