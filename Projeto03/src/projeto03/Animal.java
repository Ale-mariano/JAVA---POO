package projeto03;
public abstract class Animal {
    //Atributos
    private float peso;
    private int idade;
    private String membro;     
    //Metodos
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMembro() {
        return membro;
    }

    public void setMembro(String membro) {
        this.membro = membro;
    }
    
    
}
