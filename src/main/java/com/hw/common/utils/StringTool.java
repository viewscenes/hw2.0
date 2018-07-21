package com.hw.common.utils;

import java.text.*;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jdom.*;
import org.jdom.output.XMLOutputter;



import java.io.*;

/**

 *

 * <p>Title: </p>

 * <p>Description: </p>

 * <p>Copyright: Copyright (c) 2003</p>

 * <p>Company: </p>

 * @author not attributable

 * @version 1.0

 */

public class StringTool {

  public final static String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
  public final static String DATE_FORMAT2 = "yyyyMMddHHmmss";
  public final static String TIME_FORMAT = "HH:mm:ss";

  public StringTool() {

  }





  /**
   * 将给定的字符串解析，并返回根节点
   * @param msg
   * @return
   */
  public static Element getXMLRoot(String msg) {

    Element root = null;

    try {

      StringReader read = new StringReader(msg);

      org.jdom.input.SAXBuilder builder = new org.jdom.input.SAXBuilder(false);

      Document doc = builder.build(read);

      root = doc.getRootElement();

    } catch (JDOMException ex) {
      ex.printStackTrace();

    } catch (IOException e) {
      e.printStackTrace();
    }

    return root;

  }



  /**
   * 加小时方法
   * <p>class/function:com.viewscenes.util
   * <p>explain:
   * <p>author-date:谭长伟 2012-8-21
   * @param:
   * @return:
   */
  public static Date addHours(String date,int hours){
    Date d = stringToDate(date);
    return addHours(d,hours);
  }
  public static Date addHours(int hours){
    return addHours(new Date(),hours);
  }

  public static Date addHours(Date d,int hours){
    if (d == null)
      d = new Date();
    long l = d.getTime();
    l = l + hours * 60 * 60 * 1000;
    d.setTime(l);
    return d;
  }
  /**

   * 说明: 以后可以使用工具类中的对应函数

   * 把Date的时间格式转换成字符串形式

   * @param d Date时间格式(null表示当天时间)

   * @return 时间字串('YYYY-MM-DD HH:MM:SS')


   */

  public static String Date2String(java.util.Date d) {

    if (d == null) {

      d = new Date();

    }

    SimpleDateFormat df = new SimpleDateFormat(DATE_FORMAT);

    String s = df.format(d);

    return s;

  }
  public static String time2String(java.util.Date d) {

    if (d == null) {

      d = new Date();

    }

    SimpleDateFormat df = new SimpleDateFormat(TIME_FORMAT);

    String s = df.format(d);

    return s;

  }
  /**

   * 将String转为Date

   * @param strDate 时间字符串

   * @return 日期

   */

  public static Date stringToDate(String strDate) {

    try {

      SimpleDateFormat d = new SimpleDateFormat(DATE_FORMAT);

      ParsePosition pos = new ParsePosition(0);

      Date currentTime = d.parse(strDate, pos);

      return currentTime;

    }

    catch (Exception e) {

      e.printStackTrace();

    }

    return null;

  }
  /**

   * 将原字符串中的子串替换为新的子串

   * 方法返回新字符串，不改变原字符串

   * @param src 原字符串

   * @param oldStr 待替换的字符串

   * @param newStr 替换的字符串

   * @return 目标字符串

   */

  public static String replace(String src, String oldStr, String newStr){

    if ((src==null)||(oldStr==null)||(newStr==null)) return "";

    StringBuffer buffer = new StringBuffer();

    int indexStart = 0;

    int indexEnd = src.indexOf(oldStr);

    while (indexEnd!=-1){

      buffer.append(src.substring(indexStart,indexEnd));

      buffer.append(newStr);

      indexStart = indexEnd+oldStr.length();

      indexEnd = src.indexOf(oldStr,indexStart);

    }

    buffer.append(src.substring(indexStart));

    return buffer.toString();

  }

  /**

   * 将字符串格式化为可在Javascript中用alert函数显示的格式

   * @param msg 原字符串

   * @return 格式化后的字符串

   */

  public static String formatAlertMsg(String msg){

    msg = msg.replace('\r',' ');

    msg = msg.replace('\n',' ');

    return msg;

  }
  /**
   * 字符串转换为整数
   * @param str String
   * @return int
   */
  public static int stringToInt(String str){

    if(isNumeric(str)){
      return Integer.parseInt(str);
    }

    return 0;

  }

  /**
   * 判断字符串是否未数字字符串
   * @param str String
   * @return boolean
   */
  public static boolean isNumeric(String str){

    if ("".equals(str)){

      return false;
    }
    if(str.indexOf(".")>-1) str=str.replace(".", "");
    Pattern pattern = Pattern.compile("[0-9]*");

    Matcher isNum = pattern.matcher(str);

    if(!isNum.matches()){
      return false;
    }

    return true;
  }
  public static Document getXmlMsg(){
    Element root = new Element("Msg");
    root.setAttribute("return", "1");
    Document doc = new Document(root);
    return doc;
  }




}
