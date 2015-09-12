package com.YunusKayne.PetRock.utility;

import java.io.FileReader;
import java.net.URL;
import java.util.Random;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import jdk.nashorn.api.scripting.URLReader;

public class Kayne
{
	public static final String[] names =
		{		
			"Neko-Chan", "Goshujinsama", "Pierre", "Steiner", "Rokku", "Piedra", "Edelstein", "Wallenstein",
			"Aiz", "Laura", "Riko", "Ako", "Gokan", "Okami", "Miia", "Suu",
			"Papi", "Yuri", "manmaed", "Yuno", "Eryn", "Lingyin Huang", "Kana", "Kurumi",
			"Dick", "Kim Jong-un", "Obama", "Masochist-Chan", "YuKay", "SOX"
		};

	public static String getRandomName()
	{
		Random random = new Random();
		return names[random.nextInt(names.length -1)];
	}
	
	public static void getNames()
	{
		JSONParser parser = new JSONParser();
		 
        try
        {
            Object obj = parser.parse(new FileReader("http://widget.mcf.li/mc-mods/minecraft/230556-petrock-mod.json"));
 
            JSONObject jsonObject = (JSONObject) obj;
 
            String title = (String) jsonObject.get("title");
 
            System.out.println(title);
 
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
