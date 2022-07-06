package com.felipeivanaga.gof.subsystem1.crm;

public class CepApi {
    private static CepApi instance = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstance() {
        return instance;
    }

    public String getCity(String cep) {
        return "Curitiba";
    }

    public String getState(String cep) {
        return "PR";
    }
}
