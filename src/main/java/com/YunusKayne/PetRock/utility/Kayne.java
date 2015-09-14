package com.YunusKayne.PetRock.utility;

import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Arrays;
import java.util.Random;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import jdk.nashorn.api.scripting.URLReader;
import jdk.nashorn.internal.runtime.regexp.RegExp;
import net.minecraft.util.EnumChatFormatting;
import scala.Char;

public class Kayne
{	
	public static String getRandomName()
	{
		JSONParser parser = new JSONParser();
		Random random = new Random();
		 
        try
        {
        	System.out.println("--------------------------------------------------------------------------------");
        	URL url = new URL("https://raw.githubusercontent.com/Yunus1903/Pet-Rock/master/names.json");
            Object obj = parser.parse(new InputStreamReader(url.openStream(), "UTF-8"));
 
            JSONObject jsonObject = (JSONObject) obj;
 
            String brokenArray = jsonObject.get("names").toString();
            
            String[] tempNames = brokenArray.split("/(?!\")(.)\\w+/igm");
            
            tempNames[0] = tempNames[0].split("/\\[\"/")[1];
            tempNames[tempNames.length-1] = tempNames[tempNames.length-1].split("/\"/\\]")[1];
            
            System.out.println(tempNames);
            
            //System.out.println(names[random.nextInt(names.length -1)]);
            return "test";
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return EnumChatFormatting.RED + "ERROR: " + EnumChatFormatting.WHITE + "Kayne, your weird!";
        }
    }
}
