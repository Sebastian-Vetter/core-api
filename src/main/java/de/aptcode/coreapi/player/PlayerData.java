package de.aptcode.coreapi.player;

/*
Data class for the player.
 */

import de.aptcode.coreapi.interfaces.Data;

import java.util.ArrayList;
import java.util.HashMap;

public class PlayerData extends Data<PlayerData> {

    //Player data
    private String uniqueId;
    private String playerName;
    private ArrayList<String> ips;
    private int level;
    private double xp;
    private double tokens;
    private long playtime;
    private long lastPlaytime;
    private boolean vanished;

    //Minecraft data
    private String inventory;
    private double health;
    private double food;
    private int experienceLevel;
    private float experienceProgress;

    //Island data
    private boolean hasIsland;
    private ArrayList<String> invited;
    private int boughtSlots;
    private long islandResetCooldown;

    //Discord data
    private boolean isVerified;
    private String discordVerifyPlayerNameUnique;

    //Proxy data
    private int banPoints;
    private boolean banned;
    private int banId;
    private int reason;
    private long expires;
    private long lastJoin;
    private int join;
    private String lastServer;
    private String currentServer;
    private HashMap<String, String> friends;

    //Clan data
    private String clanName;
    private String clanRank;

}
