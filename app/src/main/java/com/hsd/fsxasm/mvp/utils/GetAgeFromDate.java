package com.hsd.fsxasm.mvp.utils;import java.util.Calendar;import java.util.Date;public class GetAgeFromDate {	/**	 * 根据日期算年龄	 * 	 * @param user_birthday	 * @return	 */	public static int getAge(Date user_birthday) {		int age = 0;		Calendar born = Calendar.getInstance();		Calendar now = Calendar.getInstance();		if (user_birthday != null) {			now.setTime(new Date());			born.setTime(user_birthday);			if (born.after(now)) {				throw new IllegalArgumentException(						"Can't be born in the future");			}			age = now.get(Calendar.YEAR) - born.get(Calendar.YEAR);			if (now.get(Calendar.DAY_OF_YEAR) < born.get(Calendar.DAY_OF_YEAR)) {				age -= 1;			}		}		return age;	}}