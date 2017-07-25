/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raiz.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SqlResultSetMapping;

/**
 *
 * @author Usuario
 */
@Entity
public class CtsSelect implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "CODIGO_CTS")
    private Long CODIGO_CTS;
    @Column(name = "CODIGO_EMPLEADO")
    private String CODIGO_EMPLEADO;
    @Column(name = "NRO_DOC")
    private String NRO_DOC;
    @Column(name = "APELLIDO_PATERNO")
    private String APELLIDO_PATERNO;
    @Column(name = "APELLIDO_MATERNO")
    private String APELLIDO_MATERNO;
    @Column(name = "NOMBRES")
    private String NOMBRES;
    @Column(name = "CODIGO_EMPRESA")
    private String CODIGO_EMPRESA;
    @Column(name = "RUC")
    private String RUC;
    @Column(name = "DESCRIPCION")
    private String DESCRIPCION;
    @Column(name = "FECHA_INGRESO")
    private String FECHA_INGRESO;
    @Column(name = "FECHA_MODIFICA")
    private String FECHA_MODIFICA;
    @Column(name = "TASA")
    private double TASA;
    @Column(name = "CONDICION")
    private String CONDICION;
    @Column(name = "ESTADO")
    private int ESTADO;
    @Column(name = "SALDO")
    private double SALDO;
    @Column(name = "CODIGO_USUARIO")
    private int CODIGO_USUARIO;
    @Column(name = "NOMBRE_USUARIO")
    private String NOMBRE_USUARIO;

    public Long getCODIGO_CTS() {
        return CODIGO_CTS;
    }

    public void setCODIGO_CTS(Long CODIGO_CTS) {
        this.CODIGO_CTS = CODIGO_CTS;
    }

    public String getCODIGO_EMPLEADO() {
        return CODIGO_EMPLEADO;
    }

    public void setCODIGO_EMPLEADO(String CODIGO_EMPLEADO) {
        this.CODIGO_EMPLEADO = CODIGO_EMPLEADO;
    }

    public String getNRO_DOC() {
        return NRO_DOC;
    }

    public void setNRO_DOC(String NRO_DOC) {
        this.NRO_DOC = NRO_DOC;
    }

    public String getAPELLIDO_PATERNO() {
        return APELLIDO_PATERNO;
    }

    public void setAPELLIDO_PATERNO(String APELLIDO_PATERNO) {
        this.APELLIDO_PATERNO = APELLIDO_PATERNO;
    }

    public String getAPELLIDO_MATERNO() {
        return APELLIDO_MATERNO;
    }

    public void setAPELLIDO_MATERNO(String APELLIDO_MATERNO) {
        this.APELLIDO_MATERNO = APELLIDO_MATERNO;
    }

    public String getNOMBRES() {
        return NOMBRES;
    }

    public void setNOMBRES(String NOMBRES) {
        this.NOMBRES = NOMBRES;
    }

    public String getCODIGO_EMPRESA() {
        return CODIGO_EMPRESA;
    }

    public void setCODIGO_EMPRESA(String CODIGO_EMPRESA) {
        this.CODIGO_EMPRESA = CODIGO_EMPRESA;
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }

    public String getFECHA_INGRESO() {
        return FECHA_INGRESO;
    }

    public void setFECHA_INGRESO(String FECHA_INGRESO) {
        this.FECHA_INGRESO = FECHA_INGRESO;
    }

    public String getFECHA_MODIFICA() {
        return FECHA_MODIFICA;
    }

    public void setFECHA_MODIFICA(String FECHA_MODIFICA) {
        this.FECHA_MODIFICA = FECHA_MODIFICA;
    }

    public double getTASA() {
        return TASA;
    }

    public void setTASA(double TASA) {
        this.TASA = TASA;
    }

    public String getCONDICION() {
        return CONDICION;
    }

    public void setCONDICION(String CONDICION) {
        this.CONDICION = CONDICION;
    }

    public int getESTADO() {
        return ESTADO;
    }

    public void setESTADO(int ESTADO) {
        this.ESTADO = ESTADO;
    }

    public double getSALDO() {
        return SALDO;
    }

    public void setSALDO(double SALDO) {
        this.SALDO = SALDO;
    }

    public int getCODIGO_USUARIO() {
        return CODIGO_USUARIO;
    }

    public void setCODIGO_USUARIO(int CODIGO_USUARIO) {
        this.CODIGO_USUARIO = CODIGO_USUARIO;
    }

    public String getNOMBRE_USUARIO() {
        return NOMBRE_USUARIO;
    }

    public void setNOMBRE_USUARIO(String NOMBRE_USUARIO) {
        this.NOMBRE_USUARIO = NOMBRE_USUARIO;
    }

    
    
    
    
    @Override

    public int hashCode() {
        int hash = 0;
        hash += (CODIGO_CTS != null ? CODIGO_CTS.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CtsSelect)) {
            return false;
        }
        CtsSelect other = (CtsSelect) object;
        if ((this.CODIGO_CTS == null && other.CODIGO_CTS != null) || (this.CODIGO_CTS != null && !this.CODIGO_CTS.equals(other.CODIGO_CTS))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.raiz.entidades.CtsSelect[ id=" + CODIGO_CTS + " ]";
    }

}
