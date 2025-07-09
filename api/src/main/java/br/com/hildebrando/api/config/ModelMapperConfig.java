package br.com.hildebrando.api.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper mapper() {
         return new ModelMapper();
    }
}
