package com.jake.tag2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

import javax.servlet.jsp.JspException;

import org.apache.taglibs.standard.tag.rt.core.OutTag;

public class Write extends OutTag {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String property;
	private String format;
	private SimpleDateFormat formatter;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	@Override
	public int doEndTag() throws JspException {
		SimpleDateFormat localformatter = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
		Object object = pageContext.findAttribute(this.name);
		if (object != null) {
			try {
				// pageContext.getOut().print(object.toString());
				String[] prtys = this.property.split(".");
				Object op = object;
				Method m = null;
				if(prtys.length>0) {
				for (String p : prtys) {
					Object o = op;
					Class<?> clz = (Class<?>) o.getClass();
					if (o instanceof Map) {
						Map<String, Object> map = transBean2Map(o);
						op = map.get(p);
					} else {
						//m = clz.getMethod("get" + upperCase1th(p));
						//op = m.invoke(o);
						op =getProperty(o,p);
					}

				}
				}else {
					op =getProperty(object,this.property);
				}

				Object value = op.toString();

				if (this.format != null && !"".equals(this.format)) {
					formatter = new SimpleDateFormat(this.format);
					Date date = null;
					try {
						date = localformatter.parse((String) value);
						if (date != null) {
							value = formatter.format(date);
						}
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
				if (value != null && !"".equals(value)) {
					super.setValue(value);
					super.setEscapeXml(false);
				}

			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return super.doEndTag();
	}

	public static String upperCase1th(String str) {
		return str.substring(0, 1).toUpperCase() + str.substring(1);
	}

	public Map<String, Object> transBean2Map(Object obj) {

		if (obj == null) {
			return null;
		}

		Map<String, Object> map = new HashMap<String, Object>();
		try {
			BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
			PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
			for (PropertyDescriptor property : propertyDescriptors) {
				String key = property.getName();

				// classƒtƒBƒ‹ƒ^
				if (!"class".equals(key)) {
					// get property method
					Method getter = property.getReadMethod();
					Object value = getter.invoke(obj);
					map.put(key, value);
				}

			}
		} catch (Exception e) {
			System.out.println("transBean2Map Error " + e);
			e.printStackTrace();
		}

		return map;
	}
	  // get bean Property
    public static Object getProperty(Object o, String p) throws Exception {  
        PropertyDescriptor proDescriptor = new PropertyDescriptor(p,o.getClass());  
        Method methodGetUserName = proDescriptor.getReadMethod();  
        return methodGetUserName.invoke(o);  
     }

}
