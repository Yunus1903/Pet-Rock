package com.YunusKayne.PetRock.utility;

import java.util.Random;

public class Kayne
{
	//Kayne wanted this... :P
	public static final String[] names = {"Neko-Chan", "Goshujinsama", "Pierre", "Steiner", "Rokku", "Piedra", "Edelstein", "Wallenstein", "Aiz", "Laura", "Riko", "Ako", "Gokan", "Okami", "Miia", "Suu", "Papi", "Yuri", "manmaed", "Yuno"};

	public static String getRandomName()
	{
		Random random = new Random();
		return names[random.nextInt(names.length -1)];
	}
}
