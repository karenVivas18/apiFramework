package org.example.config;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class ApiConfig {
    private static final String BASE_URL = "https://reqres.in/api";

    public static RequestSpecification getRequestSpecification() {
        return RestAssured.given()
                .baseUri(BASE_URL)
                .header("Content-Type", "application/json");
    }
}
