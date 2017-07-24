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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JAVIER-PC
 */
@Entity
@Table(name = "empresa_empleado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmpresaEmpleado.findAll", query = "SELECT e FROM EmpresaEmpleado e")
    , @NamedQuery(name = "EmpresaEmpleado.findByIdempleadoEmpleador", query = "SELECT e FROM EmpresaEmpleado e WHERE e.idempleadoEmpleador = :idempleadoEmpleador")
    , @NamedQuery(name = "EmpresaEmpleado.findByCodigoEmpresa", query = "SELECT e FROM EmpresaEmpleado e WHERE e.codigoEmpresa = :codigoEmpresa")
    , @NamedQuery(name = "EmpresaEmpleado.findByCodigoEmpleado", query = "SELECT e FROM EmpresaEmpleado e WHERE e.codigoEmpleado = :codigoEmpleado")})
public class EmpresaEmpleado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDEMPLEADO_EMPLEADOR")
    private Integer idempleadoEmpleador;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_EMPRESA")
    private int codigoEmpresa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO_EMPLEADO")
    private int codigoEmpleado;

    public EmpresaEmpleado() {
    }

    public EmpresaEmpleado(Integer idempleadoEmpleador) {
        this.idempleadoEmpleador = idempleadoEmpleador;
    }

    public EmpresaEmpleado(Integer idempleadoEmpleador, int codigoEmpresa, int codigoEmpleado) {
        this.idempleadoEmpleador = idempleadoEmpleador;
        this.codigoEmpresa = codigoEmpresa;
        this.codigoEmpleado = codigoEmpleado;
    }

    public Integer getIdempleadoEmpleador() {
        return idempleadoEmpleador;
    }

    public void setIdempleadoEmpleador(Integer idempleadoEmpleador) {
        this.idempleadoEmpleador = idempleadoEmpleador;
    }

    public int getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(int codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idempleadoEmpleador != null ? idempleadoEmpleador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmpresaEmpleado)) {
            return false;
        }
        EmpresaEmpleado other = (EmpresaEmpleado) object;
        if ((this.idempleadoEmpleador == null && other.idempleadoEmpleador != null) || (this.idempleadoEmpleador != null && !this.idempleadoEmpleador.equals(other.idempleadoEmpleador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.raiz.entidades.EmpresaEmpleado[ idempleadoEmpleador=" + idempleadoEmpleador + " ]";
    }
    
}
