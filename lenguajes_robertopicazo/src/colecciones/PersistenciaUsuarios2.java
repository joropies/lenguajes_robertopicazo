/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

/**
 *
 * @author T-107
 */

import java.io.*;
import java.util.ArrayList;

public class PersistenciaUsuarios2 {
    // invocar un metodo guardar usuario
    // invocar otro metodo que lee usuario
    
    ArrayList<Usuario> usuarios;
    
    //inicializar arreglo
    public PersistenciaUsuarios2(){
    // se inicializa por que no existe y no quede en NULL
        usuarios = new ArrayList<Usuario>();
        
    }
    
    public void guardar(Usuario u) throws Exception {
    // un metodo que recibe un usuario
        // este metodo usa el de abajo (buscar todos) por lo que primero se busca y despues ee guarda
        // que vaya guardando, es decir que lea el archivo y no lo sobreescriba
        
        File f = new File("D:\\usuarios.sql");
        
        if (f.exists())usuarios = buscarTodos();
    
    
    }
    
    public ArrayList<Usuario> buscarTodos() throws Exception {
    
        // aqui tendria que mostrar todos
        return usuarios;
    }
    
    public Usuario buscarUno(Usuario u) throws Exception {
        File f = new File("D:\\usuarios.sql");
    
        // aqui solo busca el usuario por nombre o por password o login
        return u;
    
    }
    
}
