package com.example.crudmahasiswa.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class dataDashboard {
    //untuk mendapatkan respon dari json
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("result")
    @Expose
    private resultDashboard result;

    public String getStatus() { //mengambil nilai dari status
        return status;
    }

    public void setStatus(String status) { //set nilai pada status
        this.status = status;
    }

    public resultDashboard getResult() { //mengambil nilai dari result
        return result;
    }

    public void setResult(resultDashboard result) { //set nilai pada result
        this.result = result;
    }
}
