package com.hw.common.utils;


import org.apache.commons.lang3.time.DateUtils;

import java.math.BigDecimal;
import java.text.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;


public class DateUtil {

    public static double getQuot(Date date1, Date date2) {
        double quot = 0D;
//        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd:Hh:mm:ss");
        try {
            quot = (double) (date1.getTime() - date2.getTime());
            quot = quot / 86400000;
            BigDecimal b = new BigDecimal(quot);
            return b.setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return quot;
    }

    /**
     * 判断是否传入时间已经超过了规定的小时数(以传入的参照时间点为准)
     * @author Jason.Ma
     * @email malin@360buy.com
     * @date 2012-9-4  下午5:07:17
     * @param target
     * @param hours
     * @param reference
     * @return
     */
    public static boolean ifTimeAfterHours(Date target, Integer hours, Date reference) {
    	target = DateUtils.addHours(target, hours);
		return reference.after(target);
    }
    
    /**
     * 获取量时间间隔，单位分钟
     * @param beginDate
     * @param endDate
     * @return
     */
    public static Integer getTimeIntervalMinutes(Date beginDate, Date endDate) {
        Integer result = 0;
        double quot = 0D;
//        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd:Hh:mm:ss");
        try {
            quot = (double) (endDate.getTime() - beginDate.getTime());
            quot = quot / 60000;       //1分钟=60000毫秒
            BigDecimal b = new BigDecimal(quot);
            quot =  b.setScale(1, BigDecimal.ROUND_HALF_DOWN ).doubleValue();
        } catch (Exception e) {
            e.printStackTrace();
        }
        DecimalFormat f = new DecimalFormat("#0");
        result= Integer.parseInt(f.format(quot));
        return result;
    }

    public static String getDateString(Date date) {
        if(date == null){
            return null;
        }
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return ft.format(date);
    }

    public static String getDateStringToMin(Date date) {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        return ft.format(date);
    }
    
    public static Date getDate(String date) {
        try {
            SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            return ft.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new Date();
    }

    public static Date getDateToDay(String date) {
        try {
            SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
            return ft.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new Date();
    }
    
    public static Date getDateByHM(String date) {
        try {
            SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            return ft.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new Date();
    }

    /**
     * 转化为标准时间
     * @param date
     * @return
     */
    public static final String toGMT(Date date) {
        Locale aLocale = Locale.US;
        DateFormat fmt = new SimpleDateFormat("EEE,d MMM yyyy hh:mm:ss z", new DateFormatSymbols(aLocale));
        fmt.setTimeZone(TimeZone.getTimeZone("GMT"));
        return fmt.format(date);
    }

    /**
     * 给出一个时间，进行判断是否超出指定时间范围
     * @param date
     * @param days
     * @return
     */
    public static boolean outOfDay(Date date, int days){
        Calendar calendar = Calendar.getInstance();
        Calendar compareDate = Calendar.getInstance();
        compareDate.setTime(date);
        compareDate.add(Calendar.DAY_OF_MONTH, days);
        if(compareDate.before(calendar)){
            return true;
        }
        return false;
    }

    /**
     * 根据时间转成相应的字符串
     * @param date
     * @return
     */
    public static String getReserveDateStr(Date date){
        if(date == null){
            return null;
        }
        String[] weeks = {"[周日]","[周一]","[周二]","[周三]","[周四]","[周五]","[周六]"};
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int week_index = cal.get(Calendar.DAY_OF_WEEK) - 1;
        if(week_index<0){
            week_index = 0;
        }
        return (cal.get(Calendar.MONTH) + 1)+"月"+cal.get(Calendar.DATE)+"日"+weeks[week_index];
    }

    /**
     * 给出时间是否落在2014年春节期间
     * @param sourceDate
     * @return
     */
    public static boolean judgeDropIntoNewYearDate(Date sourceDate){

        String date1 = "2015-02-18 00:00:01";
        String date2 = "2015-02-24 23:59:59";
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date dateBegin = null;
        Date dateEnd = null;
        try {
            dateBegin = ft.parse(date1);
            dateEnd = ft.parse(date2);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        if(dateBegin != null && dateEnd != null){
            return sourceDate.getTime() - dateBegin.getTime() > 0 && dateEnd.getTime() - sourceDate.getTime() > 0;
        }else{
            return false;
        }
    }

    /**
     * 根据时间转成相应的字符串  格式如：02-12   当日则返回“当天”
     * @param date
     * @return
     */
    public static String getReserveDateMonthAndDayStr(Date date){
        if(date == null){
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        if(sdf.format(new Date()).equals(sdf.format(date))){
            return "当天";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd");
        return simpleDateFormat.format(date);
    }
    /**
     * 根据时间转成相应的字符串  格式如：02-12   当日则返回“当天”
     * @param
     * @return
     */
	public static String getReserveDateStr(Date startDate, Date endDate) {
		if (startDate == null) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
		return sdf.format(startDate) + " ("+getReserveDateWeekStr(startDate) +") "+ simpleDateFormat.format(startDate) + "-"
				+ simpleDateFormat.format(endDate);

	}

    /**
     * 根据时间转成相应的字符串     格式如：周二
     * @param date
     * @return
     */
    public static String getReserveDateWeekStr(Date date){
        if(date == null){
            return null;
        }
        String[] weeks = {"周日","周一","周二","周三","周四","周五","周六"};
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int week_index = cal.get(Calendar.DAY_OF_WEEK) - 1;
        if(week_index<0){
            week_index = 0;
        }
        return weeks[week_index];
    }

    /**
     * 获取量时间间隔，计算自然天
     * @param beginDate
     * @param endDate
     * 参数是Date
     * @return
     */
    public static Integer getTimeIntervalDaysByDate(String beginDate, String endDate) {
        Date begin = getDateToDay(beginDate);
        Date end = getDateToDay(endDate);
        int days = 0;
        try {
            days = (int) (end.getTime() / 86400000 - begin.getTime() / 86400000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return days;
    }

    public static void main(String[] args) throws Exception {

        String str = "2014-09-30 10:20";
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        Date date = ft.parse(str);

        System.out.println(checkNowDateHourToDate(date,1));
    }

    /**
     * 判断当前时间是否比传入的小时数早
     * 2014年9月25日17:44:42
     * @param hour
     * @return
     */
    public static boolean checkNowDateBeforeHour(Integer hour){
        Date time = new Date();
        SimpleDateFormat format=new SimpleDateFormat("H");
        String hh = format.format(time);

        if(Integer.parseInt(hh) < hour){
            return true;
        }
        return false;
    }

    /**
     * 判断当前时间是否比传入的时间查N小时
     * 2014年9月25日17:44:42
     * @param hour
     * @return
     */
    public static boolean checkNowDateHourToDate(Date source, Integer hour){
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DAY_OF_MONTH, hour);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dayAfter = simpleDateFormat.format(c.getTime());
        String sourceStr = simpleDateFormat.format(source);
        if(dayAfter.equals(sourceStr)){
            return true;
        }
        return false;
    }
    
    
    /**
     * 取当天开始时间
     * 2014年9月25日17:44:42
     * @param
     * @return
     */
    public static Date getStartOfDay(Date source){
        Calendar c = Calendar.getInstance();
        c.setTime(source);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        return c.getTime();
    }
    
    
    
    /**
     * 取当天结束时间
     * 2014年9月25日17:44:42
     * @param
     * @return
     */
    public static Date getEndOfDay(Date source){
    	 Calendar c = Calendar.getInstance();
         c.setTime(source);
         c.set(Calendar.HOUR_OF_DAY, 23);
         c.set(Calendar.MINUTE, 59);
         c.set(Calendar.SECOND, 59);
         return c.getTime();

    }
    /**
     * 根据当前时间获取问候时间。
     * @param
     * @return
     */
    public String getDateSx(){
        String str="早上好";
        Calendar cal = Calendar.getInstance();
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        if (hour >= 6 && hour < 8) {
            str="早上好";
        } else if (hour >= 8 && hour < 11) {
            str="上午好";
        } else if (hour >= 11 && hour < 13) {
            str="中午好";
        } else if (hour >= 13 && hour < 18) {
            str="下午好";
        } else {
            str="晚上好";
        }
        return str;
    }


    /**
     * 时间间隔秒数
     * @param startTime 起始时间 08:00
     * @param endTime 结束时间 09:00
     * @return 时间间隔
     */
    public static BigDecimal getTimeHour(String startTime, String endTime) {

        long sumtime = 0;
        String[] startSecondArr = startTime.split(":");
        String[] endSecondEndArr = endTime.split(":");
        if(endTime.compareTo(startTime) >= 0) {
            Long startSecond = new Long(
                    Integer.parseInt(startSecondArr[0])*3600 +
                            Integer.parseInt(startSecondArr[1])*60 +
                            Integer.parseInt(startSecondArr[2]));
            Long endSecond = new Long(
                    Integer.parseInt(endSecondEndArr[0])*3600 +
                            Integer.parseInt(endSecondEndArr[1])*60 +
                            Integer.parseInt(endSecondEndArr[2]));
            sumtime = sumtime + endSecond.longValue() - startSecond.longValue();
        } else {
            Long startSecond = new Long(
                    Integer.parseInt(startSecondArr[0])*3600 +
                            Integer.parseInt(startSecondArr[1])*60 +
                            Integer.parseInt(startSecondArr[2]));
            Long endSecond = new Long(24*3600);
            sumtime = sumtime + Integer.parseInt(endSecondEndArr[0])*3600 +
                    Integer.parseInt(endSecondEndArr[1])*60 +
                    Integer.parseInt(endSecondEndArr[2]);
            sumtime = sumtime + endSecond.longValue() - startSecond.longValue();
        }
        //如果是24小时的给固定值。
        if(sumtime==86340)
        {
            sumtime=86400;
        }
        BigDecimal hours = new BigDecimal(sumtime).divide(new BigDecimal(3600));
        return hours;
    }

}
