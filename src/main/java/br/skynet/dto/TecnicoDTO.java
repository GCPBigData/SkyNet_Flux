package br.skynet.dto;

import br.skynet.domain.Tecnico;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TecnicoDTO {
    private Integer id;
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

    public TecnicoDTO(Tecnico objTecnico) {
        id = objTecnico.getId();
        nome = objTecnico.getNome();
        rg = objTecnico.getRg();
        cpf = objTecnico.getCpf();
        dataNascimento = objTecnico.getDataNascimento();
        nomeMae = objTecnico.getNomeMae();
        endereco = objTecnico.getEndereco();
        cidade = objTecnico.getCidade();
        estado = objTecnico.getEstado();
        cep = objTecnico.getCep();
        pais = objTecnico.getPais();
        telefone = objTecnico.getTelefone();
        valorChamado = objTecnico.getValorChamado();
        valorHora = objTecnico.getValorHora();
        valorMes = objTecnico.getValorMes();
        banco = objTecnico.getBanco();
        agencia = objTecnico.getAgencia();
        conta = objTecnico.getConta();
        nomeTitularConta = objTecnico.getNomeTitularConta();
        cpfTitularConta = objTecnico.getCpfTitularConta();
    }
}