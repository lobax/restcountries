package eu.fayder.restcountries.servlet;

import eu.fayder.restcountries.v2.rest.CountryRest;
import org.glassfish.jersey.server.ResourceConfig;

public class EndpointConfig extends ResourceConfig {
    public EndpointConfig() {
        register(CountryRest.class);
    }
}
