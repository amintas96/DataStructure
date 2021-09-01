/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import array.VetorObjetos;

/**
 *
 * @author 33424_amintas
 */
public class Aula10 {
    public static void main(String[] args) {
        VetorObjetos vetor = new  VetorObjetos(3);
        
        vetor.adiciona(3);
        vetor.adiciona("olá mundo!");
        
        System.out.println(vetor);
                
        
    }
}
