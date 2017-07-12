/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raiz.soap;

import com.raiz.entidades.Empresa;
import com.raiz.entidades.Pais;
import com.raiz.entidades.Perfil;
import com.raiz.negocio.Mantenimiento;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Usuario
 */
@WebService(serviceName = "RegisterWS")
@Stateless()
public class RegisterWS {

    @EJB
    private Mantenimiento mantenimiento;

    /*REGISTRAR EMPLEADOR*/
    @WebMethod(operationName = "registrarEmpresa")
    public String registrarEmpresa(
            @WebParam(name = "nombreEmpresa") String nombreEmpresa) {
        Empresa empresa = new Empresa();
        empresa.setDescripcion(nombreEmpresa);
        String Respuesta = mantenimiento.registrarEmpresa(empresa);
        return Respuesta + " - WEB SERVICE SOAP";
    }

    /*REGISTRAR PAIS*/
    @WebMethod(operationName = "registrarPais")
    public String registrarPais(
            @WebParam(name = "pais") String nombrePais) {
        Pais pais = new Pais();
        pais.setDescripcion(nombrePais);
        String Respuesta = mantenimiento.registrarPais(pais);
        return Respuesta + " - WEB SERVICE SOAP";
    }

    /*REGISTRAR PERFIL*/
    @WebMethod(operationName = "registrarPerfil")
    public String registrarPerfil(
            @WebParam(name = "perfil") String nombrePerfil) {
        Perfil perfil = new Perfil();
        perfil.setDescripcion(nombrePerfil);
        String Respuesta = mantenimiento.registrarPerfil(perfil);
        return Respuesta + " - WEB SERVICE SOAP";
    }

}
