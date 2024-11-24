package com.balieiro.crudClientes.dto;

import com.balieiro.crudClientes.entities.Client;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
public class ClientDTO {

    private Long id;
    @NotEmpty(message = "O campo nome é requerido")
    @Size(max = 100, min = 3, message = "Informe um nome com a quantidade de caracteres entre 3 e 100")
    private String nome;

    @Pattern(regexp = "\\d{11}", message = "O CPF deve conter exatamente 11 dígitos numéricos.")
    @Column(unique = true, nullable = false)
    private String cpf;

    @Positive(message = "O valor deve ser positivo")
    private Double income;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthDate;

    @NotBlank(message = "Campo obrigatorio")
    private Integer children;

    public ClientDTO(Client client) {
        id = client.getId();
        nome = client.getNome();
        cpf = client.getCpf();
        income = client.getIncome();
        birthDate = client.getBirthDate();
        children = client.getChildren();
    }
}


