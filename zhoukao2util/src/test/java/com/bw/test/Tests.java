package com.bw.test;
import org.junit.Test;

import com.bw.util.Stringutil;

public class Tests {
	
	
	@Test
	public void phone(){
		boolean phone = Stringutil.phone("a");
		System.out.println(phone);
	}
	@Test
	public void eamil(){
		boolean b = Stringutil.eamil("1935474547@qq.com");
		System.out.println(b);
	}
}
