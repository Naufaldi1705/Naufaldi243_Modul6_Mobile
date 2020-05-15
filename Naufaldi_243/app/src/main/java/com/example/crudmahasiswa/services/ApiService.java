package com.example.crudmahasiswa.services;

import com.example.crudmahasiswa.model.dataDashboard;
import com.example.crudmahasiswa.model.dataMahasiswa;
import com.example.crudmahasiswa.model.resultResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiService {
    //interface (penamaan data  yang kita inputkan dan untuk mendapatkan respon)
    @GET("read.php") //menampilkan nilai dari seluruh mahasiswa
    Call<dataMahasiswa> getdataMahasiswa();

    @FormUrlEncoded
    @POST("insert.php")//tambah mahasiswa
    Call<resultResponse> daftar(@Field("nim") String nim, //data yang perlu di insert
                                @Field("nama") String nama,
                                @Field("fakultas") String fakultas,
                                @Field("jurusan") String jurusan);

    @FormUrlEncoded
    @POST("update.php")//update mahasiswa
    Call<resultResponse> update(@Field("id") String id, //data yang dapat diupdate
                                @Field("nim") String nim,
                                @Field("nama") String nama,
                                @Field("fakultas") String fakultas,
                                @Field("jurusan") String jurusan);

    @FormUrlEncoded
    @POST("delete.php")//hapus data dengan berdasarkan id
    Call<resultResponse> delete(@Field("id") String id);

    @GET("dashboard.php") //tampil total data
    Call<dataDashboard> getdataDasboard();
}
