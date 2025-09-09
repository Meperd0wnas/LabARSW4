package edu.eci.arsw.blueprints.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import edu.eci.arsw.blueprints.persistence.BlueprintsPersistence;
import edu.eci.arsw.blueprints.persistence.impl.InMemoryBlueprintPersistence;
import edu.eci.arsw.blueprints.persistence.impl.RedundancyFilter;

@Configuration
@ComponentScan(basePackages = "edu.eci.arsw.blueprints")
public class AppConfig {

    @Bean
    public BlueprintsPersistence persistence() {
        return new InMemoryBlueprintPersistence();
    }

    @Bean
    public BlueprintFilter filter() {
        return new RedundancyFilter(); // un filtro
    }
}