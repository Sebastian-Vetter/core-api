package de.aptcode.coreapi.warland;

import de.aptcode.coreapi.data.Data;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.Location;
import org.bukkit.block.Block;

@AllArgsConstructor
@Getter
@Setter
public class WarlandChestData extends Data<WarlandChestData> {

    private double id;
    private Location location;
    private Block block;
    private boolean opened;
    private String inventory;

}
