package org.trainerlord.worldsystem.gui.playeroption;

import org.trainerlord.worldsystem.gui.inventory.DependListener;
import org.trainerlord.worldsystem.gui.inventory.OrcItem;
import org.trainerlord.worldsystem.wrapper.WorldPlayer;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
public class GamemodeStatus implements DependListener{
    private final WorldPlayer wp;

    public GamemodeStatus(WorldPlayer wp) {
        this.wp = wp;
    }

    @Override
    public ItemStack getItemStack(Player p, WorldPlayer player) {
        return wp.canChangeGamemode() ? OrcItem.enabled.getItemStack(p, wp) : OrcItem.disabled.getItemStack(p, wp);
    }
}
