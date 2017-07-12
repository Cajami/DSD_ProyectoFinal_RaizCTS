/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raiz.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "usuario_perfil")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsuarioPerfil.findAll", query = "SELECT u FROM UsuarioPerfil u")
    , @NamedQuery(name = "UsuarioPerfil.findByCodigoUsuario", query = "SELECT u FROM UsuarioPerfil u WHERE u.codigoUsuario = :codigoUsuario")
    , @NamedQuery(name = "UsuarioPerfil.findByCodigoPerfil", query = "SELECT u FROM UsuarioPerfil u WHERE u.codigoPerfil = :codigoPerfil")
    , @NamedQuery(name = "UsuarioPerfil.findByFechaVto", query = "SELECT u FROM UsuarioPerfil u WHERE u.fechaVto = :fechaVto")})
public class UsuarioPerfil implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_USUARIO")
    private Integer codigoUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_PERFIL")
    private int codigoPerfil;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_VTO")
    private int fechaVto;

    public UsuarioPerfil() {
    }

    public UsuarioPerfil(Integer codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public UsuarioPerfil(Integer codigoUsuario, int codigoPerfil, int fechaVto) {
        this.codigoUsuario = codigoUsuario;
        this.codigoPerfil = codigoPerfil;
        this.fechaVto = fechaVto;
    }

    public Integer getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(Integer codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public int getCodigoPerfil() {
        return codigoPerfil;
    }

    public void setCodigoPerfil(int codigoPerfil) {
        this.codigoPerfil = codigoPerfil;
    }

    public int getFechaVto() {
        return fechaVto;
    }

    public void setFechaVto(int fechaVto) {
        this.fechaVto = fechaVto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoUsuario != null ? codigoUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioPerfil)) {
            return false;
        }
        UsuarioPerfil other = (UsuarioPerfil) object;
        if ((this.codigoUsuario == null && other.codigoUsuario != null) || (this.codigoUsuario != null && !this.codigoUsuario.equals(other.codigoUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.raiz.entidades.UsuarioPerfil[ codigoUsuario=" + codigoUsuario + " ]";
    }
    
}
