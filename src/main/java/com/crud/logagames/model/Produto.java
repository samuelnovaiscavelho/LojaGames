package com.crud.logagames.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Table(name = "tb_produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O atributo nome é Obrigátorio!")
    @Size(min = 5, max = 50, message = "O atributo nome deve conter no mínimo 05 e no máximo 50 caracteres")
    private String nome;

    @NotBlank(message = "O atributo editora é Obrigátorio!")
    @Size(min = 5, max = 50, message = "O atributo editora deve conter no mínimo 05 e no máximo 50 caracteres")
    private String editora;


    @NotNull
    private Double preco;

    @NotBlank(message = "O atributo idioma é Obrigátorio!")
    @Size(min = 5, max = 30, message = "O atributo idioma deve conter no mínimo 05 e no máximo 30 caracteres")
    private String idioma;

    @NotNull
    private LocalDate dataLancamento;

    @ManyToOne
    @JsonIgnoreProperties("produto")
    private Categoria categoria;

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

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}

