package com.YunusKayne.PetRock.utility;

import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Random;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import jdk.nashorn.api.scripting.URLReader;

public class Kayne
{
	public static String getRandomName()
	{
		Random random = new Random();
		return getNames()[random.nextInt(getNames().length -1)];
	}
	
	public static String[] getNames()
	{
		JSONParser parser = new JSONParser();
		 
        try
        {
        	URL url = new URL("http://widget.mcf.li/mc-mods/minecraft/230556-petrock-mod.json");
            Object obj = parser.parse(new InputStreamReader(url.openStream(), "UTF-8"));
 
            JSONObject jsonObject = (JSONObject) obj;
 
            String[] names = (String[]) jsonObject.get("names");
            
            return names;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
		return null;
    }
}
