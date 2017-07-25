/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raiz.rest;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author Usuario
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.raiz.rest.CtsRest.class);
        resources.add(com.raiz.rest.EmpleadoRest.class);
        resources.add(com.raiz.rest.EmpresaRest.class);
        resources.add(com.raiz.rest.Empresa_empleadoRest.class);
        resources.add(com.raiz.rest.MantenimientoRest.class);
        resources.add(com.raiz.rest.PaisRest.class);
        resources.add(com.raiz.rest.TipoDocumentoRest.class);
        resources.add(com.raiz.rest.UsuarioPerfilRest.class);
    }
    
}
