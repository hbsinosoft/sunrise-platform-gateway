package com.sunrise.platform.gateway.config;

import com.sunrise.platform.gateway.gateway.accesscontrol.AccessControlFilter;
import com.sunrise.platform.gateway.gateway.responserewriting.SwaggerBasePathRewritingFilter;
import io.github.jhipster.config.JHipsterProperties;
import org.springframework.cloud.netflix.zuul.filters.RouteLocator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfiguration {

    @Configuration
    public static class SwaggerBasePathRewritingConfiguration {

        @Bean
        public SwaggerBasePathRewritingFilter swaggerBasePathRewritingFilter() {
            return new SwaggerBasePathRewritingFilter();
        }
    }

    @Configuration
    public static class AccessControlFilterConfiguration {

        @Bean
        public AccessControlFilter accessControlFilter(RouteLocator routeLocator, JHipsterProperties jHipsterProperties) {
            return new AccessControlFilter(routeLocator, jHipsterProperties);
        }
    }
}