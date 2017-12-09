 package mutangyuan.jointitle;

 import org.bukkit.configuration.file.FileConfiguration;
/*  4:   */ import org.bukkit.entity.Player;
/*  5:   */ import org.bukkit.event.EventHandler;
/*  6:   */ import org.bukkit.event.Listener;
/*  7:   */ import org.bukkit.event.player.PlayerJoinEvent;

 public class Title
   implements Listener
 {
   @EventHandler
   {
     Player p = evt.getPlayer();
     p.sendTitle(Main.plugin.getConfig().getString("JoinTitle1").replace("&", "§"), Main.plugin.getConfig().getString("JoinTitle2").replace("&", "§"));
   }
 }

