package com.soulcode.vendas.models.dtos;

import com.soulcode.vendas.models.Cliente;
import com.soulcode.vendas.models.Venda;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.List;
import java.util.stream.Collectors;

public class VendaDTO {
    private Long id;

    @NotBlank(message = "A data de resgistro deve ser preenchido")
    private String dataRegistro;

    @NotNull(message = "O Id do cliente deve ser preenchido")
    private Long idCliente;

    @Valid
    @NotEmpty(message = "A lista não pode ser vazia")
    private List<ItemDTO> itens;

    public VendaDTO() {}

    public VendaDTO(Venda venda) {
        this.id = venda.getId();
        this.dataRegistro = venda.getDataRegistro();
        this.idCliente = venda.getCliente().getId();
        this.itens = venda.getItens().stream().map(ItemDTO::new).collect(Collectors.toList());
    }

    public static Venda convert(VendaDTO vendaDTO) {
        Venda venda = new Venda();
        venda.setId(vendaDTO.getId());
        venda.setDataRegistro(vendaDTO.getDataRegistro());
        venda.setCliente(new Cliente(vendaDTO.getIdCliente()));
        venda.setItems(vendaDTO.getItens().stream().map(ItemDTO::convert).collect(Collectors.toList()));
        return venda;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(String dataRegistro) {
        this.dataRegistro = dataRegistro;
    }


    public List<ItemDTO> getItens() {
        return itens;
    }

    public void setItens(List<ItemDTO> itens) {
        this.itens = itens;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }
}
