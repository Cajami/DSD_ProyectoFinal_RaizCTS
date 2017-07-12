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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "tipo_autorizacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoAutorizacion.findAll", query = "SELECT t FROM TipoAutorizacion t")
    , @NamedQuery(name = "TipoAutorizacion.findByCodigoAutorizacion", query = "SELECT t FROM TipoAutorizacion t WHERE t.codigoAutorizacion = :codigoAutorizacion")
    , @NamedQuery(name = "TipoAutorizacion.findByDescripcion", query = "SELECT t FROM TipoAutorizacion t WHERE t.descripcion = :descripcion")})
public class TipoAutorizacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODIGO_AUTORIZACION")
    private Integer codigoAutorizacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "DESCRIPCION")
    private String descripcion;

    public TipoAutorizacion() {
    }

    public TipoAutorizacion(Integer codigoAutorizacion) {
        this.codigoAutorizacion = codigoAutorizacion;
    }

    public TipoAutorizacion(Integer codigoAutorizacion, String descripcion) {
        this.codigoAutorizacion = codigoAutorizacion;
        this.descripcion = descripcion;
    }

    public Integer getCodigoAutorizacion() {
        return codigoAutorizacion;
    }

    public void setCodigoAutorizacion(Integer codigoAutorizacion) {
        this.codigoAutorizacion = codigoAutorizacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoAutorizacion != null ? codigoAutorizacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoAutorizacion)) {
            return false;
        }
        TipoAutorizacion other = (TipoAutorizacion) object;
        if ((this.codigoAutorizacion == null && other.codigoAutorizacion != null) || (this.codigoAutorizacion != null && !this.codigoAutorizacion.equals(other.codigoAutorizacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.raiz.entidades.TipoAutorizacion[ codigoAutorizacion=" + codigoAutorizacion + " ]";
    }
    
}
