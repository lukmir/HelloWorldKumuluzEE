package com.kumuluzeehelloworld.controller.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@Path("/rest")
public class RestResource {

    @GET
    public Response getResources() {
        Map<String, String> json = new HashMap<>();
        json.put("hello", "world");

        return Response.ok(json).build();
    }
}
