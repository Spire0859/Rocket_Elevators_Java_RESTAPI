package com.rocketapi.app.rest.Models;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthRequest {

    @NotNull
    private String email;

    @NotNull
    private String password;

}