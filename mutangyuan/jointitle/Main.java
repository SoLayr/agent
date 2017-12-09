package mutangyuan.jointitle;
import org.bukkit.Server;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main
extends JavaPlugin
{
  public static Main plugin;

public void onEnable()
{
 plugin = this;
getServer().getConsoleSender().sendMessage("§eJoinTitle >>> §7插件成功加载！");
saveDefaultConfig();
getServer().getPluginManager().registerEvents(new Title(), this);
getServer().getPluginManager().registerEvents(new Message(), this);
}

public void onDisable()
{
getServer().getConsoleSender().sendMessage("§eJoinTitle >>> §7插件成功卸载！");
}
}


