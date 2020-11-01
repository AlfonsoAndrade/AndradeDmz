/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yisus.tareahilos;


public class Hilo extends Thread {
    private String Nombre;
    
    public Hilo(String Nombre)
    {
        this.Nombre=Nombre;
    }
    
    @Override
    public void run()
    {
        try
        {
            for(int x=1;x<=10;x++)
            {
                int Espera =(int)(Math.random()*5000);
                System.out.print("\n" + Nombre+ " " + x + " " + Espera);
                Thread.sleep(Espera);
            }
        }catch(Exception exe)
        {
            System.out.print("Exception");
        }
            
    }
    
    public static void main(String[] args) {
    
        Hilo h1 = new Hilo ("Hilo 1");
        Hilo h2 = new Hilo ("Hilo 2");
        Hilo h3 = new Hilo ("Hilo 3");
        Hilo h4 = new Hilo ("Hilo 4");
        
        h1.start();
        h2.start();
        h3.start();
        h4.start();
        
        System.out.print("Termina Main");
    }
    
}
