
package treinamento2;
public class Treinamento2 {
    public static void main(String[] args) {
       ContaBanco p1 = new ContaBanco();
       p1.setnumConta(1111);
       p1.setDono("JOAO");
       p1.abrirConta("CC");
             
       ContaBanco p2 = new ContaBanco();
       p2.setnumConta(2222);
       p2.setDono("ANA");
       p2.abrirConta("CP");
              
      p1.depositar(200);
      p2.depositar(500);
      p1.sacar(250);
      p1.fecharconta();
      
      p1.estadoAtual();
      p2.estadoAtual();
    }
    
}
