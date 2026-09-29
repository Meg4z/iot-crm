package br.consultoriait.crm.model;

public class Cliente {
    private  int id;
    private String nome;
    private String email;
    private String telefone;
    private  ClassificacaoLead classificacao;




public Cliente(int id, String nome, String email, String telefone, ClassificacaoLead classificacao){
    this.id=id;
    setNome(nome);
    setEmail(email);
    setTelefone(telefone);
    setClassificacao(classificacao);
}

public int getId(){
    return id;
}

public String getNome(){
    return nome;
}

public String getEmail(){
    return email;
}

public String getTelefone(){
    return telefone;
}

public ClassificacaoLead getClassificacao(){
    return classificacao;
}


public void setNome(String nome) {
    if (nome == null || nome.isBlank()) {
        throw new IllegalArgumentException("Digite um nome.");
    }
    this.nome = nome;
}


public void setEmail(String novoEmail){
    if (novoEmail == null || !novoEmail.contains("@")){
        throw new IllegalArgumentException("Email inválido.");
    }
    this.email = novoEmail;
}

public void setTelefone(String telefone) {
    if (telefone == null || telefone.length() > 11 || telefone.length() < 10 ) {
        throw new IllegalArgumentException("Telefone Inválido.");
    }
    this.telefone = telefone;
}

public void setClassificacao(ClassificacaoLead classificacao) {
    if (classificacao == null ) {
        throw new IllegalArgumentException("Classificação Inválida.");
    }
    this.classificacao = classificacao;
}
}