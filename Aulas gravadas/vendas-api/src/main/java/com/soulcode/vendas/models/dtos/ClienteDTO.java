package com.soulcode.vendas.models.dtos;

import com.soulcode.vendas.models.Cliente;
import jakarta.validation.constraints.NotBlank;

public class ClienteDTO {
    private Long id;
    @NotBlank(message = "O nome deve ser preenchido")
    private String nome;

    @NotBlank(message = "O cpf deve ser preenchido")
    private String cpf;

    @NotBlank(message = "A data de nascimento deve ser preenchido")
    private String dataNascimento;

    @NotBlank(message = "O Telefone deve ser preenchido")
    private String telefone;

    @NotBlank(message = "O Email deve ser preenchidoo")
    private String email;

    @NotBlank(message = "O Logradouro deve ser preenchido")
    private String logradouro;

    @NotBlank(message = "O  Numero deve ser preenchid")
    private String numero;

    @NotBlank(message = "A Cidade deve ser preenchido")
    private String cidade;

    @NotBlank(message = "O Estado deve ser preenchido")
    private String estado;

    public ClienteDTO(){
    }

    public ClienteDTO(Cliente cliente) {
        this.id = cliente.getId();
        this.estado = cliente.getEstado();
        this.cidade = cliente.getCidade();
        this.numero = cliente.getNumero();
        this.logradouro = cliente.getLogradouro();
        this.email = cliente.getEmail();
        this.telefone = cliente.getTelefone();
        this.dataNascimento = cliente.getDataNascimento();
        this.cpf = cliente.getCpf();
        this.nome = cliente.getNome();
    }

    public static Cliente convert(ClienteDTO clienteDTO) {
        Cliente cliente = new Cliente();

        cliente.setId(clienteDTO.getId());
        cliente.setEstado(clienteDTO.getEstado());
        cliente.setCidade(clienteDTO.getCidade());
        cliente.setNumero(clienteDTO.getNumero());
        cliente.setLogradouro(clienteDTO.getLogradouro());
        cliente.setEmail(clienteDTO.getEmail());
        cliente.setTelefone(clienteDTO.getTelefone());
        cliente.setDataNascimento(clienteDTO.getDataNascimento());
        cliente.setCpf(clienteDTO.getCpf());
        cliente.setNome(clienteDTO.getNome());

        return cliente;

    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
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
}
