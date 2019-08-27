package com.thecorrupted.recipemod;

        import net.minecraft.init.Blocks;
        import net.minecraftforge.fml.common.Mod;
        import net.minecraftforge.fml.common.Mod.EventHandler;
        import net.minecraftforge.fml.common.event.FMLInitializationEvent;
        import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
        import org.apache.logging.log4j.Logger;

@Mod(modid = recipemod.MODID, name = recipemod.NAME, version = recipemod.VERSION, updateJSON = "" )
public class recipemod
{
    public static final String MODID = "recipecraft";
    public static final String NAME = "Recipe Craft";
    public static final String VERSION = "1.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
