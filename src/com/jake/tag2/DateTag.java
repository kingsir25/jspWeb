package com.jake.tag2;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class DateTag extends SimpleTagSupport {

    private static final long serialVersionUID = 6464168398214506236L;

    // 默认日期格式
    public static final String DEFAULT_FORMAT = "yyyy-MM-dd HH:mm:ss";

    private String value; // long型 时间戳
    private String pattern; // 日期格式，如果不传则为默认格式

    @Override
    public void doTag() throws JspException, IOException {
      
         SimpleDateFormat sdf1 = new SimpleDateFormat(DEFAULT_FORMAT);
       	 Date date;
		try {
			date = sdf1.parse(value);
	       	 SimpleDateFormat sdf2 = new SimpleDateFormat(pattern);
	       	 String targetTime =sdf2.format(date);
	       	getJspContext().getOut().write(targetTime);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}

    public void setValue(String value) {
        this.value = value;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
    
}