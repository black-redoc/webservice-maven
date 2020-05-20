package com.sebas.webservicecbco.api;

import com.sebas.webservicecbco.checkout.AuthenticateUser;
import com.sebas.webservicecbco.checkout.AuthenticateUserResponse;
import com.sebas.webservicecbco.checkout.UserRequest;
import com.sebas.webservicecbco.client.SoapClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class CheckoutAPI {
    @Autowired
    private SoapClient client;

    @PostMapping("/authenticate/user")
    public AuthenticateUserResponse authenticateUser(AuthenticateUser authenticateUser) {
        return client.authenticateUser(authenticateUser);
    }
}
