package de.aptcode.coreapi.island;

import de.aptcode.coreapi.data.Data;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.List;
import java.util.Map;

/*

    Data class for the island.

 */

@AllArgsConstructor
@Getter
@Setter
public class IslandData extends Data<IslandData> {

    private final String uniqueId;
    private final String name;
    private final String schematic;
    private final String type;

    private final int slot;
    private final int boarderRadius;
    private final int level;
    private final int xp;
    private final int warps;

    private final boolean published;
    private final boolean day;
    private final boolean damage;
    private final boolean snow;
    private final boolean ownerOnline;

    private final List<String> manager;
    private final List<String> trusted;
    private final List<String> member;
    private final List<String> guest;
    private final List<String> bans;
    private final List<Player> playersOnIsland;

    private final Map<String, String> invites;
    private final Map<String, Long> lastOnline;

    private final Location spawnLocation;

}
