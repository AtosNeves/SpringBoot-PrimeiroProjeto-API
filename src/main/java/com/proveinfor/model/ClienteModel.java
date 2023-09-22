package com.proveinfor.model;


import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "tb_clientes")
public class ClienteModel implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idCliente;
    private  String nome;
    private String pontoDeReferencia;

    public UUID getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(UUID idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPontoDeReferencia() {
        return pontoDeReferencia;
    }

    public void setPontoDeReferencia(String pontoDeReferencia) {
        this.pontoDeReferencia = pontoDeReferencia;
    }
}