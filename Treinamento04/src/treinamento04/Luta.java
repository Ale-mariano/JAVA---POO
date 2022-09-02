package treinamento04;

import java.util.Random;

public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //Metodos publicos
   public void marcarLuta(Lutador L1, Lutador L2){
       if(L1.getCategoria().equals(L2.getCategoria())
           && L1 != L2) {
          this.aprovada = true;
          this.desafiado = L1;
          this.desafiante = L2;
          
       }else{
           this.aprovada = false;
           this.desafiado = null;
           this.desafiante = null;
       }
       
   }
   public void lutar(){
      if (this.aprovada) {
        System.out.println("### DESAFIADO ###");
        this.desafiado.apresentar();
        System.out.println("### DESAFIANTE ###");
        this.desafiante.apresentar();
        
        Random aleatorio = new Random(); //gera o resultado da luta
          int vencedor = aleatorio.nextInt(3);  //0 1 2   
          System.out.println("=====RESULTADO DA LUTA=====");
          switch (vencedor){
              case 0:
                  System.out.println("Empatou!"); 
                  this.desafiado.empatarLuta();
                  this.desafiante.empatarLuta();
                  break;
            
              case 1:
                  System.out.println("Vitoria do " + this.desafiado.getNome());
                  this.desafiado.ganharLutar();
                  this.desafiante.perderLuta();
                  break;
                  
              case 2:
                 System.out.println("Vitoria do " + this.desafiante.getNome()); 
                  this.desafiante.ganharLutar();
                  this.desafiado.perderLuta();                 
            }
            System.out.println("==============================");
          
      } else{
          System.out.println("A luta não pode acontecer");
      }
       
   }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
