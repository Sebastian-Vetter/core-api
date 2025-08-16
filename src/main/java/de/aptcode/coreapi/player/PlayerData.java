package de.aptcode.coreapi.player;

/*
Data class for the player.
 */

import com.google.gson.Gson;

import java.util.ArrayList;

public class PlayerData {

    //Minecraft
    private String uniqueId;
    private String playerName;
    private ArrayList<String> ips;
    private int level;
    private double xp;
    private double tokens;
    private long playtime;
    private long lastPlaytime;
    private boolean vanished;
    private String inventory;

    //Island
    private boolean hasIsland;
    private ArrayList<String> invited;
    private int boughtSlots;
    private long islandResetCooldown;

    //Discord
    private boolean isVerified;
    private String discordVerifyPlayerNameUnique;

    //Proxy
    private int banPoints;
    private boolean banned;
    private int banId;
    private int reason;
    private Long expires;


    public static String toJson(PlayerData playerData) {
        return new Gson().toJson(playerData);
    }

    public static PlayerData fromJson(String jsonPlayerData) {
        return new Gson().fromJson(jsonPlayerData, PlayerData.class);
    }

}
