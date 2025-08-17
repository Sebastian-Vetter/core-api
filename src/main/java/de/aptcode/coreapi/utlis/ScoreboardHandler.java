package de.aptcode.coreapi.utlis;

import de.aptcode.coreapi.colors.manager.HexCodeManager;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

public class ScoreboardHandler {

    public Scoreboard scoreboard;

    public Objective objective;

    public Player player;

    public ScoreboardHandler(Player player, Scoreboard scoreboard, Objective objective) {
        this.player = player;
        this.scoreboard = scoreboard;
        this.objective = objective;
    }

    public void setTabPrefix(Scoreboard scoreboard) {
        Team administrator = scoreboard.getTeam("a");
        if (administrator == null)
            administrator = scoreboard.registerNewTeam("a");

        Team seniordeveloper = scoreboard.getTeam("b");
        if (seniordeveloper == null)
           seniordeveloper = scoreboard.registerNewTeam("b");

        Team developer = scoreboard.getTeam("c");
        if (developer == null)
            developer = scoreboard.registerNewTeam("c");

        Team seniormoderator = scoreboard.getTeam("d");
        if (seniormoderator == null)
            seniormoderator = scoreboard.registerNewTeam("d");

        Team moderator = scoreboard.getTeam("e");
        if (moderator == null)
            moderator = scoreboard.registerNewTeam("e");

        Team juniormoderator = scoreboard.getTeam("f");
        if (juniormoderator == null)
            juniormoderator = scoreboard.registerNewTeam("f");

        Team seniormedia = scoreboard.getTeam("g");
        if (seniormedia == null)
            seniormedia = scoreboard.registerNewTeam("g");

        Team media = scoreboard.getTeam("h");
        if (media == null)
            media = scoreboard.registerNewTeam("h");

        Team seniorcontent = scoreboard.getTeam("i");
        if (seniorcontent == null)
            seniorcontent = scoreboard.registerNewTeam("i");

        Team content = scoreboard.getTeam("j");
        if (content == null)
            content = scoreboard.registerNewTeam("j");

        Team seniorbuilder = scoreboard.getTeam("k");
        if (seniorbuilder == null)
            seniorbuilder = scoreboard.registerNewTeam("k");

        Team builder = scoreboard.getTeam("l");
        if (builder == null)
            builder = scoreboard.registerNewTeam("l");

        Team creator = scoreboard.getTeam("m");
        if (creator == null)
            creator = scoreboard.registerNewTeam("m");

        Team friend = scoreboard.getTeam("n");
        if (friend == null)
            friend = scoreboard.registerNewTeam("n");

        Team booster = scoreboard.getTeam("o");
        if (booster == null)
            booster = scoreboard.registerNewTeam("o");

        Team eternal = scoreboard.getTeam("p");
        if (eternal == null)
            eternal = scoreboard.registerNewTeam("p");

        Team savage = scoreboard.getTeam("q");
        if (savage == null)
            savage = scoreboard.registerNewTeam("q");

        Team legend = scoreboard.getTeam("r");
        if (legend == null)
            legend = scoreboard.registerNewTeam("r");

        Team ultra = scoreboard.getTeam("s");
        if (ultra == null)
            ultra = scoreboard.registerNewTeam("s");

        Team beta = scoreboard.getTeam("t");
        if (beta == null)
            beta = scoreboard.registerNewTeam("t");

        Team member = scoreboard.getTeam("y");
        if (member == null)
            member = scoreboard.registerNewTeam("y");

        //set prefix
        administrator.setPrefix(HexCodeManager.createGradientFromString("Administrator", new String[]{"#FF0000", "#D2350A"}) + " §7• "); // #FF0000 - #D2350A
        seniordeveloper.setPrefix(HexCodeManager.createGradientFromString("SrDeveloper", new String[]{"#C8C8C8", "#565656"}) + " §7• "); // #C8C8C8 - #565656
        developer.setPrefix(HexCodeManager.createGradientFromString("Developer", new String[]{"#C8C8C8", "#565656"}) + " §7• "); // #C8C8C8 - #565656
        seniormoderator.setPrefix(HexCodeManager.createGradientFromString("SrModerator", new String[]{"#EC7104", "#FF9638"}) + " §7• "); // #EC7104 - #FF9638
        moderator.setPrefix(HexCodeManager.createGradientFromString("Moderator", new String[]{"#EC7104", "#FF9638"}) + " §7• "); // #EC7104 - #FF9638
        juniormoderator.setPrefix(HexCodeManager.createGradientFromString("JrModerator", new String[]{"#D3A806", "#FFE170"}) + " §7• "); // #D3A806 - #FFE170
        seniorcontent.setPrefix(HexCodeManager.createGradientFromString("SrContent", new String[]{"#16A9BD", "#86E7F4"}) + " §7• "); // #16A9BD - #86E7F4
        content.setPrefix(HexCodeManager.createGradientFromString("Content", new String[]{"#16A9BD", "#86E7F4"}) + " §7• "); // #16A9BD - #86E7F4
        seniorbuilder.setPrefix(HexCodeManager.createGradientFromString("SrBuilder", new String[]{"#0CA93E", "#6CF397"}) + " §7• "); //#0CA93E - #6CF397
        builder.setPrefix(HexCodeManager.createGradientFromString("Builder", new String[]{"#0CA93E", "#6CF397"}) + " §7• "); //#0CA93E - #6CF397
        creator.setPrefix(HexCodeManager.createGradientFromString("Creator", new String[]{"#971BA5", "#CB71D5"}) + " §7• "); //#971BA5 - #CB71D5
        friend.setPrefix(HexCodeManager.createGradientFromString("Friend", new String[]{"#0DA27E", "#6BE8CA"}) + " §7• "); //#0DA27E - #6BE8CA
        booster.setPrefix(HexCodeManager.createGradientFromString("Booster", new String[]{"#4AE108", "#84F353"}) + " §7• "); //#4AE108 - #84F353
        eternal.setPrefix(HexCodeManager.createGradientFromString("Eternal", new String[]{"#BE5DDA", "#8B15AD"}) + " §7• "); //#BE5DDA - #8B15AD
        savage.setPrefix(HexCodeManager.createGradientFromString("Savage", new String[]{"#AD154C", "#F0548C"}) + " §7• "); //#AD154C - #F0548C
        legend.setPrefix(HexCodeManager.createGradientFromString("Legend", new String[]{"#00FFF0", "#46C4BD"}) + " §7• "); // #00FFF0 - #46C4BD
        ultra.setPrefix(HexCodeManager.createGradientFromString("Ultra", new String[]{"#FFDC00", "#FFB92D"}) + " §7• "); // #FFDC00 - #FFB92D
        beta.setPrefix(HexCodeManager.createGradientFromString("Beta", new String[]{"#6819D9", "#9A5EF0"}) + " §7• "); // #6819D9 - #9A5EF0
        member.setPrefix(HexCodeManager.createGradientFromString("Member", new String[]{"#8F0EA9", "#2B2B2B"}) + " §7• "); // #959595 - #2B2B2B
        seniormedia.setPrefix(HexCodeManager.createGradientFromString("SrMedia", new String[]{"#8F0EA9", "#DE6DF5"}) + " §7• "); //#8F0EA9 - #DE6DF5
        media.setPrefix(HexCodeManager.createGradientFromString("Media", new String[]{"#8F0EA9", "#DE6DF5"}) + " §7• "); //#8F0EA9 - #DE6DF5


        for (Player player1 : Bukkit.getOnlinePlayers()) {
            Team playerTeam = getTeamForPlayer(scoreboard, player1);
            if (!playerTeam.hasEntry(player1.getName()))
                playerTeam.addEntry(player1.getName());
        }
    }

    public Team getTeamForPlayer(Scoreboard board2, Player player) {
        if (player.hasPermission("merania.rank.administrator"))
            return board2.getTeam("a");
        if (player.hasPermission("merania.rank.seniordeveloper"))
            return board2.getTeam("b");
        if (player.hasPermission("merania.rank.developer"))
            return board2.getTeam("c");
        if (player.hasPermission("merania.rank.seniormoderator"))
            return board2.getTeam("d");
        if (player.hasPermission("merania.rank.moderator"))
            return board2.getTeam("e");
        if (player.hasPermission("merania.rank.juniormoderator"))
            return board2.getTeam("f");
        if (player.hasPermission("merania.rank.seniormedia"))
            return board2.getTeam("g");
        if (player.hasPermission("merania.rank.media"))
            return board2.getTeam("h");
        if (player.hasPermission("merania.rank.seniorcontent"))
            return board2.getTeam("i");
        if (player.hasPermission("merania.rank.content"))
            return board2.getTeam("j");
        if (player.hasPermission("merania.rank.seniorbuilder"))
            return board2.getTeam("k");
        if (player.hasPermission("merania.rank.builder"))
            return board2.getTeam("l");
        if (player.hasPermission("merania.rank.creator"))
            return board2.getTeam("m");
        if (player.hasPermission("merania.rank.friend"))
            return board2.getTeam("n");
        if (player.hasPermission("merania.rank.booster"))
            return board2.getTeam("o");
        if (player.hasPermission("merania.rank.eternal"))
            return board2.getTeam("p");
        if (player.hasPermission("merania.rank.savage"))
            return board2.getTeam("q");
        if (player.hasPermission("merania.rank.legend"))
            return board2.getTeam("r");
        if (player.hasPermission("merania.rank.ultra"))
            return board2.getTeam("s");
        if (player.hasPermission("merania.rank.beta"))
            return board2.getTeam("t");
        return board2.getTeam("y");
    }

    public void setScore(String scoreName, int i) {
        this.objective.getScore(scoreName).setScore(i);
    }

    public void setTeam(String teamName) {
        this.scoreboard.registerNewTeam(teamName);
    }

    public Team getTeam(String teamName) {
        if (this.scoreboard.getTeam(teamName) != null)
            return this.scoreboard.getTeam(teamName);
        setTeam(teamName);
        return this.scoreboard.getTeam(teamName);
    }

    public Objective getObjective() {
        return this.objective;
    }

    public Player getPlayer() {
        return this.player;
    }

    public Scoreboard getScoreboard() {
        return this.scoreboard;
    }
}
