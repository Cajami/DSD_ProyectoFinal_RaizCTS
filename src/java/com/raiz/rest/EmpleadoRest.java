/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raiz.rest;

import com.raiz.entidades.Empleado;
import com.raiz.negocio.Mantenimiento;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
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
@Path("empleado")
public class EmpleadoRest {

    @EJB
    private Mantenimiento mantenimiento;

    public EmpleadoRest() {
    }

    /*
==============================================================================================================================================
    REST - MANTENIMIENTO EMPLEADOS
==============================================================================================================================================
     */
    @POST
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String insertEmpleado(Empleado empleado) {
        String Rpsta = mantenimiento.registrarEmpleado(empleado);
        return Rpsta;
    }

    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Empleado> getEmpleados() {
        return mantenimiento.listarEmpleados();
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Empleado findEmpleado(@PathParam("id") Integer id) {
        return mantenimiento.buscarEmpleado(id);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String editEmpleado(@PathParam("id") Integer id, Empleado empleado) {
        String Rpsta = mantenimiento.actualizarEmpleado(id, empleado);
        return Rpsta;
    }

    @DELETE
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String deleteEmpleado(@PathParam("id") Integer id) {
        String Rpsta = mantenimiento.eliminarEmpleado(id);
        return Rpsta;
    }

}
