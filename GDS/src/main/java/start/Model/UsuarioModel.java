package start.Model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_usuario")
public class UsuarioModel {

@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
private Long id;
private String nome;
private String cpf; //add chave unica
private LocalDate dataNascimento;
private String celular;
private String email; //add chave unica //verificar o email
private String senha;

public UsuarioModel() {
}

public UsuarioModel(Long id, String nome, String cpf, LocalDate dataNascimento, String celular, String email,
        String senha) {
    this.id = id;
    this.nome = nome;
    this.cpf = cpf;
    this.dataNascimento = dataNascimento;
    this.celular = celular;
    this.email = email;
    this.senha = senha;
}

public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
}
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public String getCpf() {
    return cpf;
}
public void setCpf(String cpf) {
    this.cpf = cpf;
}
public LocalDate getDataNascimento() {
    return dataNascimento;
}
public void setDataNascimento(LocalDate dataNascimento) {
    this.dataNascimento = dataNascimento;
}
public String getCelular() {
    return celular;
}
public void setCelular(String celular) {
    this.celular = celular;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
public String getSenha() {
    return senha;
}
public void setSenha(String senha) {
    this.senha = senha;
}

}
