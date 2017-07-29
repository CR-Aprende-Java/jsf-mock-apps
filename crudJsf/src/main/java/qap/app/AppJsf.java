package qap.app;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author christian
 */
@ManagedBean(name = "app") // creado en faces-config
@SessionScoped
public class AppJsf {
    private final AppModel info;

    public AppJsf() {
        //info = appSvc.getInfo("Qapp"); ... si hay logica de negocio, sino
        info = new AppModel("Peep");
    }

    public AppModel getInfo() {
        return info;
    }
            
}
