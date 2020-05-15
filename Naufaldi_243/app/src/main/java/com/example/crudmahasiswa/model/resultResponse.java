package com.example.crudmahasiswa.model;

public class resultResponse {
    //mendapatkan respon dari json
    String status; //respon yg ada pada json
    String message;

    public String getStatus() {
        return status;
    } //mendapatka nilai status ( respon yang ada pada json )

    public String getMessage() {
        return message;
    }
}
