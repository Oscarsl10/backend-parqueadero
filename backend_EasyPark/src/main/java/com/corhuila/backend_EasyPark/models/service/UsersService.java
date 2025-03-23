package com.corhuila.backend_EasyPark.models.service;

import com.corhuila.backend_EasyPark.models.entity.Users;
import com.corhuila.backend_EasyPark.models.repository.IUsersRepository;
import com.corhuila.backend_EasyPark.requests.LoginRequest;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsersService {

    @Autowired
    IUsersRepository usersRepository;

    public Users addUser(Users user){
        return usersRepository.save(user);
    }

    public Boolean loginUser(LoginRequest loginRequest){

        Optional<Users> user = usersRepository.findById(loginRequest.getUserId());
        if(user == null){
            return false;
        }

        Users user1 = user.get();
        if(!user1.getPassword().equals(loginRequest.getPassword())){
            return false;
        }
        return true;
    }
}