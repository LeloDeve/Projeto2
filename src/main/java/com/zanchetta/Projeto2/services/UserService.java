package com.zanchetta.Projeto2.services;

import com.zanchetta.Projeto2.entities.User;
import com.zanchetta.Projeto2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
       return userRepository.findAll();
    }

    public User findById(Long id){
        Optional<User> user = userRepository.findById(id);

        return user.orElseThrow(()-> new RuntimeException("Id nao encontrado"));

    }


}
