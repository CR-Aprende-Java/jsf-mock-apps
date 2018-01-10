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
    private AppModel info;
    
    //Props App
    private String appKey = DEFAULT_APP;
    private String theme  = DEFAULT_THEME;
    private String color  = DEFAULT_COLOR;
    private static final String DEFAULT_APP   = "Qap";
    private static final String DEFAULT_THEME = "qap-material";
    private static final String DEFAULT_COLOR = "original";
    

    public AppJsf() {
        //info = appSvc.getInfo("Qap"); ... si hay logica de negocio, sino
        info = new AppModel("Qap");
    }

    public AppModel getInfo() {
        return info;
    }
            
    //Getters y setters

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
        info = new AppModel(appKey);
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
