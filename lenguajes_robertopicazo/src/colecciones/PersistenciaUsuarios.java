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
import java.util.*;

public class PersistenciaUsuarios {

    public ArrayList<Usuario> obtenerusuario() {
        // al poner <Usuario> quiere decir que solo admite Usuario
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        // este es el constructor de la clase array list y que recibe objetos tipo Usuario
        // con este se podria usar JSON

        //Empezamos a llenar el ArrayList generico a la clase Usuario
        Direccion d1 = new Direccion();
        d1.setCalle("Avenida Mexico");
        d1.setColonia("Ejidos Tulpetlac");
        d1.setCp(55130);
        d1.setMunicipio("Ecatepec");

        Usuario u1 = new Usuario();
        u1.setDireccion(d1);
        u1.setLogin("juan");
        u1.setPassword("algo");

        // usar los metodos del ArrayListpara guardar el usuario
        // finalmente es un arreglo anidado, es decir, un arreglo de arreglos
        usuarios.add(u1);

        Direccion d2 = new Direccion();
        d2.setCalle("La Viga");
        d2.setColonia("Jajalpa");
        d2.setCp(55123);
        d2.setMunicipio("Ecatepec");

        Usuario u2 = new Usuario();
        u2.setDireccion(d2);
        u2.setLogin("ana");
        u2.setPassword("bien");

        usuarios.add(u2);

        Direccion d3 = new Direccion();
        d3.setCalle("Sur 44");
        d3.setColonia("Vicente Villada");
        d3.setCp(50090);
        d3.setMunicipio("Nezahualcoyolt");

        Usuario u3 = new Usuario();
        u3.setDireccion(d3);
        u3.setLogin("pedro");
        u3.setPassword("nose");

        usuarios.add(u3);

        return usuarios;
    }
}
