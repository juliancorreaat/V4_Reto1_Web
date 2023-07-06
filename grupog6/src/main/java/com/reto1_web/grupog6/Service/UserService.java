package com.reto1_web.grupog6.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reto1_web.grupog6.Entity.User;
import com.reto1_web.grupog6.Repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAll(){                                 // VERIFICACION DE TODOS LOS USUARIOS
        return userRepository.getAll();
    }

    public Optional <User> getUser(int id){                     // VERIFICACION DE UN USUARIO ESPECIFICO
        return userRepository.getUser(id);
    }

    public boolean emailExists(String email){                   // VALIDACION DE EXISTENCIA DE EMAIL
        Optional <User> usuarioEncontrado = userRepository.findByEmail(email);
        return usuarioEncontrado.isPresent();
    }

    public boolean validAttributes(User user){
        return (user.getEmail()!=null && user.getPassword()!=null && user.getName()!=null);
    }

    public User save(User user){
        if(!emailExists(user.getEmail())){
            if(validAttributes(user)){
                return userRepository.save(user);
            }
        }
        return user;
    }

    public User authUser(String email, String password){
        Optional<User> usuarioEncontrado = userRepository.findByEmailAndPassword(email, password);
        if(usuarioEncontrado.isPresent()){
            return usuarioEncontrado.get();
        }else{
            return new User(null, email, password , "NO DEFINIDO" );
        }
    }

    
    
}
