package qap.mock.contacto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author christian
 */
public class CrudMock {
        // mock
    static public List mockList(String propietario, String crudEntity, String modulo) {
        if ("Contactos".equals(crudEntity)) {
          return mockListContacto(propietario, modulo);            
        } else 
          return mockListContacto(propietario, modulo);
    }

    static public List mockListContacto(String propietario, String modulo) {
        List l = new ArrayList();
        
        l.add(new CrudEntity(1, propietario, modulo, "024", "Perez, Juan Pablo"));
        l.add(new CrudEntity(2, propietario, modulo, "031", "Spinoso, Marina"));
        l.add(new CrudEntity(3, propietario, modulo, "045", "Roig, Christian"));
        l.add(new CrudEntity(4, propietario, modulo, "052", "Rodriguez, Emmanuel"));
        l.add(new CrudEntity(5, propietario, modulo, "053", "Fracchia, Marcos"));
        l.add(new CrudEntity(6, propietario, modulo, "055", "Cao, Santiago"));
        
        if ("Clientes".equals(modulo)) {
            l.add(new CrudEntity(7, propietario, modulo, "064", "Clinica de Ojos S.A."));            
        }
        if ("Proveedores".equals(modulo)) {
            l.add(new CrudEntity(8, propietario, modulo, "065", "Telecom S.A."));            
            l.add(new CrudEntity(9, propietario, modulo, "065", "Camuzzi Gas Pampeana S.A."));            

            l.add(new CrudEntity(10, propietario, modulo, "065", "Camuzzi 10+"));            
            l.add(new CrudEntity(11, propietario, modulo, "065", "Camuzzi 10+"));            
            l.add(new CrudEntity(12, propietario, modulo, "065", "Camuzzi 10+"));            
            l.add(new CrudEntity(13, propietario, modulo, "065", "Camuzzi 10+"));            
            l.add(new CrudEntity(14, propietario, modulo, "065", "Camuzzi 10+"));            
            l.add(new CrudEntity(15, propietario, modulo, "065", "Camuzzi 10+"));            
            l.add(new CrudEntity(16, propietario, modulo, "065", "Camuzzi 10+"));            
            l.add(new CrudEntity(17, propietario, modulo, "065", "Camuzzi 10+"));            
            l.add(new CrudEntity(18, propietario, modulo, "065", "Camuzzi 10+"));            
            l.add(new CrudEntity(19, propietario, modulo, "065", "Camuzzi 10+"));            
            l.add(new CrudEntity(20, propietario, modulo, "065", "Camuzzi 10+"));            
        }

        return l;
    }
    
    static public CrudFilterOptions filterOptions(String crudEntity) {
        CrudFilterOptions filter = new CrudFilterOptions();
        
        if ("Contactos".equals(crudEntity)) {
            filter.setModulos(    Arrays.asList("Alumnos", "Docentes") );
            filter.setCategorias( Arrays.asList("Activo", "Inactivo") );
            filter.setEtiquetas(  Arrays.asList("Matematica II - 2017", "Historia I - 2016", "Geografia I - 2016") );
            filter.setVistas(     Arrays.asList("Fotos", "Lista", "Info") );
        } else {
            filter.setModulos(    Arrays.asList("Alumnos", "Docentes") );
            filter.setCategorias( Arrays.asList("Activo", "Inactivo") );
            filter.setEtiquetas(  Arrays.asList("Matematica II - 2017", "Historia I - 2016", "Geografia I - 2016") );
            filter.setVistas(     Arrays.asList("Fotos", "Lista", "Info") );
        }
        
        return filter;
    }
    
    
}
