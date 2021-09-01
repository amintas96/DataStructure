

package testes;
import array.Vetor;


public class Aula05 {
    
    public static void main(String[] args) {
        Vetor vet = new Vetor(10);
        
        vet.adiciona("Elemento 1");
        vet.adiciona("Elemento 2");
        vet.adiciona("Elemento 3");
        
        System.out.println(vet.busca(0));
    }
    
}
