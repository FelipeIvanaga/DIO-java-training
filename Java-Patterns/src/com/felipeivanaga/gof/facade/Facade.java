package com.felipeivanaga.gof.facade;

import com.felipeivanaga.gof.subsystem1.crm.CepApi;
import com.felipeivanaga.gof.subsystem2.cep.CrmService;

public class Facade {
    public void migrateClient(String name, String cep) {
        String city = CepApi.getInstance().getCity(cep);
        String state = CepApi.getInstance().getState(cep);


        CrmService.saveClient(name, cep, state, city);
    }
}
