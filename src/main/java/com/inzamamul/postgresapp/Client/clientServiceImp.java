package com.inzamamul.postgresapp.Client;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class clientServiceImp {

    private final ClientService clientService;

    public String getName()
    {
        String getName = clientService.getName();
        return getName;
    }

}
