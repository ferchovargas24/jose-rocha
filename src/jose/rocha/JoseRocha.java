/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jose.rocha;

/**
 *
 * @author T-
 */
public class JoseRocha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.println("Hola mundo cruel");
        
        //Probaremos nuestra solucion
        //Crear un usuario hipotetico
        Usuario u = new Usuario();
        //Asignar valores
        //Generamos el modelo
        Imc imc = new Imc();
        imc.calcular(u);
        System.out.println("El valor de imc es " + imc.calcular(u));
    }
    
}
