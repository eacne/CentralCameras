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
public class ClientePj extends Endereco{
    
    private Long idClientePj;
    private String razaoSocial;
    private String nomeFantasia;
    private String cnpj;
    private String fone1;
    private String fone2;
    private String fone3;

    public ClientePj(Long idClientePj, String razaoSocial, String nomeFantasia, String cnpj, String fone1, String fone2, String fone3, Long id, String estado, String cidade, String bairro, String rua, String num, String cep, String observacao) {
        super(id, estado, cidade, bairro, rua, num, cep, observacao);
        this.idClientePj = idClientePj;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.fone1 = fone1;
        this.fone2 = fone2;
        this.fone3 = fone3;
    }
    
     

    public Long getIdClientePj() {
        return idClientePj;
    }

    public void setIdClientePj(Long idClientePj) {
        this.idClientePj = idClientePj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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
        hash = 83 * hash + Objects.hashCode(this.idClientePj);
        hash = 83 * hash + Objects.hashCode(this.razaoSocial);
        hash = 83 * hash + Objects.hashCode(this.nomeFantasia);
        hash = 83 * hash + Objects.hashCode(this.cnpj);
        hash = 83 * hash + Objects.hashCode(this.fone1);
        hash = 83 * hash + Objects.hashCode(this.fone2);
        hash = 83 * hash + Objects.hashCode(this.fone3);
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
        final ClientePj other = (ClientePj) obj;
        if (!Objects.equals(this.razaoSocial, other.razaoSocial)) {
            return false;
        }
        if (!Objects.equals(this.nomeFantasia, other.nomeFantasia)) {
            return false;
        }
        if (!Objects.equals(this.cnpj, other.cnpj)) {
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
        if (!Objects.equals(this.idClientePj, other.idClientePj)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
