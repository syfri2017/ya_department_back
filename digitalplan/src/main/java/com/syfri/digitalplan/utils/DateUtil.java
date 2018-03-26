package com.syfri.digitalplan.utils;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class DateUtil {
	
	/** 
	* 字符串转换成日期 
	* @param str 
	* @return date 
	*/  
	public static Date StrToDate(String str) {  
	    
	   SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");  
	   Date date = null;  
	   try {  
	    date = format.parse(str);  
	   } catch (ParseException e) {  
	    e.printStackTrace();  
	   }  
	   return date;  
	}
	   /** 
	    * 中文字符串日期转换成日期 
	    * @param str 
	    * @return date 
	 * @throws ParseException 
	    */  
	    public static Date CHStrToDate(String str) throws ParseException {  
	        
	       SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日");  
	       Date date = null;  
	       date = format.parse(str);  
	       return date;  
	    }
	
	/**
	 * 当前日期转成字符串 （yyyy-MM-dd HH:mm:ss）
	 * @return
	 */
	public static String NowDateToString(String formate) {
	    if(formate.equals("")||formate==null){
	        formate="yyyy-MM-dd HH:mm:ss";
	    }
		// 创建日期对象
        Date d = new Date();
        // 给定模式
        SimpleDateFormat sdf = new SimpleDateFormat(formate);
        // public final String format(Date date)
        return sdf.format(d);
	}
	
	/**
	 * 当前日期转成字符串 （yyyy-MM-dd HH:mm:ss）
	 * @return
	 */
	public static String DateToString(Date date) {
		// 创建日期对象
        //Date d = new Date();
        // 给定模式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // public final String format(Date date)
        return sdf.format(date);
	}

	// 从字符串中分析日期
	public static Date parseDate(String dateStr) throws ParseException {
		Date date = null;
		String[] dateArray = dateStr.split("\\D+"); // +防止多个非数字字符在一起时导致解析错误
		int dateLen = dateArray.length;
		int dateStrLen = dateStr.length();
		if (dateLen > 0) {
			if (dateLen == 1 && dateStrLen > 4) {
				if (dateStrLen == "yyyyMMddHHmmss".length()) {
					// 如果字符串长度为14位并且不包含其他非数字字符，则按照（yyyyMMddHHmmss）格式解析
					date = parseDate(dateStr, "yyyyMMddHHmmss");
				} else if (dateStrLen == "yyyyMMddHHmm".length()) {
					date = parseDate(dateStr, "yyyyMMddHHmm");
				} else if (dateStrLen == "yyyyMMddHH".length()) {
					date = parseDate(dateStr, "yyyyMMddHH");
				} else if (dateStrLen == "yyyyMMdd".length()) {
					date = parseDate(dateStr, "yyyyMMdd");
				} else if (dateStrLen == "yyyyMM".length()) {
					date = parseDate(dateStr, "yyyyMM");
				}
			} else {
				String fDateStr = dateArray[0];
				for (int i = 1; i < dateLen; i++) {
					// 左补齐是防止十位数省略的情况
					fDateStr += leftPad(dateArray[i], "0", 2);
				}

				if (dateStr.trim().matches("^\\d{1,2}:\\d{1,2}(:\\d{1,2})?$")) {
					// 补充年月日3个字段
					dateLen += 3;
					fDateStr = formatDate(new Date(), "yyyyMMdd") + fDateStr;
				}

				date = parseDate(fDateStr, "yyyyMMddHHmmss".substring(0, (dateLen - 1) * 2 + 4));
			}
		}

		return date;
	}

	// 左补齐
	public static String leftPad(String str, String pad, int len) {
		String newStr = (str == null ? "" : str);
		while (newStr.length() < len) {
			newStr = pad + newStr;
		}
		if (newStr.length() > len) {
			newStr = newStr.substring(newStr.length() - len);
		}
		return newStr;
	}
	
	/** 
	 * String To String 日期格式字符串之间的转换 
	 *  
	 * @param str 
	 *            转换的字符串 
	 * @param pattern1 
	 *            转换的字符串的日期格式，例如 yyyy-MM-dd HH:mm:ss 
	 * @param pattern2 
	 *            转换目的字符串的日期格式，例如 yyyy-MM-dd 
	 * @return String 
	 */  
	public static String formatStr(String str, String pattern1, String pattern2) {  
	    try {  
	        SimpleDateFormat sdf = new SimpleDateFormat(pattern1);  
	        Date date = sdf.parse(str);  
	        return new SimpleDateFormat(pattern2).format(date);  
	    } catch (Exception e) {  
	        throw new IllegalArgumentException("don't format type");  
	    }  
	}  
	  
	/** 
	 * Date To String 日期转字符串 
	 *  
	 * @param date 
	 *            日期 
	 * @param pattern 
	 *            目的字符串的日期格式，例如 yyyy-MM-dd 
	 * @return String 
	 */  
	public static String formatDate(Date date, String pattern) {  
	    try {  
	        return new SimpleDateFormat(pattern).format(date);  
	    } catch (Exception e) {  
	        return "";  
	    }  
	}  
	  
	/** 
	 * String To Date 字符串转日期格式 
	 *  
	 * @param date 
	 *            日期格式的字符串 
	 * @param pattern 
	 *            日期格式，例如 yyyy-MM-dd 
	 * @return Date 
	 */  
	public static Date parseDate(String date, String pattern) {  
	    try {  
	        return new SimpleDateFormat(pattern).parse(date);  
	    } catch (ParseException e) {  
	        throw new IllegalArgumentException("don't format type");  
	    }  
	}  
	  
	/** 
	 * 计算两个日期的相差天数 
	 *  
	 * @param startDate 
	 *            开始日期 
	 * @param endDate 
	 *            结束日期 
	 * @return 相差天数 
	 * @throws ParseException 
	 */  
	public static int daysBetween(Date startDate, Date endDate) throws ParseException {  
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
	    startDate = sdf.parse(sdf.format(startDate));  
	    endDate = sdf.parse(sdf.format(endDate));  
	    Calendar cal = Calendar.getInstance();  
	    cal.setTime(startDate);  
	    long startTime = cal.getTimeInMillis();  
	    cal.setTime(endDate);  
	    long endTime = cal.getTimeInMillis();  
	    long betweenDays = (endTime - startTime) / (1000 * 3600 * 24);  
	    return Integer.parseInt(String.valueOf(betweenDays));  
	}  
	  
	/** 
	 * 给当前日期添加天数 
	 *  
	 * @param date 
	 *            日期 
	 * @param day 
	 *            天数 
	 * @return Date 
	 */  
	public static Date addDateDay(Date date, int day) {  
	    Calendar c = Calendar.getInstance();  
	    c.setTime(date);  
	    c.add(Calendar.DATE, day);  
	    date = c.getTime();  
	    return date;  
	}  
	
	/**
	 * 获得本周一 和本周日的日期
	 * @return
	 */
	public static Map<String, String> mondayAndSundayDate() {
		Map<String, String> retMap = new HashMap<String, String>();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd"); //设置时间格式  
        Calendar cal = Calendar.getInstance();  
        //Date time=sdf.parse("2015-9-4 14:22:47");
        Date time=new Date();
        cal.setTime(time);  
        //System.out.println("要计算日期为:"+sdf.format(cal.getTime())); //输出要计算日期  
        
        //判断要计算的日期是否是周日，如果是则减一天计算周六的，否则会出问题，计算到下一周去了  
        int dayWeek = cal.get(Calendar.DAY_OF_WEEK);//获得当前日期是一个星期的第几天  
        if(1 == dayWeek) {  
           cal.add(Calendar.DAY_OF_MONTH, -1);  
        }  
        
       cal.setFirstDayOfWeek(Calendar.MONDAY);//设置一个星期的第一天，按中国的习惯一个星期的第一天是星期一  
       
       int day = cal.get(Calendar.DAY_OF_WEEK);//获得当前日期是一个星期的第几天  
       cal.add(Calendar.DATE, cal.getFirstDayOfWeek()-day);//根据日历的规则，给当前日期减去星期几与一个星期第一天的差值   
       //System.out.println("所在周星期一的日期："+sdf.format(cal.getTime()));
       //System.out.println(cal.getFirstDayOfWeek()+"-"+day+"+6="+(cal.getFirstDayOfWeek()-day+6));
       retMap.put("monday", sdf.format(cal.getTime()));
       cal.add(Calendar.DATE, 6);
       //System.out.println("所在周星期日的日期："+sdf.format(cal.getTime())); 
       retMap.put("sunday", sdf.format(cal.getTime()));
       return retMap;
	}
}
