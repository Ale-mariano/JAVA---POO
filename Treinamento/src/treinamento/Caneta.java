/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treinamento;
public class Caneta {

// ATRIBUTOS
    private String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;
       
    public Caneta(String m, String c, float p){ // Metodo construtor
       this.modelo = m;
       this.cor = c;
       this.SetPonta(p);
    }
      public String getModelo() {
          return this.modelo;
 }
      public void SetModelo(String m) {
          this.modelo = m;
      }
      public float getPonta() {
          return this.ponta;
      }
      public void SetPonta(float p) {
          this.ponta = p;
      }
      
      public void tampar(){
              this.tampada = true;
         
      }
      public void destampar() {
            this.tampada = false;
              
          }
      public void staus() {
          System.out.println("SOBRE A CANETA:");
          System.out.println("Modelo: " + this.getModelo());
          System.out.println("Ponta: " + this.getPonta());
          System.out.println("Cor: " + this.cor);
          System.out.println("Tampada: " + this.tampada);
      }
     
}