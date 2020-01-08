package eu.fayder.restcountries.v2;

import org.junit.Test;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class ITCase {
    @Test
    public void test() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Invocation.Builder request = ClientBuilder.newClient().target("http://localhost:8080/v2/all").request();
        Response res = request.get();
        System.out.println(res.getStatus());
        System.out.println(res.toString());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
