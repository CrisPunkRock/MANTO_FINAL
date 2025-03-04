package edu.uag.iidis.scec.modelo;

import java.util.ArrayList;
import java.util.List;


/**
 * Esta clase es usada para representar a un usuario de la
 * aplicaci�n. 
 *
 * <p>
 * <a href="Usuario.java.html"><i>Ver c�digo fuente</i></a>
 * </p>
 *
 * @author <a href="mailto:vramos@uag.mx">Victor Ramos</a>
 * @version 1.0
 */
public class Usuario extends Persona {
    
    protected Credencial credencial;
    protected Persona persona;
    protected Auto auto;
    protected List roles = new ArrayList();
    protected List estados = new ArrayList();
    protected List paises = new ArrayList();
    protected List autos = new ArrayList();
    protected List estadosa = new ArrayList();
    public Usuario(){
    }

    public Usuario(Persona nombre, 
                   Credencial credencial) {
//        super(nombre);
        this.credencial=credencial;
    }


    /**
     * Regresa el identificador del usuario.
     * @return Long
     */
    public Credencial getCredencial() {
        return credencial;
    }

    public Persona getPersona(){
        return this.persona;
    }

 public Auto getAuto(){
        return this.auto;
    }

    /**
     * Establece el identificador del usuario.
     * @param id Identificador del usuario
     */
    public void setCredencial(Credencial credencial) {
        this.credencial = credencial;
    }


    /**
     * Regresa los roles a los que pertenece el usuario.
     * @return List
     */
    public List getRoles() {
        return roles;
    }


    /**
     * Establece los roles del usuario
     * @param roles
     */
    public void setRoles(List roles) {
        this.roles = roles;
    }


    /**
     * Agrega un rol para el usuario
     * @param rol
     */
    public void addRol(Rol rol) {
        if (roles.indexOf(rol) < 0) {
            roles.add(rol);
            rol.getUsuarios().add(this);
        }
    }

    
    public void removeRol(Rol rol) {
        roles.remove(rol);
        rol.getUsuarios().remove(this);
    }

    /* Estados aqu� */
    /**
     * Regresa los estados a los que pertenece el usuario.
     * @return List
     */
    public List getEstados() {
        return estados;
    }

    public List getEstadosa() {
        return estadosa;
    }

    public List getPaises() {
        return paises;
    }

    /**
     * Establece los estados del usuario
     * @param estados
     */
    public void setEstados(List estadosa) {
        this.estados = estadosa;
    }

      public void setEstadosa(List estadosa) {
        this.estadosa = estadosa;
    }

    public void setPaises(List paises) {
        this.paises = paises;
    }

    /**
     * Agrega un estado para el usuario
     * @param estado
     */
    public void addEstado(Estado estado) {
        if (estados.indexOf(estado) < 0) {
            estados.add(estado);
            estado.getUsuarios().add(this);
        }
    }
    
  public void addEstadoa(Estado estadoa) {
        if (estadosa.indexOf(estadoa) < 0) {
            estadosa.add(estadoa);
            estadoa.getUsuarios().add(this);
        }
    }
    
    public void addPais(Pais pais) {
        if (paises.indexOf(pais) < 0) {
            paises.add(pais);
            pais.getUsuarios().add(this);
        }
    }
    
    public void removeEstado(Estado estado) {
        estados.remove(estado);
        estado.getUsuarios().remove(this);
    }

        

    public void removePais(Pais pais) {
        paises.remove(pais);
        pais.getUsuarios().remove(this);
    }
}