package ligionbob.cryingblocks;

import ligionbob.cryingblocks.proxy.CommonProxy;
import ligionbob.cryingblocks.utils.Utils;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, version = Reference.MODVERSION, acceptedMinecraftVersions = Reference.MCVERSION, name = Reference.MODNAME)
public class Main {

    @Mod.Instance(Reference.MODID)
    public static Main instance;

    @SidedProxy(serverSide = Reference.SERVER_PROXY_CLASS, clientSide = Reference.CLIENT_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
        Utils.getLogger().info("Pre Init finished.");
    }
    @Mod.EventHandler
    public static void init(FMLInitializationEvent event) {
        Utils.getLogger().info("Init Finished.");
    }
}
