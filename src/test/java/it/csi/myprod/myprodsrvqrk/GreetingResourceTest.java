package it.csi.myprod.myprodsrvqrk;

import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.security.TestSecurity;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GreetingResourceTest {

    @Test
    @TestSecurity(user="user1", roles = "writer")
    //@TestSecurity(authorizationEnabled = false)
    public void testHelloEndpoint() {
        given()
          .when().get("/myprodsrvqrk")
          .then()
             .statusCode(200)
             .body(is("Hello, and welcome to quarkusland!"));
    }

}