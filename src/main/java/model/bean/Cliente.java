package model.bean;

public class Cliente {
    
    private int id;
    private String nome;
    private long cpf;
    private String contato;
    private String email;
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public long getCpf() {
        return cpf;
    }
    
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
    
    public String getContato() {
        return contato;
    }
    
    public void setContato(String contato) {
        this.contato = contato;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
}
