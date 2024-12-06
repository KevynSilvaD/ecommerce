package com.example.ecommerce.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class PedidoId {
    private Long usuarioId;
    private Long produtoId;

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Long getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(Long produtoId) {
        this.produtoId = produtoId;
    }
}
