package com.mbaye.ManageBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.component.menuitem.MenuItem;
import org.primefaces.model.DefaultMenuModel;
import org.primefaces.model.MenuModel;

@ManagedBean
@SessionScoped
public class MenuBean {
    
    private MenuModel menuModel = new DefaultMenuModel();
   
    public MenuBean() {
        MenuItem menuItem = new MenuItem();
        menuItem.setValue("MEDICO");
        menuItem.setUrl("/medico.xhtml");
        menuModel.addMenuItem(menuItem);
       
        menuItem = new MenuItem();
        menuItem.setValue("PACIENTE");
        menuItem.setUrl("/paciente.xhtml");
        menuModel.addMenuItem(menuItem);
        
    }
    
    public MenuModel getMenuModel() {
        return menuModel;
    }
}