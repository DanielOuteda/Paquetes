package exemplopaquetes;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author doutedasolla
 */
public class MeusMetodos {
    
    public float validaFloatPositivo(){
        Scanner sc = new Scanner(System.in);
        float valor;
        do{
            valor = sc.nextFloat();
            return valor;
        }while (valor<=0);
    }
    
    
    public static float darValor(){
        Scanner sc = new Scanner(System.in);
        float valor;
        do{
            valor = sc.nextFloat();
            return valor;
        }while (valor<=0);
    }
    
    
}
