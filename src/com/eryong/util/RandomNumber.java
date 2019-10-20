package com.eryong.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RandomNumber {

	public static String randomnumber(){
	Date d=new Date();
	SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
	String st=sdf.format(d);
	st=st+(int)(Math.random()*1000000);
		return st;
		
	}
	public static void main(String[] args) {
		System.out.println("st");
	}
	public static String randomnumbers(){
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy");
		String st=sdf.format(d);
		st=st+(int)(Math.random()*100);
			return st;
			
		}
}