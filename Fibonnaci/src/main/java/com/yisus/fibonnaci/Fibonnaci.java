/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yisus.fibonnaci;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Fibonnaci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int Valor1=0,Valor2=1,Iteraciones=10;
        
        System.out.print(Valor1+"\n");
        System.out.print(Valor2+"\n");
        int x=0;
        
        do
        {
            int Valor3=Valor1+Valor2;
            System.out.print(Valor3 +"\n");
            Valor1=Valor2;
            Valor2=Valor3;
            x++;
        }while(x<Iteraciones);
        
    }
    
}
