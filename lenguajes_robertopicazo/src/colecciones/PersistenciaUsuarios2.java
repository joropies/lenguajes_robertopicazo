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
    public PersistenciaUsuarios2() {
        // se inicializa por que no existe y no quede en NULL
        usuarios = new ArrayList<Usuario>();
        
    }
    
    public void guardar(Usuario u) throws Exception {
    // un metodo que recibe un usuario
        // este metodo usa el de abajo (buscar todos) por lo que primero se busca y despues ee guarda
        // que vaya guardando, es decir que lea el archivo y no lo sobreescriba
        
        File f = new File("D:\\usuarios.xxx");
        
        if (f.exists()) {
            usuarios = buscarTodos();
            // buscartodos es igual a un select all en SQL
        }
        // busca todos los usuraios en el archivo
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        // con el objectoutput se hace la serializacion
        usuarios.add(u);
        oos.writeObject(usuarios);
        // se tiene que guardar a usuarios y no a u.
        // una vez sobrescrito el archivo con el nuevo registro lo guarda.
        // el array list tiene indices automaticos
        
    }
    
    public ArrayList<Usuario> buscarTodos() throws Exception {
        // buscartodos es igual a un select all en SQL
        File file = new File("D:\\usuarios.xxx");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        // con el objectoutput se hace la serializacion
        usuarios = (ArrayList<Usuario>) ois.readObject();
        // se tiene que hacer un casting para que se vuelva un objeto
        // readobject regresa todo el arreglo leido por el sistema
        return usuarios;
    }
    
    public Usuario buscarUno(Usuario u) throws Exception {
        File f = new File("D:\\usuarios.xxx");
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        usuarios = (ArrayList<Usuario>)ois.readObject();
        

        
        
        usuarios.size();
        

        // aqui solo busca el usuario por nombre o por password o login
        return u;
        
    }
    
}
