package com.mbaye.Controller;

import java.util.Map;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.mbaye.Model.Medico;

@FacesConverter(value = "medicoConverter", forClass = Medico.class)
public class MedicoConverter implements Converter {

	public Object getAsObject(FacesContext ctx, UIComponent component,
			String value) {
		if (value != null) {
			return this.getAttributesFrom(component).get(value);
		}
		return null;
	}

	public String getAsString(FacesContext ctx, UIComponent component,
			Object value) {

		if (value != null && !"".equals(value)) {
			Medico entity = (Medico) value;

			if (entity.getMedicoId() != 0) {
				this.addAttribute(component, entity);

				if (entity.getMedicoId() != 0) {
					return String.valueOf(entity.getMedicoId());
				}
				return (String) value;
			}
		}
		return "";
	}

	private void addAttribute(UIComponent component, Medico o) {
		this.getAttributesFrom(component).put(String.valueOf(o.getMedicoId()),
				o);
	}

	private Map<String, Object> getAttributesFrom(UIComponent component) {
		return component.getAttributes();
	}

}
