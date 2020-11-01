
package com.yisus.tareahilos;

public class Hilar implements Runnable {
    private String Nombre;                                                                 

    public Hilar (String Nombre)
    {
        this.Nombre=Nombre;
    }
    
    @Override
    public void run()
    {
        try
        {
            for (int x=1;x<=10;x++)
            {
                int Espera=(int)(Math.random()*2000);
                System.out.print("\n" + Nombre + " " + x + " " + Espera);
                Thread.sleep(Espera);
            }
        }
        catch(Exception exe)
        {
            System.out.print("Excepción");
        }
    }
    
    public static void main(String[] args) {
        
        Hilar h1 = new Hilar("Hilo 1");
        Hilar h2 = new Hilar("Hilo 2");
        Hilar h3 = new Hilar("Hilo 3");
        Hilar h4 = new Hilar("Hilo 4");
        
        Thread t1 = new Thread (h1);
        Thread t2 = new Thread (h2);
        Thread t3 = new Thread (h3);
        Thread t4 = new Thread (h4);
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
        System.out.print("Termina main");
    }
}
