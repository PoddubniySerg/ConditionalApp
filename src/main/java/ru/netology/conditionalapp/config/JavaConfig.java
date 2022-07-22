package ru.netology.conditionalapp.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.conditionalapp.service.DevProfile;
import ru.netology.conditionalapp.service.ProductionProfile;
import ru.netology.conditionalapp.service.SystemProfile;

@Configuration
public class JavaConfig {

    @Bean
    @ConditionalOnProperty(value = "netology.profile.dev")
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(value = "netology.profile.prod")
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }

}