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
public class Nomina {
    private String nombre;
    private String aPaterno;
    private long numeroseguro;
    private float sueldoBase;

    public Nomina() {
        
    }

    public Nomina(String nombre, String aPaterno, long numeroseguro, float sueldoBase) {
        this.nombre = nombre;
        this.aPaterno = aPaterno;
        this.numeroseguro = numeroseguro;
        this.sueldoBase = sueldoBase;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getaPaterno() {
        return aPaterno;
    }

    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }

    public long getNumeroseguro() {
        return numeroseguro;
    }

    public void setNumeroseguro(long numeroseguro) {
        this.numeroseguro = numeroseguro;
    }

    public float getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

}
