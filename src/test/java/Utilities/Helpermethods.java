package Utilities;

import org.apache.commons.lang3.RandomStringUtils;

public class Helpermethods 
{
	public String generateRandomString(int value)
	{
		return RandomStringUtils.randomAlphanumeric(value);
		
	}

}
