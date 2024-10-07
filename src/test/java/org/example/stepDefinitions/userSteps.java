package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import org.example.models.User;
import org.example.services.UserService;

import javax.xml.ws.Response;

public class userSteps {
    private UserService userService = new UserService();
    private Response response;
    private User user;

    @Given("I have the user details with name {string} and job {string}")
    public void iHaveTheUserDetailsWithNameAndJob(String name, String job) {
        user = new User();
        user.setName(name);
        user.setJob(job);
    }
}
