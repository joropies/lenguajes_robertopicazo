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
public class ProbarColecciones {
    
    public static void main(String[] args) {
        
        PersistenciaUsuarios p = new PersistenciaUsuarios();
        
        System.out.println(p.obtenerusuario().size());
        // p.obtenerusuario carga todos los usuario
        // p.size indica cuantos usuarios hay
        
        System.out.println("LOGIN" + "\t" + "PASSWORD" + "\t" + "CALLE");
        
         for (Usuario u: p.obtenerusuario()){
         
             //System.out.println("LOGIN" + "\t" + "PASSWORD" + "DIRECCION" );
             //System.out.println("El login es " + u.getLogin() + "\t" + u.getPassword());
             System.out.println(u.getLogin() + "\t" + u.getPassword() + "\t" + "\t" + u.getDireccion().getCalle());
         }    
    }
    
}
