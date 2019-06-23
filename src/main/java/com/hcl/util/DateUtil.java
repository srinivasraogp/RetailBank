package com.hcl.util;
import java.text.ParseException;  
import java.text.SimpleDateFormat;  
import java.util.Date; 

public class DateUtil {

public static Date dateconvert()	{
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
    try {  
        Date date = formatter.parse("31/03/2015");       
    } catch (ParseException e) {e.printStackTrace();}
	return null;  
}  
}

