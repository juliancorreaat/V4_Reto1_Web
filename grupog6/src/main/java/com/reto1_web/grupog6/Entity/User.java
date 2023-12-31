package com.reto1_web.grupog6.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)                      // GENERACION AUTOMATICA DEL ID
    
    private Integer id;
    private String email;
    private String password;
    private String name;

    public User(Integer id, String email, String password, String name) {   // METODO CONSTRUCTOR CON TODOS LOS ATRIBUTOS
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
    }

    public User (){                                                         // USUARIO VACIO PARA CREAR UNA NUEVA INSTANCIA

    }
                                                                            // GENERAR GETTERS AND SETTERS
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
