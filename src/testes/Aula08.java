/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import array.Vetor;

/**
 *
 * @author 33424_amintas
 */
public class Aula08 {
   
    public static void main(String[] args) {
        Vetor vetor = new Vetor(2);
        
        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("D");
        vetor.adiciona("E");
        System.out.println(vetor);
               
        
        vetor.removeElementos(3);
        
        System.out.println(vetor);
        
    }
}
