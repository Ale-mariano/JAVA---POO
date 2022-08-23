/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treinamento;


public class Treinamento {
     public static void main(String[] args) {
        //INSTANCIAR O OBJETO CANETA
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.status();
       
    }
    
}
