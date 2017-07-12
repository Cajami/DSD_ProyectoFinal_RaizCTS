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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "cts")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cts.findAll", query = "SELECT c FROM Cts c")
    , @NamedQuery(name = "Cts.findByCodigoCts", query = "SELECT c FROM Cts c WHERE c.codigoCts = :codigoCts")
    , @NamedQuery(name = "Cts.findByCodigoUsuario", query = "SELECT c FROM Cts c WHERE c.codigoUsuario = :codigoUsuario")
    , @NamedQuery(name = "Cts.findByFechaIngreso", query = "SELECT c FROM Cts c WHERE c.fechaIngreso = :fechaIngreso")
    , @NamedQuery(name = "Cts.findByFechaModifica", query = "SELECT c FROM Cts c WHERE c.fechaModifica = :fechaModifica")
    , @NamedQuery(name = "Cts.findByFechaApertura", query = "SELECT c FROM Cts c WHERE c.fechaApertura = :fechaApertura")
    , @NamedQuery(name = "Cts.findByTasa", query = "SELECT c FROM Cts c WHERE c.tasa = :tasa")
    , @NamedQuery(name = "Cts.findByEstado", query = "SELECT c FROM Cts c WHERE c.estado = :estado")
    , @NamedQuery(name = "Cts.findByTraslado", query = "SELECT c FROM Cts c WHERE c.traslado = :traslado")})
public class Cts implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODIGO_CTS")
    private Integer codigoCts;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_USUARIO")
    private int codigoUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_INGRESO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaIngreso;
    @Column(name = "FECHA_MODIFICA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaModifica;
    @Column(name = "FECHA_APERTURA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaApertura;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TASA")
    private double tasa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ESTADO")
    private Character estado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TRASLADO")
    private Character traslado;

    public Cts() {
    }

    public Cts(Integer codigoCts) {
        this.codigoCts = codigoCts;
    }

    public Cts(Integer codigoCts, int codigoUsuario, Date fechaIngreso, double tasa, Character estado, Character traslado) {
        this.codigoCts = codigoCts;
        this.codigoUsuario = codigoUsuario;
        this.fechaIngreso = fechaIngreso;
        this.tasa = tasa;
        this.estado = estado;
        this.traslado = traslado;
    }

    public Integer getCodigoCts() {
        return codigoCts;
    }

    public void setCodigoCts(Integer codigoCts) {
        this.codigoCts = codigoCts;
    }

    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaModifica() {
        return fechaModifica;
    }

    public void setFechaModifica(Date fechaModifica) {
        this.fechaModifica = fechaModifica;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public double getTasa() {
        return tasa;
    }

    public void setTasa(double tasa) {
        this.tasa = tasa;
    }

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
    }

    public Character getTraslado() {
        return traslado;
    }

    public void setTraslado(Character traslado) {
        this.traslado = traslado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoCts != null ? codigoCts.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cts)) {
            return false;
        }
        Cts other = (Cts) object;
        if ((this.codigoCts == null && other.codigoCts != null) || (this.codigoCts != null && !this.codigoCts.equals(other.codigoCts))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.raiz.entidades.Cts[ codigoCts=" + codigoCts + " ]";
    }
    
}
