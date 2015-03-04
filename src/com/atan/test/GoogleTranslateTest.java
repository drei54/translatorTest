package com.atan.test;

import com.google.api.GoogleAPI;
import com.google.api.GoogleAPIException;
import com.google.api.translate.*;

public class GoogleTranslateTest {

	public static void main(String [] args){
		// Set the HTTP referrer to your website address.
	    GoogleAPI.setHttpReferrer("http://translate.google.com/");

	    // Set the Google Translate API key
	    // See: http://code.google.com/apis/language/translate/v2/getting_started.html
//	    GoogleAPI.setKey(/* Enter your API key here */);

	    String translatedText;
		try {
			translatedText = Translate.DEFAULT.execute("Bonjour le monde", Language.FRENCH, Language.ENGLISH);
		    System.out.println(translatedText);
		} catch (GoogleAPIException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
