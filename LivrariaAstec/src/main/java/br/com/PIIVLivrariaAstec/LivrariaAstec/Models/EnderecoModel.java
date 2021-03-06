/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.PIIVLivrariaAstec.LivrariaAstec.Models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

/**
 *
 * @author bruno.falmeida
 */
@Entity
@Table(name = "TB_ENDERECO")
public class EnderecoModel implements Serializable {
    @Id
    @Column(name = "ID_ENDERECO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 1, max = 100, message = "Logradouro inválido")
    @Column(name = "LOGRADOURO", length = 100, nullable = false)
    private String logradouro;

    @Digits(integer = 6, fraction = 0)
    @Column(name = "NUMERO", precision = 6, nullable = true)
    private int numero;

    @Size(min = 1, max = 100, message = "Complemento inválido")
    @Column(name = "COMPLEMENTO", length = 100, nullable = false)
    private String complemento;

    @Size(min = 1, max = 100, message = "CEP inválido")
    @Column(name = "CEP", length = 100, nullable = false)
    private String cep;

    @Size(min = 1, max = 100, message = "Bairro inválido")
    @Column(name = "BAIRRO", length = 100, nullable = false)
    private String bairro;

    @Size(min = 1, max = 100, message = "Estado inválido")
    @Column(name = "ESTADO", length = 100, nullable = false)
    private String estado;

    @Size(min = 1, max = 100, message = "Cidade inválido")
    @Column(name = "CIDADE", length = 100, nullable = false)
    private String cidade;
    
    @Size(min = 1, max = 100, message = "Apelido inválido")
    @Column(name = "APELIDO", length = 100, nullable = false)
    private String apelido;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_USUARIO")
    private UsuarioModel usuario;

    public EnderecoModel() {

    }

    public EnderecoModel(Long id, String logradouro, int numero, String complemento, String cep, String bairro, String estado, String cidade) {
        this.id = id;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.bairro = bairro;
        this.estado = estado;
        this.cidade = cidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}