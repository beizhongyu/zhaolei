package com.zl.first.test.controller;

import com.zl.first.test.ApplicationWebBoot;
import org.springframework.boot.SpringApplication;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class testController {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long endTime = new Date().getTime();
        System.out.println(sdf.format(new Date(endTime)));
        Long startTime = getMonthBegin(new Date());
        System.out.println(sdf.format(new Date(startTime)));
    }

    private static Long getMonthBegin(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);

        //设置为1号,当前日期既为本月第一天
        c.set(Calendar.DAY_OF_MONTH, 1);
        //将小时至0
        c.set(Calendar.HOUR_OF_DAY, 0);
        //将分钟至0
        c.set(Calendar.MINUTE, 0);
        //将秒至0
        c.set(Calendar.SECOND,0);
        //将毫秒至0
        c.set(Calendar.MILLISECOND, 0);
        // 获取本月第一天的时间戳
        return c.getTimeInMillis();
    }
}
