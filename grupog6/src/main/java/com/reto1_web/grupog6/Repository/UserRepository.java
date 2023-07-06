package com.reto1_web.grupog6.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.reto1_web.grupog6.CrudRepository.UserCrudRepository;
import com.reto1_web.grupog6.Entity.User;

@Repository
public class UserRepository {

    @Autowired
    private UserCrudRepository userCrudRepository;

    public List<User>getAll(){                                  // LISTA DE USUARIOS
        return (List<User>)userCrudRepository.findAll();        // ES CONVERTIDO DE UN ITERABLE A UNA LISTA
    }  
    
    public Optional<User> getUser(int id){                      // BUSQUEDA DE UN USUARIO ESPECIFICO
        return userCrudRepository.findById(id);
    }

    public User save(User user){
        return userCrudRepository.save(user);
    }

    public Optional <User> findByEmail(String email){           //BUSQUEDA DE EMAIL
        return userCrudRepository.findByEmail(email);           //ESTE METODO HACE LO MISMO QUE LA CONSULTA SQL: SELECT * FROM USUARIOS WHERE EMAIL = emailRecibido
    }                               
                                       
    public Optional<User> findByEmailAndPassword(String email, String password){    //BUSQUEDA DE EMAIL Y CONTRASEÑA PARA SU VALIDACION
        return userCrudRepository.findByEmailAndPassword(email, password);
    }

    public void delete(User user){
        userCrudRepository.delete(user);
    }



}
