package br.com.agenda_contatos.model;

import java.io.Serializable;
import java.time.LocalDate; // Para melhor manuseio de datas
import java.time.LocalTime; // Para melhor manuseio de horas

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "TB_PESQUISA_SATISFACAO")
@SequenceGenerator(name = "seq_usuario", sequenceName = "seq_usuario", allocationSize = 1, initialValue = 1)
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_usuario")
    private Long id;

    @NotBlank(message = "O nome é obrigatório")
    private String nome;

    @Size(max = 15, message = "O telefone deve ter no máximo 15 caracteres")
    private String telefone;

    @Email(message = "Email inválido")
    private String email;

    private String anotacao;

    @Column(name = "data") // Usando Column para definir o nome da coluna se necessário
    private LocalDate data; // Usando LocalDate para melhor manipulação de data

    @Column(name = "hora") // Usando Column para definir o nome da coluna se necessário
    private LocalTime hora; // Usando LocalTime para melhor manipulação de hora

    // Getters e Setters
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAnotacao() {
        return anotacao;
    }

    public void setAnotacao(String anotacao) {
        this.anotacao = anotacao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
}
