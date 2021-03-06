package com.example.crudmahasiswa.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class dataMahasiswa {
    //mendapatkan respon dari json
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("result")
    @Expose
    private List<resultMahasiswa> result = null;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<resultMahasiswa> getResult() { //mendapatkan list dari data result
        return result;
    }

    public void setResult(List<resultMahasiswa> result) {
        this.result = result;
    }
}
