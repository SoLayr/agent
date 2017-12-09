 package mutangyuan.jointitle;

 import org.bukkit.configuration.file.FileConfiguration;
/*  4:   */ import org.bukkit.entity.Player;
/*  5:   */ import org.bukkit.event.EventHandler;
/*  6:   */ import org.bukkit.event.Listener;
/*  7:   */ import org.bukkit.event.player.PlayerJoinEvent;

 public class Message
   implements Listener
 {
  @EventHandler
  public void onPlayerJoin(PlayerJoinEvent evt)
  {
     Player p = evt.getPlayer();
     for (int i1 = 0; i1 < 20; i1++) {
     p.sendMessage("");
   }
     for (int i = 1; i < 7; i++) {
     p.sendMessage(Main.plugin.getConfig().getString("JoinMessage" + i).replace("&", "§"));
      }
  }
 }
