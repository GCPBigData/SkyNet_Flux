package br.skynet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TecnicoDTO {
    private Long id;
    private String nome;
    private String rg;
    private String cpf;
    private LocalDate dataNascimento;
    private String nomeMae;
    private String endereco;
    private String cidade;
    private String estado;
    private String cep;
    private String pais;
    private String telefone;
    private BigDecimal valorChamado;
    private BigDecimal valorHora;
    private BigDecimal valorMes;
    private String banco;
    private String agencia;
    private String conta;
    private String nomeTitularConta;
    private String cpfTitularConta;
}