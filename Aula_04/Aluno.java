package Aula_04;
public class Aluno {
    private int ra;
    private String nome;
 
    public Aluno (int ra, String nome){
        this.ra=ra;
        this.nome=nome;        
    }
 
    public void setRa(int ra) {
        this.ra = ra;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }
 
        public String getNome() {
        return nome;
    }
 
     public int getRa() {
        return ra;
    }
}
