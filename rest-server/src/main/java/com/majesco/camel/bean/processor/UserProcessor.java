package com.majesco.camel.bean.processor;

import org.apache.camel.Body;
import org.springframework.stereotype.Component;

import javax.ws.rs.core.Response;

/**
 * Created by biplab661592 on 9/23/2015.
 */
@Component("userProcessor")
public class UserProcessor {
    public Response convertToResponse (@Body String body) {
        System.out.println("IN Proccessor -------- " + body );
        return Response.status(200).entity(body).build();
    }
}
