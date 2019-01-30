package com.futebol.sigpeladajsf.config;

import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;
@ComponentScan({"com.futebol.sigpeladajsf.beans"})
@EntityScan(basePackages = {"com.futebol.sigpeladajsf.dominio"})
@Configuration
public class ViewScopeConfig {

    @Bean
    public static CustomScopeConfigurer customScopeConfigurer() {
        Map<String, Object> scopes = new HashMap<>();
        scopes.put("view", new ViewScope());

        CustomScopeConfigurer customScopeConfigurer = new CustomScopeConfigurer();
        customScopeConfigurer.setScopes(scopes);

        return customScopeConfigurer;
    }
}