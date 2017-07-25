/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raiz.rest;

import com.raiz.entidades.Empresa;
import com.raiz.entidades.EmpresaEmpleado;
import com.raiz.negocio.Mantenimiento;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author JAVIER-PC
 */
@Path("empresa_empleado")
public class Empresa_empleadoRest {

    @EJB
    private Mantenimiento mantenimiento;

    /**
     * Creates a new instance of Empresa_empleadoRest
     */
    public Empresa_empleadoRest() {
    }

    @POST
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String insertEmpresaEmpleador(EmpresaEmpleado empreEmple) {
        String Rpsta = mantenimiento.registrarEmpresaEmpleador(empreEmple);
        return Rpsta;
    }

    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<EmpresaEmpleado> getEmpresas() {
        return mantenimiento.listarEmpresaEmpleadores();
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Object findEmpresasAsociadas(@PathParam("id") Integer id) {
        return mantenimiento.buscarEmpresasAsociadas(id);
    }

}
