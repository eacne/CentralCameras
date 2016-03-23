/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.centralcameras.modelo;

import java.util.Objects;

/**
 *
 * @author emerson.ne
 */
public class ClientePf extends Endereco{
    
    private Long idCliente;
    private String nome;
    private String cpf;
    private String rg;
    private String sexo;
    private String email;
    private String fone1;
    private String fone2;
    private String fone3;

    public ClientePf(Long idCliente, String nome, String cpf, String rg, String sexo, String email, String fone1, String fone2, String fone3, Long id, String estado, String cidade, String bairro, String rua, String num, String cep, String observacao) {
        super(id, estado, cidade, bairro, rua, num, cep, observacao);
        this.idCliente = idCliente;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
        this.email = email;
        this.fone1 = fone1;
        this.fone2 = fone2;
        this.fone3 = fone3;
    }

    

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFone1() {
        return fone1;
    }

    public void setFone1(String fone1) {
        this.fone1 = fone1;
    }

    public String getFone2() {
        return fone2;
    }

    public void setFone2(String fone2) {
        this.fone2 = fone2;
    }

    public String getFone3() {
        return fone3;
    }

    public void setFone3(String fone3) {
        this.fone3 = fone3;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.idCliente);
        hash = 53 * hash + Objects.hashCode(this.nome);
        hash = 53 * hash + Objects.hashCode(this.cpf);
        hash = 53 * hash + Objects.hashCode(this.rg);
        hash = 53 * hash + Objects.hashCode(this.sexo);
        hash = 53 * hash + Objects.hashCode(this.email);
        hash = 53 * hash + Objects.hashCode(this.fone1);
        hash = 53 * hash + Objects.hashCode(this.fone2);
        hash = 53 * hash + Objects.hashCode(this.fone3);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ClientePf other = (ClientePf) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.rg, other.rg)) {
            return false;
        }
        if (!Objects.equals(this.sexo, other.sexo)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.fone1, other.fone1)) {
            return false;
        }
        if (!Objects.equals(this.fone2, other.fone2)) {
            return false;
        }
        if (!Objects.equals(this.fone3, other.fone3)) {
            return false;
        }
        if (!Objects.equals(this.idCliente, other.idCliente)) {
            return false;
        }
        return true;
    }
    
    
     
}
