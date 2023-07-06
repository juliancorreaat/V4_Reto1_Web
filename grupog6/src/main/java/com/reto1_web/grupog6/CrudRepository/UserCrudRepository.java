package com.reto1_web.grupog6.CrudRepository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.reto1_web.grupog6.Entity.User;



public interface UserCrudRepository extends CrudRepository <User, Integer> {

    public Optional <User> findByEmail(String email);                               //BUSQUEDA DE EMAIL
                                                                                    //ESTE METODO HACE LO MISMO QUE LA CONSULTA SQL: SELECT * FROM USUARIOS WHERE EMAIL = emailRecibido
    
    public Optional<User> findByEmailAndPassword(String email, String password);    //BUSQUEDA DE EMAIL Y CONTRASEÑA PARA SU VALIDACION

}
