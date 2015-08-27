package com.YunusKayne.PetRock.utility;

import java.util.Random;

public class Kayne
{
	public static final String[] names = {"Neko-Chan", "Goshujinsama", "Pierre", "Steiner", "Rokku", "Piedra", "Edelstein", "Wallenstein", "Aiz", "Laura", "Riko", "Ako", "Gokan", "Okami", "Miia", "Suu", "Papi", "Yuri", "manmaed", "Yuno", "Eryn", "Lingyin Huang", "Kana", "Kurumi", "Dick", "Kim Jong-un", "Obama"};

	public static String getRandomName()
	{
		Random random = new Random();
		return names[random.nextInt(names.length -1)];
	}
}
