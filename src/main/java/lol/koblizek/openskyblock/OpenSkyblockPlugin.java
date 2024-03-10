package lol.koblizek.openskyblock;

import lol.koblizek.openskyblock.api.SpringApiApplication;
import org.bukkit.plugin.java.JavaPlugin;

public final class OpenSkyblockPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        SpringApiApplication.main(new String[0]);
    }
}
