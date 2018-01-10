package qap.mock.contacto;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author christian
 */
@ManagedBean(name="contactos") // creado en faces-config
@SessionScoped
public class CrudMockJsf implements Serializable {
    // lista
    private final CrudFilterOptions filter;
    private List items;
    private CrudEntity selected;

    public CrudMockJsf() {
        this.filter = CrudMock.filterOptions("Contactos");
    }

    public CrudFilterOptions getFilter() {
        return filter;
    }

    public List<CrudEntity> getItems() {
        if (items == null) {
            items = CrudMock.mockList("demo", "Contactos", "Alumnos");
            //items = svc.getItems("demo", "Alumnos");
        }
        return items;
    }

    public CrudEntity getSelected() {
        return selected;
    }

    public void setSelected(CrudEntity selected) {
        this.selected = selected;
    }

    public void refresh() {
        //nada x ahora
    }
        
}
