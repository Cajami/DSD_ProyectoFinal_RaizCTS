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
@Table(name = "tipo_documento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoDocumento.findAll", query = "SELECT t FROM TipoDocumento t")
    , @NamedQuery(name = "TipoDocumento.findByCodigoTipodocumento", query = "SELECT t FROM TipoDocumento t WHERE t.codigoTipodocumento = :codigoTipodocumento")
    , @NamedQuery(name = "TipoDocumento.findByDescripcion", query = "SELECT t FROM TipoDocumento t WHERE t.descripcion = :descripcion")})
public class TipoDocumento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODIGO_TIPODOCUMENTO")
    private Integer codigoTipodocumento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "DESCRIPCION")
    private String descripcion;

    public TipoDocumento() {
    }

    public TipoDocumento(Integer codigoTipodocumento) {
        this.codigoTipodocumento = codigoTipodocumento;
    }

    public TipoDocumento(Integer codigoTipodocumento, String descripcion) {
        this.codigoTipodocumento = codigoTipodocumento;
        this.descripcion = descripcion;
    }

    public Integer getCodigoTipodocumento() {
        return codigoTipodocumento;
    }

    public void setCodigoTipodocumento(Integer codigoTipodocumento) {
        this.codigoTipodocumento = codigoTipodocumento;
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
        hash += (codigoTipodocumento != null ? codigoTipodocumento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoDocumento)) {
            return false;
        }
        TipoDocumento other = (TipoDocumento) object;
        if ((this.codigoTipodocumento == null && other.codigoTipodocumento != null) || (this.codigoTipodocumento != null && !this.codigoTipodocumento.equals(other.codigoTipodocumento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.raiz.entidades.TipoDocumento[ codigoTipodocumento=" + codigoTipodocumento + " ]";
    }
    
}
