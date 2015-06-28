package com.YunusKayne.PetRock.client.settings;

import org.lwjgl.input.Keyboard;

import com.YunusKayne.PetRock.client.handler.ConfigHandler;

import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.settings.KeyBinding;

public class Keybindings //Change to KeyBinding (Github prob)
{
    public static KeyBinding Hello;
    public static KeyBinding Debug;

    public static void init()
    {
        Hello = new KeyBinding("key.Hello", Keyboard.KEY_H, "key.Category");
        Debug = new KeyBinding("key.Debug", Keyboard.KEY_D, "key.Category");

        //Register KeyBindings
        ClientRegistry.registerKeyBinding(Hello);
        if(ConfigHandler.debugMode) ClientRegistry.registerKeyBinding(Debug);
    }
}
