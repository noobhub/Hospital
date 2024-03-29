package com.mbaye.jsf;

import java.util.Map;

import javax.faces.context.FacesContext;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

public class ViewScope implements Scope {
	 private Map<String, Object> getViewMap() {
	        FacesContext currentInstance = FacesContext.getCurrentInstance();
	        if (currentInstance != null && currentInstance.getViewRoot() != null)
	            return currentInstance.getViewRoot().getViewMap();
	        return null;
	    }

	@Override
	public Object get(String name, ObjectFactory<?> objectFactory) {
Map<String,Object> viewMap=getViewMap();
if(viewMap==null)
	return objectFactory.getObject();
if(viewMap.containsKey(name)){
	return viewMap.get(name);
}else{
	Object object=objectFactory.getObject();
	viewMap.put(name, object);
	return object;
}
	}

	@Override
	public String getConversationId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registerDestructionCallback(String name, Runnable callback) {
		
	}

	@Override
	public Object remove(String name) {
Map<String,Object> viewMap=getViewMap();
if(viewMap==null)
	return null;

return FacesContext.getCurrentInstance().getViewRoot().getViewMap().remove(name);
	}

	@Override
	public Object resolveContextualObject(String key) {
		return null;
	}

}
