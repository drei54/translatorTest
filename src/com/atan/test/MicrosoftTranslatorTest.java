package com.atan.test;
import com.memetix.mst.language.Language;
import com.memetix.mst.translate.Translate;

public class MicrosoftTranslatorTest {

	public static void main(String [] args){
		// Set your Windows Azure Marketplace client info - See http://msdn.microsoft.com/en-us/library/hh454950.aspx
	    Translate.setClientId("xxxxx");
	    Translate.setClientSecret("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

	    String translatedText;
	    String words = "Microsoft Translator is a hosted service, accessed via an API that provides language translation. It can be used to build applications, web sites, utilities, or any scenario where you need language translation. In this article, you’ll walk, step-by-step, through everything you need to get started with using the Translator API to translate content by signing up for the service, registering an application, and getting your Client ID and Client secret.";
		try {
			translatedText = Translate.execute(words, Language.ENGLISH, Language.INDONESIAN);
		    System.out.println(translatedText);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
