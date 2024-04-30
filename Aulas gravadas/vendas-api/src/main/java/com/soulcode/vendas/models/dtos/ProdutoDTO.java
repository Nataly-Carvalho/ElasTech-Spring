package com.soulcode.vendas.models.dtos;

import com.soulcode.vendas.models.Produto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ProdutoDTO {
    private Long id;

    @NotBlank(message = "O codigo deve ser preenchido")
    private String codigo;

    @NotBlank(message = "A decrição deve ser preenchido")
    private String descricao;

    @NotNull(message = "O preço deve ser preenchido")
    private Double preco;

    @NotBlank(message = "A unidade de medida deve ser preenchido")
    private String unidadeMedida;

    @NotBlank(message = "O Grupo deve ser preenchido")
    private String grupo;

    private String urlFoto;

    public ProdutoDTO() {}
    public ProdutoDTO(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public ProdutoDTO(Produto produto) {
        this.unidadeMedida = produto.getUnidadeMedida();
        this.preco = produto.getPreco();
        this.grupo = produto.getGrupo();
        this.urlFoto = produto.getUrlFoto();
        this.descricao = produto.getDescricao();
        this.codigo = produto.getCodigo();
        this.id = produto.getId();
    }

    public static Produto convert(ProdutoDTO produtoDTO) {
        Produto produto = new Produto();
        produto.setId(produtoDTO.getId());
        produto.setUnidadeMedida(produtoDTO.getUnidadeMedida());
        produto.setPreco(produtoDTO.getPreco());
        produto.setGrupo(produtoDTO.getGrupo());
        produto.setUrlFoto(produtoDTO.getUrlFoto());
        produto.setDescricao(produtoDTO.getDescricao());
        produto.setCodigo(produtoDTO.getCodigo());
        return produto;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
}
