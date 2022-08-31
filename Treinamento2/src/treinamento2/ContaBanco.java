package treinamento2;

public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //Metodos personalizados
    public void estadoAtual() {
      System.out.println("-------------------------------");
      System.out.println("Conta: " + this.getNunConta());  
      System.out.println("Tipo: " + this.getTipo());  
      System.out.println("Dono: " + this.getDono());  
      System.out.println("Saldo: " + this.getSaldo()); 
      System.out.println("Status: " + this.getStatus());  
    }
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if("CC".equals(t)){
            this.setSaldo(50);
      }else if ("CP".equals(t)) {
          this.setSaldo(50);
        }else if ("CP".equals(t)) {
            this.setSaldo(150);
            
        }
        System.out.println("Conta aberta com sucesso!");
}
    public void fecharconta(){
        if(this.getSaldo()> 0) {
            System.out.println("Conta não pode ser fechada com saldo");
        } else if(this.getSaldo()< 0){
            System.out.println("Conta não pode ser fechada com débito");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!!");
        }
     }
    public void depositar(float v){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo()+ v);
            System.out.println("Deposito realizado na conta de " + this.getDono());
        }else {
            System.out.println("Impossivel depositar em uma conta fechada!");
        }
    }
    public void sacar(float v){
        if(this.getStatus()){
            if (this.getSaldo()>= v){
                this.setSaldo(this.getSaldo()- v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            }else {
                System.out.println("Saldo insufuciente para saldo");
            }
            } else {
               System.out.println("Impossivel sacar de uma conta fechada");
        }
    }
    public void pagarMensal(){
        int v = 0;
        if("CC".equals(this.getTipo())){
            v = 12;
    }else if("CP".equals(this.getTipo())){
            v = 20;
    }
      if (this.getStatus()){
          this.setSaldo(this.getSaldo() - v);
          System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        }else{
          System.out.println("Impossivel pagar uma conta fechada!");
      }
    }
         
    //Metodos Especiais 
      //Construtor

    public ContaBanco() {
        this.saldo = 0;
        this.status =false;
    }

    public int getNunConta() {
        return numConta;
    }

    public void setnumConta(int NunConta) {
        this.numConta = NunConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}

