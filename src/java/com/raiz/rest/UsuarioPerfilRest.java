/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raiz.rest;

import com.raiz.entidades.Usuario;
import com.raiz.negocio.Mantenimiento;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Usuario
 */
@Path("usuarioPerfil")
public class UsuarioPerfilRest {

    @EJB
    private Mantenimiento mantenimiento;

    /**
     * Creates a new instance of UsuarioPerfilRest
     */
    public UsuarioPerfilRest() {
    }

    @GET
    @Path("usuarios")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Usuario> getUsuarios() {
        return mantenimiento.listarUsuarios();
    }

}
