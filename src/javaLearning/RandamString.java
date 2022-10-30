package javaLearning;

import org.apache.commons.lang3.RandomStringUtils;

public class RandamString {

	public static void main(String[] args) {
		
		randomstring();
		
	}
		
		public static String randomstring()
		{
			String generatedstring=RandomStringUtils.randomAlphabetic(8);
			return(generatedstring);
		}

	}


