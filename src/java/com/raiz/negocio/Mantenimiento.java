/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raiz.negocio;

import com.raiz.entidades.Aprobacion;
import com.raiz.entidades.Cts;
import com.raiz.entidades.Empleado;
import com.raiz.entidades.Empresa;
import com.raiz.entidades.ExcepcionTasa;
import com.raiz.entidades.Pais;
import com.raiz.entidades.Perfil;
import com.raiz.entidades.TipoDocumento;
import com.raiz.entidades.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Usuario
 */
@Stateless
public class Mantenimiento {

    //
    @PersistenceContext(unitName = "ProyectoDSDRaizPU")
    private EntityManager em;


    /*
==============================================================================================================================================
    MANTENIMIENTO EMPLEADOS
==============================================================================================================================================
     */
 /*REGISTRAMOS UN EMPLEADO*/
    public String registrarEmpleado(Empleado empleado) {
        em.persist(empleado);
        return "Se registró Empleado";
    }

    /*LISTAMOS TODOS LOS EMPLEADOS*/
    public List<Empleado> listarEmpleados() {
        Query q = em.createQuery("SELECT e FROM Empleado e");
        return q.getResultList();
    }

    /*BUSCAMOS UN EMPLEADO*/
    public Empleado buscarEmpleado(Integer nroDocumento) {
        Query q = em.createQuery("SELECT e FROM Empleado e WHERE e.nroDoc = '" + nroDocumento.toString() + "'");
        List<Empleado> emple = q.getResultList();
        if (emple.size() == 0) {
            return null;
        } else {
            return emple.get(0);
        }
        //return em.find(Empleado.class, idEmpleado);
    }

    /*ACTUALIZAR UN EMPLEADO*/
    public String actualizarEmpleado(int idEmpleado, Empleado empleado) {
        Empleado p = em.find(Empleado.class, idEmpleado);

        if (p == null) {
            return "Empleado No encontrado";
        } else {
            p.setCodigoPais(empleado.getCodigoPais());
            p.setCodigoTipdoc(empleado.getCodigoTipdoc());
            p.setNroDoc(empleado.getNroDoc());
            p.setApellidoPaterno(empleado.getApellidoPaterno());
            p.setApellidoMaterno(empleado.getApellidoMaterno());
            p.setNombres(empleado.getNombres());
            p.setFechaNacimiento(empleado.getFechaNacimiento());
            p.setDomicilio(empleado.getDomicilio());
            p.setEmail(empleado.getEmail());

            em.merge(p);
            return "Se actualizaron datos del Empleado";
        }
    }

    /*ELIMINAR EMPLEADO*/
    public String eliminarEmpleado(int idEmpleado) {
        Empleado p = em.find(Empleado.class, idEmpleado);

        if (p == null) {
            return "Empleado No encontrado";
        } else {
            em.getTransaction().begin();
            em.remove(p);
            em.getTransaction().commit();
            return "Se eliminó registro";
        }
    }

    /*
==============================================================================================================================================
    MANTENIMIENTO EMPRESAS
==============================================================================================================================================
     */
 /*REGISTRAMOS UNA EMPRESA*/
    public String registrarEmpresa(Empresa empresa) {
        em.persist(empresa);
        return "Se registró Empresa";
    }

    /*LISTAMOS TODAS LAS EMPRESAS*/
    public List<Empresa> listarEmpresas() {
        Query q = em.createQuery("SELECT e FROM Empresa e");
        return q.getResultList();
    }

    /*BUSCAMOS UNA EMPRESA*/
    public Empresa buscarEmpresa(Integer idEmpresa) {
        return em.find(Empresa.class, idEmpresa);
    }

    /*ACTUALIZAR UNA EMPRESA*/
    public String actualizarEmpresa(int idEmpresa, Empresa empresa) {
        Empresa p = em.find(Empresa.class, idEmpresa);

        if (p == null) {
            return "Empresa No encontrada";
        } else {
            p.setDescripcion(empresa.getDescripcion());
            p.setDireccion(empresa.getDireccion());

            em.merge(p);
            return "Se actualizaron datos de la Empresa";
        }
    }

    /*ELIMINAR EMPRESA*/
    public String eliminarEmpresa(int idEmpresa) {
        Empresa p = em.find(Empresa.class, idEmpresa);

        if (p == null) {
            return "Empresa No encontrada";
        } else {
            em.getTransaction().begin();
            em.remove(p);
            em.getTransaction().commit();
            return "Se eliminó Empresa";
        }
    }

    /*
==============================================================================================================================================
    MANTENIMIENTO CTS
==============================================================================================================================================
     */
 /*REGISTRAMOS CTS*/
    public String registrarCts(Integer usuario, Integer tasa, Integer traslado ) {
        Query q = em.createNativeQuery("INSERT INTO CTS VALUES(?1,NOW(),NULL,NULL,?2,1,?3)");
        q.setParameter(1, usuario);
        q.setParameter(2, tasa);        
        q.setParameter(3, traslado);
        return "Se registró Cts";
    }

    /*LISTAMOS TODOS LOS CTS*/
    public List<Cts> listarCts() {
        Query q = em.createQuery("SELECT e FROM Cts e");
        return q.getResultList();
    }

    /*BUSCAMOS UN CTS*/
    public Cts buscarCts(Integer idCts) {
        return em.find(Cts.class, idCts);
    }

    /*ACTUALIZAR UN CTS*/
    public String actualizarCts(int idCts, Cts cts) {
        Cts p = em.find(Cts.class, idCts);

        if (p == null) {
            return "Cts No encontrado";
        } else {
            p.setCodigoUsuario(cts.getCodigoUsuario());
            p.setFechaIngreso(cts.getFechaIngreso());
            p.setFechaModifica(cts.getFechaModifica());
            p.setFechaApertura(cts.getFechaApertura());
            p.setTasa(cts.getTasa());
            p.setEstado(cts.getEstado());
            p.setTraslado(cts.getTraslado());

            em.merge(p);
            return "Se actualizaron datos de Cts";
        }
    }

    /*ELIMINAR CTS*/
    public String eliminarCts(int idCts) {
        Cts p = em.find(Cts.class, idCts);

        if (p == null) {
            return "Cts No encontrado";
        } else {
            em.getTransaction().begin();
            em.remove(p);
            em.getTransaction().commit();
            return "Se eliminó Cts";
        }
    }

    /*
==============================================================================================================================================
    MANTENIMIENTO APROBACION
==============================================================================================================================================
     */
 /*REGISTRAMOS APROBACION*/
    public String registrarAprobacion(Aprobacion aprobacion) {
        em.persist(aprobacion);
        return "Se registró Aprobación";
    }

    /*LISTAMOS TODAS LAS APROBACIONES*/
    public List<Aprobacion> listarAprobaciones() {
        Query q = em.createQuery("SELECT e FROM Aprobacion e");
        return q.getResultList();
    }

    /*BUSCAMOS UNA APROBACION*/
    public Aprobacion buscarAprobacion(Integer idAprobacion) {
        return em.find(Aprobacion.class, idAprobacion);
    }

    /*ACTUALIZAR UNA APROBACIÓN*/
    public String actualizarAprobacion(int idAprobacion, Aprobacion aprobacion) {
        Aprobacion p = em.find(Aprobacion.class, idAprobacion);

        if (p == null) {
            return "Aprobacion No encontrada";
        } else {
            p.setCodigoAutorizacion(aprobacion.getCodigoAutorizacion());
            p.setCodigoUsuario(aprobacion.getCodigoUsuario());
            p.setComentario(aprobacion.getComentario());
            p.setFechaAprobacion(aprobacion.getFechaAprobacion());

            em.merge(p);
            return "Se actualizó datos de Aprobación";
        }
    }

    /*ELIMINAR APROBACIÓN*/
    public String eliminarAprobacion(int idAprobacion) {
        Aprobacion p = em.find(Aprobacion.class, idAprobacion);

        if (p == null) {
            return "Aprobación No encontrada";
        } else {
            em.getTransaction().begin();
            em.remove(p);
            em.getTransaction().commit();
            return "Se eliminó Aprobación";
        }
    }

    /*
==============================================================================================================================================
    MANTENIMIENTO EXCEPCION_TASA
==============================================================================================================================================
     */
 /*REGISTRAMOS EXCEPCION TASA*/
    public String registrarExcepcionTasa(ExcepcionTasa excepcionTasa) {
        em.persist(excepcionTasa);
        return "Se registró Excepción Tasa";
    }

    /*LISTAMOS TODAS LAS EXCEPCION TASA*/
    public List<ExcepcionTasa> listarExcepcionTasa() {
        Query q = em.createQuery("SELECT e FROM ExcepcionTasa e");
        return q.getResultList();
    }

    /*BUSCAMOS UNA EXCEPCION TASA*/
    public ExcepcionTasa buscarExcepcionTasa(Integer idExcepcionTasa) {
        return em.find(ExcepcionTasa.class, idExcepcionTasa);
    }

    /*ACTUALIZAR UNA EXCEPCION TASA*/
    public String actualizarExcepcionTasa(int idExcepcionTasa, ExcepcionTasa excepcionTasa) {
        ExcepcionTasa p = em.find(ExcepcionTasa.class, idExcepcionTasa);

        if (p == null) {
            return "Excepcion Tasa No encontrada";
        } else {
            p.setCodigoPerfil(excepcionTasa.getCodigoPerfil());
            p.setTasaMinima(excepcionTasa.getTasaMinima());

            em.merge(p);
            return "Se actualizó Excepcion Tasa";
        }
    }

    /*ELIMINAR EXCEPCION TASA*/
    public String eliminarExcepcionTasa(int idExcepcionTasa) {
        ExcepcionTasa p = em.find(ExcepcionTasa.class, idExcepcionTasa);

        if (p == null) {
            return "Excepcion Tasa No encontrada";
        } else {
            em.getTransaction().begin();
            em.remove(p);
            em.getTransaction().commit();
            return "Se eliminó Excepcion Tasa";
        }
    }

    /*
==============================================================================================================================================
    MANTENIMIENTO PAIS
==============================================================================================================================================
     */
 /*REGISTRAMOS PAIS*/
    public String registrarPais(Pais pais) {
        em.persist(pais);
        return "Se registró País";
    }

    /*LISTAMOS TODOS LOS PAISES*/
    public List<Pais> listarPaises() {
        Query q = em.createQuery("SELECT e FROM Pais e");
        return q.getResultList();
    }

    /*BUSCAMOS UN PAIS*/
    public Pais buscarPais(Integer idPais) {
        return em.find(Pais.class, idPais);
    }

    /*ACTUALIZAR UN PAIS*/
    public String actualizarPais(int idPais, Pais pais) {
        Pais p = em.find(Pais.class, idPais);

        if (p == null) {
            return "Pais No encontrado";
        } else {
            p.setDescripcion(pais.getDescripcion());

            em.merge(p);
            return "Se actualizó Pais";
        }
    }

    /*ELIMINAR PAIS*/
    public String eliminarPais(int idPais) {
        Pais p = em.find(Pais.class, idPais);

        if (p == null) {
            return "Pais No encontrado";
        } else {
            em.getTransaction().begin();
            em.remove(p);
            em.getTransaction().commit();
            return "Se eliminó Pais";
        }
    }

    /*
==============================================================================================================================================
    MANTENIMIENTO PERFIL
==============================================================================================================================================
     */
 /*REGISTRAMOS PERFIL*/
    public String registrarPerfil(Perfil perfil) {
        em.persist(perfil);
        return "Se registró Perfil";
    }

    /*LISTAMOS TODOS LOS PERFILES*/
    public List<Perfil> listarPerfiles() {
        Query q = em.createQuery("SELECT e FROM Perfil e");
        return q.getResultList();
    }

    /*BUSCAMOS UN PERFIL*/
    public Perfil buscarPerfil(Integer idPerfil) {
        return em.find(Perfil.class, idPerfil);
    }

    /*ACTUALIZAR UN PERFIL*/
    public String actualizarPerfil(int idPerfil, Perfil perfil) {
        Perfil p = em.find(Perfil.class, idPerfil);

        if (p == null) {
            return "Perfil No encontrado";
        } else {
            p.setDescripcion(perfil.getDescripcion());

            em.merge(p);
            return "Se actualizó Perfil";
        }
    }

    /*ELIMINAR PERFIL*/
    public String eliminarPerfil(int idPerfil) {
        Perfil p = em.find(Perfil.class, idPerfil);

        if (p == null) {
            return "Perfil No encontrado";
        } else {
            em.getTransaction().begin();
            em.remove(p);
            em.getTransaction().commit();
            return "Se eliminó Perfil";
        }
    }

    /*
==============================================================================================================================================
    MANTENIMIENTO TIPO DOCUMENTO
==============================================================================================================================================
     */
 /*REGISTRAMOS TIPO DOCUMENTO*/
    public String registrarTipoDocumento(TipoDocumento tipoDocumento) {
        em.persist(tipoDocumento);
        return "Se registró Tipo Documento";
    }

    /*LISTAMOS TODOS LOS TIPOS DE DOCUMENTOS*/
    public List<TipoDocumento> listarTipoDocumentos() {
        Query q = em.createQuery("SELECT e FROM TipoDocumento e");
        return q.getResultList();
    }

    /*BUSCAMOS UN TIPO DOCUMENTO*/
    public TipoDocumento buscarTipoDocumento(Integer idTipoDocumento) {
        return em.find(TipoDocumento.class, idTipoDocumento);
    }

    /*ACTUALIZAR UN TIPO DE DOCUMENTO*/
    public String actualizarTipoDocumento(int idTipoDocumento, TipoDocumento tipoDocumento) {
        TipoDocumento p = em.find(TipoDocumento.class, idTipoDocumento);

        if (p == null) {
            return "Tipo Documento No encontrado";
        } else {
            p.setDescripcion(tipoDocumento.getDescripcion());

            em.merge(p);
            return "Se actualizó Tipo Documento";
        }
    }

    /*ELIMINAR TIPO DOCUMENTO*/
    public String eliminarTipoDocumento(int idTipoDocumento) {
        TipoDocumento p = em.find(TipoDocumento.class, idTipoDocumento);

        if (p == null) {
            return "Tipo Documento No encontrado";
        } else {
            em.getTransaction().begin();
            em.remove(p);
            em.getTransaction().commit();
            return "Se eliminó Tipo Documento";
        }
    }

    /*
==============================================================================================================================================
    MANTENIMIENTO USUARIOS
==============================================================================================================================================
     */
 /*REGISTRAMOS USUARIO*/
    public String registrarUsuario(Usuario usuario) {
        em.persist(usuario);
        return "Se registró Usuario";
    }

    /*LISTAMOS TODOS LOS USUARIO*/
    public List<Usuario> listarUsuarios() {
        Query q = em.createQuery("SELECT e FROM Usuario e");
        return q.getResultList();
    }

    /*BUSCAMOS UN USUARIO*/
    public Usuario buscarUsuario(Integer idUsuario) {
        return em.find(Usuario.class, idUsuario);
    }

    /*ACTUALIZAR UN USUARIO*/
    public String actualizarUsuario(int idUsuario, Usuario usuario) {
        Usuario p = em.find(Usuario.class, idUsuario);

        if (p == null) {
            return "Usuario No encontrado";
        } else {
            p.setDescripcion(usuario.getDescripcion());
            p.setFechaIngreso(usuario.getFechaIngreso());

            em.merge(p);
            return "Se actualizó Usuario";
        }
    }

    /*ELIMINAR USUARIO*/
    public String eliminarUsuario(int idUsuario) {
        Usuario p = em.find(Usuario.class, idUsuario);

        if (p == null) {
            return "Usuario No encontrado";
        } else {
            em.getTransaction().begin();
            em.remove(p);
            em.getTransaction().commit();
            return "Se eliminó Usuario";
        }
    }

}
