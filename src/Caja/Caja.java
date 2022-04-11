package Caja;

import java.io.Serializable;

public class Caja implements Serializable
{
    private Integer ancho;
    private Integer alto;
    private Integer profundo;

    public Caja()
    {

    }

    public Caja(Integer ancho, Integer alto, Integer profundo)
    {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
    public static void Volumen(Integer ancho, Integer alto, Integer profundo)
    {
        Integer volumen = ancho * alto * profundo;
        System.out.println("volumen = " + volumen);
    }
}
