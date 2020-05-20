package com.sebas.webservicecbco.client;

import com.sebas.webservicecbco.checkout.AuthenticateUser;
import com.sebas.webservicecbco.checkout.AuthenticateUserResponse;
import com.sebas.webservicecbco.checkout.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
public class SoapClient {
    @Autowired
    private Jaxb2Marshaller marshaller;

    private WebServiceTemplate template;

    public AuthenticateUserResponse authenticateUser(AuthenticateUser authenticateUser) {
        template = new WebServiceTemplate(marshaller);
        return (AuthenticateUserResponse) template
            .marshalSendAndReceive(
            "https://testsrv.credibanco.com/CheckOutWSWeb/CheckoutWSService?wsdl",
                    authenticateUser);
    }
}
