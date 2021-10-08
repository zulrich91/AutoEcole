package com.example.autoecole;

import com.example.autoecole.repositories.ClientRepository;
import com.example.autoecole.repositories.SeanceCodeRepository;
import com.example.autoecole.services.ClientService;
import com.example.autoecole.services.ClientServiceImpl;
import com.example.autoecole.services.SeanceCodeService;
import com.example.autoecole.services.SeanceCodeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean
    public ClientService clientService(ClientRepository clientRepository){
        return new ClientServiceImpl(clientRepository);
    }

    @Bean
    public SeanceCodeService seanceCodeService(SeanceCodeRepository seanceCodeRepository){
        return new SeanceCodeServiceImpl(seanceCodeRepository);
    }
}
