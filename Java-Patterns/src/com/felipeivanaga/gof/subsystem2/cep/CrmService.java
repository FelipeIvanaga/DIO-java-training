package com.felipeivanaga.gof.subsystem2.cep;

public class CrmService {

    private CrmService() {
        super();
    }

    public static void saveClient(String name, String cep, String state, String city) {
        System.out.println("Saved client on CRM.");
        System.out.println(name);
        System.out.println(cep);
        System.out.println(state);
        System.out.println(city);
    }
}
