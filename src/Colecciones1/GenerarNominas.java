/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones1;

/**
 *
 * @author T-
 */
import java.util.*;
public class GenerarNominas {
    public static void main(String[] args) {
        //generamos el trabajador
        NominaContrato nc = new NominaContrato("Juan","Lopez",1234,45000);
        NominaHonorarios nh = new NominaHonorarios("Ana","Perez",4321,60000,0.16f,0.16f);
        //generamos un arraylist para meter las dos nominas anteriores
        ArrayList<Nomina> misNominas = new ArrayList<>();
        //Para agergar un objeto a este arreglo de tipo arraylist usamos add
        misNominas.add(nc);
        misNominas.add(nh);
        //iterando el arraylist ¿
        for(Nomina nomina: misNominas ){
            System.out.println("El nombre del usuario es " + nomina.getNombre());
        }
    }
}
