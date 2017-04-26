package aula05b;
public class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    private char sexo;
    private boolean viver;
    
    // Construtor
    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.setViver(true);
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public boolean isViver() {
        return viver;
    }

    private void setViver(boolean viver) {
        this.viver = viver;
    }
}
