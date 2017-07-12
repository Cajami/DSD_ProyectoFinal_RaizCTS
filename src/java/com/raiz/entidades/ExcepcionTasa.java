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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "excepcion_tasa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ExcepcionTasa.findAll", query = "SELECT e FROM ExcepcionTasa e")
    , @NamedQuery(name = "ExcepcionTasa.findByCodigoExcepcion", query = "SELECT e FROM ExcepcionTasa e WHERE e.codigoExcepcion = :codigoExcepcion")
    , @NamedQuery(name = "ExcepcionTasa.findByCodigoPerfil", query = "SELECT e FROM ExcepcionTasa e WHERE e.codigoPerfil = :codigoPerfil")
    , @NamedQuery(name = "ExcepcionTasa.findByTasaMinima", query = "SELECT e FROM ExcepcionTasa e WHERE e.tasaMinima = :tasaMinima")})
public class ExcepcionTasa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODIGO_EXCEPCION")
    private Integer codigoExcepcion;
    @Column(name = "CODIGO_PERFIL")
    private Integer codigoPerfil;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TASA_MINIMA")
    private Double tasaMinima;

    public ExcepcionTasa() {
    }

    public ExcepcionTasa(Integer codigoExcepcion) {
        this.codigoExcepcion = codigoExcepcion;
    }

    public Integer getCodigoExcepcion() {
        return codigoExcepcion;
    }

    public void setCodigoExcepcion(Integer codigoExcepcion) {
        this.codigoExcepcion = codigoExcepcion;
    }

    public Integer getCodigoPerfil() {
        return codigoPerfil;
    }

    public void setCodigoPerfil(Integer codigoPerfil) {
        this.codigoPerfil = codigoPerfil;
    }

    public Double getTasaMinima() {
        return tasaMinima;
    }

    public void setTasaMinima(Double tasaMinima) {
        this.tasaMinima = tasaMinima;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoExcepcion != null ? codigoExcepcion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExcepcionTasa)) {
            return false;
        }
        ExcepcionTasa other = (ExcepcionTasa) object;
        if ((this.codigoExcepcion == null && other.codigoExcepcion != null) || (this.codigoExcepcion != null && !this.codigoExcepcion.equals(other.codigoExcepcion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.raiz.entidades.ExcepcionTasa[ codigoExcepcion=" + codigoExcepcion + " ]";
    }
    
}
