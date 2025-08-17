package de.aptcode.coreapi.economics;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.Material;


@AllArgsConstructor
@Getter
@Setter
public class MarketItem {

    private final Material material;
    private final double basePrice;
    private final int amount;
    private int npcStock;
    private int circulating;
    private double currentPrice;

}
