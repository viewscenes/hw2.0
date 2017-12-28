package com.hw.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: xingchaoinfo
 * Date: 14-9-2
 * Time: 下午5:04
 * To change this template use File | Settings | File Templates.
 */
public class DateFormatUtils {

    public static String formatDate(Date date, String formatPattern){
        return date==null?"" : new SimpleDateFormat(formatPattern).format(date);
    }
}
