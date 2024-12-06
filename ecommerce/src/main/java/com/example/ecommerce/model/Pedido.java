package com.example.ecommerce.model;

import jakarta.persistence.*;

@Entity
@Table(name = "pedidos")
public class Pedido {
    @EmbeddedId
    private PedidoId id;

    @ManyToOne
    @MapsId("usuarioId")
    private Usuario usuario;

    private Double total;

    public PedidoId getId() {
        return id;
    }

    public void setId(PedidoId id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}

