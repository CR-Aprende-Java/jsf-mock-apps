package qap.mock.contacto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
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
    // lista
    private final List mockList = mockList("demo", "Alumnos");
    
    // vista
    private final CrudFilterOptions filter = filterOptions();
    private Contacto selected;

    public List<Contacto> getItems() {
        return mockList;
    }

    public CrudFilterOptions getFilter() {
        return filter;
    }

    public Contacto getSelected() {
        return selected;
    }

    public void setSelected(Contacto selected) {
        this.selected = selected;
    }

    // mock
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
    }
    
    // filter
    static public CrudFilterOptions filterOptions() {
        CrudFilterOptions filter = new CrudFilterOptions();
        
        filter.setModulos(    Arrays.asList("Alumnos", "Docentes") );
        filter.setCategorias( Arrays.asList("Activo", "Inactivo") );
        filter.setEtiquetas(  Arrays.asList("Matematica II - 2017", "Historia I - 2016", "Geografia I - 2016") );
        filter.setVistas(     Arrays.asList("Fotos", "Lista", "Info") );
        
        return filter;
    }
    
}
