package com.example.crudserivicio.api;

import com.example.crudserivicio.entity.Revista;

import java.util.List;
import java.util.Optional;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ServiceRevistaApi {

    @GET("revista")
    public abstract Call<List<Revista>> listaRevista();

    @GET("revista/{id}")
    public abstract Call<Optional<Revista>> buscaRevista(String id);

    @POST("revista")
    public abstract Call<Revista> insertaRevistar(@Body Revista obj);

    @PUT("revista")
    public abstract Call<Revista> actualizarRevistar(@Body Revista obj);

    @DELETE("revista/{id}")
    public abstract Call<Revista> eliminaRevistar(@Path("id") String id);

}
