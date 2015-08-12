package com.YunusKayne.PetRock.client.settings;

import net.minecraft.client.settings.KeyBinding;

import org.lwjgl.input.Keyboard;

import com.YunusKayne.PetRock.client.handler.ConfigHandler;

import cpw.mods.fml.client.registry.ClientRegistry;

public class Keybindings
{
    public static KeyBinding Hello;
    public static KeyBinding Debug;

    public static void init()
    {
        Hello = new KeyBinding("key.Hello", Keyboard.KEY_H, "key.Category");
        if(ConfigHandler.debugMode) Debug = new KeyBinding("key.Debug", Keyboard.KEY_Y, "key.Category");

        //Register KeyBindings
        ClientRegistry.registerKeyBinding(Hello);
        if(ConfigHandler.debugMode) ClientRegistry.registerKeyBinding(Debug);
    }
}
