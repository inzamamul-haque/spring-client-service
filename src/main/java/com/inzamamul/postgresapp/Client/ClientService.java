package com.inzamamul.postgresapp.Client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient (value = "project", url = "http://localhost:9005/")
@Service
public interface ClientService {

    @GetMapping(value = "project/getName")
    String getName();

}
