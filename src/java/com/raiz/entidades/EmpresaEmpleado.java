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
@Table(name = "empresa_empleado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmpresaEmpleado.findAll", query = "SELECT e FROM EmpresaEmpleado e")
    , @NamedQuery(name = "EmpresaEmpleado.findByCodigoEmpresa", query = "SELECT e FROM EmpresaEmpleado e WHERE e.codigoEmpresa = :codigoEmpresa")
    , @NamedQuery(name = "EmpresaEmpleado.findByCodigoEmpleado", query = "SELECT e FROM EmpresaEmpleado e WHERE e.codigoEmpleado = :codigoEmpleado")
    , @NamedQuery(name = "EmpresaEmpleado.findByCodigoCts", query = "SELECT e FROM EmpresaEmpleado e WHERE e.codigoCts = :codigoCts")
    , @NamedQuery(name = "EmpresaEmpleado.findByRemuneracion", query = "SELECT e FROM EmpresaEmpleado e WHERE e.remuneracion = :remuneracion")})
public class EmpresaEmpleado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_EMPRESA")
    private Integer codigoEmpresa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_EMPLEADO")
    private int codigoEmpleado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_CTS")
    private int codigoCts;
    @Basic(optional = false)
    @NotNull
    @Column(name = "REMUNERACION")
    private double remuneracion;

    public EmpresaEmpleado() {
    }

    public EmpresaEmpleado(Integer codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public EmpresaEmpleado(Integer codigoEmpresa, int codigoEmpleado, int codigoCts, double remuneracion) {
        this.codigoEmpresa = codigoEmpresa;
        this.codigoEmpleado = codigoEmpleado;
        this.codigoCts = codigoCts;
        this.remuneracion = remuneracion;
    }

    public Integer getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(Integer codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public int getCodigoCts() {
        return codigoCts;
    }

    public void setCodigoCts(int codigoCts) {
        this.codigoCts = codigoCts;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(double remuneracion) {
        this.remuneracion = remuneracion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoEmpresa != null ? codigoEmpresa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmpresaEmpleado)) {
            return false;
        }
        EmpresaEmpleado other = (EmpresaEmpleado) object;
        if ((this.codigoEmpresa == null && other.codigoEmpresa != null) || (this.codigoEmpresa != null && !this.codigoEmpresa.equals(other.codigoEmpresa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.raiz.entidades.EmpresaEmpleado[ codigoEmpresa=" + codigoEmpresa + " ]";
    }
    
}
