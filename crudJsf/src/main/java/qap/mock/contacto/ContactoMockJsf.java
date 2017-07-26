/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qap.mock.contacto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author christian
 */
@ManagedBean(name="contactos") // creado en faces-config
@SessionScoped
public class ContactoMockJsf implements Serializable {
    private List mockList  = mockList("demo", "Alumnos");
    
    public List<Contacto> getItems() {
        return mockList;
    }
    
    static public List mockList(String propietario, String modulo) {
        List l = new ArrayList();
        l.add(new Contacto(1, propietario, modulo, "024", "Perez, Juan Pablo"));
        l.add(new Contacto(2, propietario, modulo, "031", "Ferrari, Daniela"));
        l.add(new Contacto(3, propietario, modulo, "045", "Roig, Christian"));
        l.add(new Contacto(4, propietario, modulo, "052", "Rodriguez, Emmanuel"));
        l.add(new Contacto(5, propietario, modulo, "053", "Fracchia, Marcos"));
        l.add(new Contacto(6, propietario, modulo, "055", "Cao, Santiago"));
        
        if ("Clientes".equals(modulo)) {
            l.add(new Contacto(7, propietario, modulo, "064", "Clinica de Ojos S.A."));            
        }
        if ("Proveedores".equals(modulo)) {
            l.add(new Contacto(8, propietario, modulo, "065", "Telecom S.A."));            
            l.add(new Contacto(9, propietario, modulo, "065", "Camuzzi Gas Pampeana S.A."));            
        }

        return l;
    }}
