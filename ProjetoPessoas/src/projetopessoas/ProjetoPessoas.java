package projetopessoas;
public class ProjetoPessoas {

   
    public static void main(String[] args) {
       Pessoa p1 = new Pessoa();
       Aluno p2 = new Aluno();
       Professor p3 = new Professor();
       Funcionario p4 = new Funcionario();
       
       p1.setNome("PEDRO");
       p2.setNome("MARIA");
       p3.setNome("CLAUDIO");
       p4.setNome("FABIANA");
       
       p1.setSexo("M");
       p4.setSexo("F");
       p2.setSexo("18");
       
       p2.setCurso("informatica");
       p3.setSalario(2500.75f);
       p4.setSetor("Estoque");
       
      // p1.receberAumento(550.20f); // vai dar errado pq é herança
      // p2.mudarTrabalho();         // vai dar errado pq é herança
      // p4.cancelarmatr();         // vai dar errado pq é herança
       
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
    
}
