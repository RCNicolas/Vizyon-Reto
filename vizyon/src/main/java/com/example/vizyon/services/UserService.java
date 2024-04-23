package com.example.vizyon.services;

import com.example.vizyon.exceptions.InvalidUserException;
import com.example.vizyon.exceptions.UserDuplicateException;
import com.example.vizyon.models.User;
import com.example.vizyon.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public void userValidation(String username, String password) {
        User user = userRepository.findByUsername(username);
        if (user == null || !user.getEncryptedPass().equalsIgnoreCase(password)) {
            throw new InvalidUserException("Las credenciales ingresadas son invalidas");
        }
    }

    public Map<Object, Object> registerUser(User user) {
        try {
            userRepository.save(user);
            return new LinkedHashMap<>() {{
                put("message", "Usuario registrado conexito");
            }};
        } catch (Exception e) {
            throw new UserDuplicateException("El usuario ya esta registrado");
        }
    }
}
