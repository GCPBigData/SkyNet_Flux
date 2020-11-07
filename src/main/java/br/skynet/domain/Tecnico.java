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
@Table("TECNICO")
public class Tecnico {

    @Id
    @Column("id")
    private Long id;

    private String nome;

    private String rg;

    private String cpf;

    @Column("data_nascimento")
    private LocalDate dataNascimento;

    private String nomeMae;

    private String endereco;

    private String cidade;

    private String estado;

    private String cep;

    private String pais;

    private String telefone;

    @Column("valor_chamado")
    private BigDecimal valorChamado;

    @Column("valor_hora")
    private BigDecimal valorHora;

    @Column("valor_mensal")
    private BigDecimal valorMes;

    private String banco;

    private String agencia;

    private String conta;

    @Column("titular_conta")
    private String nomeTitularConta;

    @Column("cpf_titular_conta")
    private String cpfTitularConta;


}