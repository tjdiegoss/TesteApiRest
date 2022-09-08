
package Model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

/*
 *
 * @author Diego
 */

@Entity
@Table(name = "CLIENTE")
public class ClienteModel {


    @Id
    private String cpf;
    private String nome;
    private String email;
    private EnderecoModel endereco;
    private TelefoneModel telefone;
    private LocalDateTime datanascimento;


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EnderecoModel getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoModel endereco) {
        this.endereco = endereco;
    }

    public TelefoneModel getTelefone() {
        return telefone;
    }

    public void setTelefone(TelefoneModel telefone) {
        this.telefone = telefone;
    }

    public LocalDateTime getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(LocalDateTime datanascimento) {
        this.datanascimento = datanascimento;
    }

    public ClienteModel() {
    }

    public ClienteModel(String cpf, String nome, String email, EnderecoModel endereco,
                        TelefoneModel telefone, LocalDateTime datanascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
        this.datanascimento = datanascimento;
    }

    @Override
    public String toString() {
        return "ClienteModel{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", endereco=" + endereco +
                ", telefone=" + telefone +
                ", datanascimento=" + datanascimento +
                '}';
    }
}
