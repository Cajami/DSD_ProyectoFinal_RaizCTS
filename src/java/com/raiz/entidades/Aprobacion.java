/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raiz.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "aprobacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Aprobacion.findAll", query = "SELECT a FROM Aprobacion a")
    , @NamedQuery(name = "Aprobacion.findByCodigoAprobacion", query = "SELECT a FROM Aprobacion a WHERE a.codigoAprobacion = :codigoAprobacion")
    , @NamedQuery(name = "Aprobacion.findByCodigoAutorizacion", query = "SELECT a FROM Aprobacion a WHERE a.codigoAutorizacion = :codigoAutorizacion")
    , @NamedQuery(name = "Aprobacion.findByCodigoUsuario", query = "SELECT a FROM Aprobacion a WHERE a.codigoUsuario = :codigoUsuario")
    , @NamedQuery(name = "Aprobacion.findByComentario", query = "SELECT a FROM Aprobacion a WHERE a.comentario = :comentario")
    , @NamedQuery(name = "Aprobacion.findByFechaAprobacion", query = "SELECT a FROM Aprobacion a WHERE a.fechaAprobacion = :fechaAprobacion")})
public class Aprobacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODIGO_APROBACION")
    private Integer codigoAprobacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_AUTORIZACION")
    private int codigoAutorizacion;
    @Column(name = "CODIGO_USUARIO")
    private Integer codigoUsuario;
    @Size(max = 50)
    @Column(name = "COMENTARIO")
    private String comentario;
    @Column(name = "FECHA_APROBACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAprobacion;

    public Aprobacion() {
    }

    public Aprobacion(Integer codigoAprobacion) {
        this.codigoAprobacion = codigoAprobacion;
    }

    public Aprobacion(Integer codigoAprobacion, int codigoAutorizacion) {
        this.codigoAprobacion = codigoAprobacion;
        this.codigoAutorizacion = codigoAutorizacion;
    }

    public Integer getCodigoAprobacion() {
        return codigoAprobacion;
    }

    public void setCodigoAprobacion(Integer codigoAprobacion) {
        this.codigoAprobacion = codigoAprobacion;
    }

    public int getCodigoAutorizacion() {
        return codigoAutorizacion;
    }

    public void setCodigoAutorizacion(int codigoAutorizacion) {
        this.codigoAutorizacion = codigoAutorizacion;
    }

    public Integer getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(Integer codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getFechaAprobacion() {
        return fechaAprobacion;
    }

    public void setFechaAprobacion(Date fechaAprobacion) {
        this.fechaAprobacion = fechaAprobacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoAprobacion != null ? codigoAprobacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aprobacion)) {
            return false;
        }
        Aprobacion other = (Aprobacion) object;
        if ((this.codigoAprobacion == null && other.codigoAprobacion != null) || (this.codigoAprobacion != null && !this.codigoAprobacion.equals(other.codigoAprobacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.raiz.entidades.Aprobacion[ codigoAprobacion=" + codigoAprobacion + " ]";
    }
    
}
