/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poop5;

/**
 *
 * @author lenovo
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("############getters y setters#############");
        Circulo cir = new Circulo();
        System.out.println(cir);
        cir.setRadio(5);
        System.out.println(cir);
        System.out.println("Radio de cir = "+cir.getRadio());
        cir.setRadio((float)7.2);
        cir.setRadio(8.9f);
        
        float var = 5;
        cir.setRadio(var);
        
        cir.setRadio(-7);
        System.out.println(cir);
        
        System.out.println("###############composición################");
        Persona persona1 = new Persona();
        persona1.setNombre("Antonio");
        persona1.setApellido("López");
        Fecha fNac = new Fecha(14,10,2021);
        persona1.setfNacimiento(fNac);
        System.out.println(persona1);
        
        System.out.println("###############composición2##############");
        Fecha fNac2 = new Fecha(25,10,1999);
        Persona persona2 = new Persona("Ricardo","López",fNac2);
        System.out.println(persona2);
        
        System.out.println("###############composición3##############");
        Persona persona3 = new Persona("Liliana","Fuentes",22,4,1998);
        System.out.println(persona3);
        
        System.out.println("###############composición4##############");
        Coche coche1 = new Coche("Volkswagen","Vento","Café",2018,15000,false,"Alan","Quintana",15,04,2000,"Juan","Lira",
                05,02,98,"Ignacio","García",29,05,97,"Diego","González",15,12,99);
        System.out.println(coche1);
    }
    
}
