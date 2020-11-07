package br.skynet.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@With
@Table("tecnico")
public class Tecnico {

    @Id
    Integer id;
    String nome;
    String rg;
    String cpf;
    @Column("data_nascimento")
    LocalDate dataNascimento;
    String nomeMae;
    String endereco;
    String cidade;
    String estado;
    String cep;
    String pais;
    String telefone;
    @Column("valor_chamado")
    BigDecimal valorChamado;
    @Column("valor_hora")
    BigDecimal valorHora;
    @Column("valor_mensal")
    BigDecimal valorMes;
    String banco;
    String agencia;
    String conta;
    @Column("titular_conta")
    String nomeTitularConta;
    @Column("cpf_titular_conta")
    String cpfTitularConta;

}