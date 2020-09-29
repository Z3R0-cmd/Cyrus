package com.example.examplemod;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Cyrus.MODID, name = Cyrus.NAME, version = Cyrus.VERSION)
public class Cyrus
{
    public static final String MODID = "cyrus";
    public static final String NAME = "Cyrus Client";
    public static final String VERSION = "1.0.0";



    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        System.out.println("Starting Cyrus Client v" + VERSION);
    }
}
