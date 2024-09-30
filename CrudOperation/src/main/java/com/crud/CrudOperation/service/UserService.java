package com.crud.CrudOperation.service;

import com.crud.CrudOperation.config.UserNotFoundException;
import com.crud.CrudOperation.config.UserServiceException;
import com.crud.CrudOperation.model.User;
import com.crud.CrudOperation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository  = userRepository;
    }

    public User creteUser(User user){
        try{
            return userRepository.save(user);
        }catch(Exception ex){
            throw new UserServiceException("Failed to create user",ex);
        }
    }

    public List<User> getAllUsers(){
        try{
            return userRepository.findAll();
        }catch(Exception ex){
            throw new UserServiceException("Failed to retrieve users ",ex);
        }
    }

    public Optional<User> getUserById(Long id){
        try{
            return userRepository.findById(id);
        }catch (Exception ex){
            throw new UserServiceException("failed to retrieve user by id ",ex);
        }
    }

    public User updateUser(Long id , User user){
        try{
            if(userRepository.existsById(id)){
                user.setUserId(id);
                return userRepository.save(user);
            }
            else {
                throw new UserNotFoundException("User Not found with ID "+id);
            }
        }catch (Exception ex){
            throw new UserServiceException("Failed to Update user " ,ex);
        }
    }

    public void deleteUser(Long userId){
        try{
            if(userRepository.existsById(userId)){
                userRepository.deleteById(userId);
            }else{
                throw new UserNotFoundException("User not found with Id "+userId);
            }
        }catch(Exception ex){
            throw new UserServiceException("failed to delete user with id",ex);
        }
    }
}
