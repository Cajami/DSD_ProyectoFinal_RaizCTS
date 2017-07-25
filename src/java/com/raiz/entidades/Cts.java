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
@Table(name = "cts")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cts.findAll", query = "SELECT c FROM Cts c")
    , @NamedQuery(name = "Cts.findByCodigoCts", query = "SELECT c FROM Cts c WHERE c.codigoCts = :codigoCts")
    , @NamedQuery(name = "Cts.findByCodigoEmpleado", query = "SELECT c FROM Cts c WHERE c.codigoEmpleado = :codigoEmpleado")
    , @NamedQuery(name = "Cts.findByCodigoEmpresa", query = "SELECT c FROM Cts c WHERE c.codigoEmpresa = :codigoEmpresa")
    , @NamedQuery(name = "Cts.findByFechaIngreso", query = "SELECT c FROM Cts c WHERE c.fechaIngreso = :fechaIngreso")
    , @NamedQuery(name = "Cts.findByFechaModifica", query = "SELECT c FROM Cts c WHERE c.fechaModifica = :fechaModifica")
    , @NamedQuery(name = "Cts.findByTasa", query = "SELECT c FROM Cts c WHERE c.tasa = :tasa")
    , @NamedQuery(name = "Cts.findByEstado", query = "SELECT c FROM Cts c WHERE c.estado = :estado")
    , @NamedQuery(name = "Cts.findByCondicion", query = "SELECT c FROM Cts c WHERE c.condicion = :condicion")
    , @NamedQuery(name = "Cts.findBySaldo", query = "SELECT c FROM Cts c WHERE c.saldo = :saldo")
    , @NamedQuery(name = "Cts.findByCodigoUsuario", query = "SELECT c FROM Cts c WHERE c.codigoUsuario = :codigoUsuario")})
public class Cts implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODIGO_CTS")
    private Integer codigoCts;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_EMPLEADO")
    private int codigoEmpleado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_EMPRESA")
    private int codigoEmpresa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "FECHA_INGRESO")
    private String fechaIngreso;
    @Size(max = 50)
    @Column(name = "FECHA_MODIFICA")
    private String fechaModifica;
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
    @Column(name = "CONDICION")
    private Character condicion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SALDO")
    private double saldo;
    @Column(name = "CODIGO_USUARIO")
    private Integer codigoUsuario;

    public Cts() {
    }

    public Cts(Integer codigoCts) {
        this.codigoCts = codigoCts;
    }

    public Cts(Integer codigoCts, int codigoEmpleado, int codigoEmpresa, String fechaIngreso, double tasa, Character estado, Character condicion, double saldo) {
        this.codigoCts = codigoCts;
        this.codigoEmpleado = codigoEmpleado;
        this.codigoEmpresa = codigoEmpresa;
        this.fechaIngreso = fechaIngreso;
        this.tasa = tasa;
        this.estado = estado;
        this.condicion = condicion;
        this.saldo = saldo;
    }

    public Integer getCodigoCts() {
        return codigoCts;
    }

    public void setCodigoCts(Integer codigoCts) {
        this.codigoCts = codigoCts;
    }

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public int getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(int codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaModifica() {
        return fechaModifica;
    }

    public void setFechaModifica(String fechaModifica) {
        this.fechaModifica = fechaModifica;
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

    public Character getCondicion() {
        return condicion;
    }

    public void setCondicion(Character condicion) {
        this.condicion = condicion;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Integer getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(Integer codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
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
