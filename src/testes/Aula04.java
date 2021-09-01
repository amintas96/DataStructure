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
public class Aula04 {
    public static void main(String[] args) {
        
        
        Vetor vet = new Vetor(10);
        
        vet.adiciona("Elemento 1");
        vet.adiciona("Elemento 2");
        vet.adiciona("Elemento 3");
        
        System.out.println(vet.toString());
    }
}
