package com.bw.util;

public class Stringutil {
   private Stringutil (){};
   
  public static String  util(String str){
	  String tar="\\\\n\\\\r";
	  String replaceAll = str.replaceAll(tar, "\n");
	  String tar1="\\\\r";
	  String replaceAll2 = replaceAll.replaceAll(tar1, "<br/>");
	  String tar2="\\\\n";
	  String replaceAll3 = replaceAll2.replaceAll(tar2, "<p></p>");
	  return  replaceAll3;
  }
  public static  boolean  phone(String  str){
	  String str1="^(15[0-9|12[0-9])\\d8$";
	  boolean b = str.isEmpty();
	  return  b;
  }
  public static  boolean  eamil(String  str){
	  String str1="^\\d+qq@(.com)$";
	  boolean b = str.isEmpty();
	  return  b;
  }
}
