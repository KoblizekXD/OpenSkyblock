package lol.koblizek.openskyblock;

import lol.koblizek.openskyblock.api.SpringApiApplication;
import org.bukkit.plugin.java.JavaPlugin;

public final class OpenSkyblockPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getSLF4JLogger().info("\nUsing OpenSkyblock; Loading Backend API\n");
        SpringApiApplication.main(new String[0]);
        getSLF4JLogger().info("Done, if you have not seen any errors, the plugin is running successfully");
        getSLF4JLogger().info("If you do see, report to developer on GitHub: https://www.github.com/KoblizekXD/OpenSkyblock");
    }
}
