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
public class Imc {
    
    public float calcular (Usuario u){
        //Aqui va la logica del calculo
        float resultado = u.peso/(u.altura*u.altura);
        return resultado;
    }
}
