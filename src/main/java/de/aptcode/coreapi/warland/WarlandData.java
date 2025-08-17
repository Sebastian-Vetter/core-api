package de.aptcode.coreapi.warland;

import de.aptcode.coreapi.data.Data;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.Location;
import org.bukkit.block.Block;

import java.util.HashMap;

@AllArgsConstructor
@Setter
@Getter
public class WarlandData extends Data<WarlandData> {

    private Location spawnLocation;
    private double spawnRadius;
    private Location teleportNPC;
    private Location[] randomTeleport;
    private HashMap<Block, Long> ores;
    private Location[] bossLocations;
    private boolean setupFinished;
    private HashMap<Block, WarlandChestData> chests;

}
