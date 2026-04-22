package com.coditas.iplmatchticketbookingsystem.controller;

import com.coditas.iplmatchticketbookingsystem.dto.user.RegisterRequest;
import com.coditas.iplmatchticketbookingsystem.dto.user.RegisterResponse;
import com.coditas.iplmatchticketbookingsystem.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService=userService;
    }

    @PostMapping("/users/register")
    public ResponseEntity<RegisterResponse> registerUser(@RequestBody RegisterRequest request){
        RegisterResponse response = userService.registerUser(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PostMapping("/admin/register")
    public ResponseEntity<RegisterResponse> registerAdmin( @Valid @RequestBody RegisterRequest request){
        RegisterResponse response = userService.registerAdmin(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
