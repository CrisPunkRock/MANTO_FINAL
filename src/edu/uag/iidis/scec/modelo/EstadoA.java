package edu.uag.iidis.scec.modelo;

import java.io.Serializable;
import java.util.*;


/**
 * Esta clase es usada para representar un rol de un
 * usuario. 
 *
 * <p><a href="EstadoA.java.html"><i>Ver código fuente</i></a></p>
 *
 * @author <a href="mailto:vramos@uag.mx">Victor Ramos</a>
 * @version 1.0
 */
public class EstadoA extends ClaseBase 
        implements Serializable {

    private Long id;
    private Long idPais;
    private String nombre;
    private String descripcion;

     private List usuarios = new ArrayList();
    public EstadoA() {
    }

    public EstadoA(Long id){
        this.id = id;
    }

    public EstadoA(String nombre, String descripcion, Long idPais){
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.idPais=idPais;
    }

    /**
     * Regresa el id del rol.
     * @return Long
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Establece el id del rol.
     * @return void
     */
    public void setId(Long id) {
        this.id = id;
    }

    public Long getidPais() {
        System.out.println("LE ESTOY PIDIENDO DATOS AL IDPAIS----> "+this.idPais);
        return this.idPais;
    }

    public void setidPais(Long id) {
        System.out.println("LE ESTOY ENVIANDO DATOS AL ID PAIS----> "+id);
        this.idPais = id;
    }
    /**
     * Regresa el nombre del rol.
     * @return String
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Establece el nombre del rol.
     * @return void
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    /**
     * Regresa la descripción del rol.
     * @return String
     */
    public String getDescripcion() {
        return this.descripcion;
    }

    /**
     * Establece la descripción del rol.
     * @return void
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public List getUsuarios() {
        return this.usuarios;
    }

    /**
     * Establece los usuarios del rol.
     * @return void
     */
    public void setUsuarios(List usuarios) {
        this.usuarios = usuarios;
    }

    public void addUsuario(Usuario usuario) {
        usuarios.add(usuario);
        usuario.getEstados().add(this);
    }

}
