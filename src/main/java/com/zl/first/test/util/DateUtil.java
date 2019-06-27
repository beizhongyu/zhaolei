package com.zl.first.test.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    /**
     * @return long 当前时间的长整型格式,如 1247771400000
     */
    public static long date2long(Date date){
        String dataFormat = "yyyy-MM-dd";
        String sourceTime = new SimpleDateFormat(dataFormat).format(date);
        long longTime = 0L;
        DateFormat f = new SimpleDateFormat(dataFormat);
        Date d = null;
        try {
            d = f.parse(sourceTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        longTime = d.getTime();
        return longTime;
    }

    /**
     * @return long 当前时间的长整型格式,如 1247771400000
     */
    public static long string2long(String sourceTime,int conut){
        String dataFormat = "";
        if(conut==0){
            dataFormat = "yyyy-MM-dd";
        }else{
            sourceTime = sourceTime+" 23:59:59";
            dataFormat = "yyyy-MM-dd hh:mm:ss";
        }
        long longTime = 0L;
        DateFormat f = new SimpleDateFormat(dataFormat);
        Date d = null;
        try {
            d = f.parse(sourceTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        longTime = d.getTime();
        return longTime;
    }

    /**
     * 长整型转换为日期类型
     * @return String 长整型对应的格式的时间
     */
    public static String long2String(long longTime)
    {
        String dataFormat = "yyyy-MM-dd";
        Date d = new Date(longTime);
        SimpleDateFormat s = new SimpleDateFormat(dataFormat);
        String str = s.format(d);
        return str;

    }

    public static String date2String(Date date){
        String dataFormat = "yyyy-MM-dd";
        return new SimpleDateFormat(dataFormat).format(date);
    }
}
