package org.example.services;

import io.restassured.response.Response;
import org.example.ApiException;
import org.example.config.ApiConfig;
import org.example.models.User;
import org.example.utils.HTTPStatusCode;

public class UserService {

    //Create user
    public User CreateUser(int id, String name, String job ){
        User user = new User();
        user.setName(name);
        user.setJob(job);

        Response response = ApiConfig.getRequestSpecification()
                .body(user)
                .post("/users")
                .thenReturn();

        if(response.statusCode() != HTTPStatusCode.CREATED){
            throw new ApiException("Error creating User with Status Code: " + response);
        }
        return response.as(User.class);
    }
    // get user By Id

    public User getUser(int id){
        Response response = ApiConfig.getRequestSpecification()
                .get("/users/"+id)
                .thenReturn();
        if(response.statusCode() != HTTPStatusCode.OK){
            throw new ApiException("Error getting User with Status Code: " + response);
        }
        return response.as(User.class);
    }
    public User updateUser(int id, String name, String job ){
        User user = new User();
        user.setName(name);
        user.setJob(job);

        Response response = ApiConfig.getRequestSpecification()
                .body(user)
                .put("/users/"+ id)
                .thenReturn();
        if(response.statusCode() != HTTPStatusCode.OK){
            throw new ApiException("Error updating User with Status Code: " + response);
        }
        return response.as(User.class);
    }

    public User deleteUser(int id){
        Response response =  ApiConfig.getRequestSpecification()
                .delete("/users/" + id)
                .thenReturn();
        if(response.statusCode() != HTTPStatusCode.NO_CONTENT){
            throw new ApiException("Error deleting User with Status Code: " + response);
        }
        return response.as(User.class);
    }

}
