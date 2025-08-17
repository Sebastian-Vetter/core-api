package de.aptcode.coreapi.colors.manager;

import de.aptcode.coreapi.colors.ChatColor;
import de.aptcode.coreapi.colors.Rainbow;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.format.TextColor;


import java.util.ArrayList;

public class HexCodeManager {

    public static String createGradientFromString(String message, String[] colours) {

        int count = message.length();
        if (Math.min(count, colours.length) < 2) {
            return message;
        }

        ArrayList<String> cols = createGradient(count, colours);

        String colourCodes = "";
        for (int i = 0; i < cols.size(); i++) {
            colourCodes += ChatColor.of(cols.get(i)) + "" + message.charAt(i);
        }
        return colourCodes;
    }

    public static ArrayList<String> createGradient(int count, String[] colours) {
        Rainbow rainbow = new Rainbow();

        try {
            rainbow.setNumberRange(1, count);
            rainbow.setSpectrum(colours);
        } catch (Exception e) {
            e.printStackTrace();
        }

        ArrayList<String> hexCodes = new ArrayList<String>();
        for (int i = 1; i <= count; i++) {
            hexCodes.add("#" + rainbow.colourAt(i));
        }
        return hexCodes;
    }

    public static Component createGradientComponent(String startColorHex, String endColorHex, String text) {
        TextComponent.Builder builder = Component.text();

        for (int i = 0; i < text.length(); i++) {
            double ratio = (double) i / (double) (text.length() - 1);
            String colorHexString = interpolateColor(startColorHex, endColorHex, ratio);
            builder.append(Component.text(text.substring(i, i + 1)).color(TextColor.fromHexString(colorHexString)));
        }

        return builder.build();
    }

    private static String interpolateColor(String startColorHex, String endColorHex, double ratio) {
        int startRed = Integer.parseInt(startColorHex.substring(1, 3), 16);
        int startGreen = Integer.parseInt(startColorHex.substring(3, 5), 16);
        int startBlue = Integer.parseInt(startColorHex.substring(5, 7), 16);

        int endRed = Integer.parseInt(endColorHex.substring(1, 3), 16);
        int endGreen = Integer.parseInt(endColorHex.substring(3, 5), 16);
        int endBlue = Integer.parseInt(endColorHex.substring(5, 7), 16);

        int interpolatedRed = (int) (startRed + ratio * (endRed - startRed));
        int interpolatedGreen = (int) (startGreen + ratio * (endGreen - startGreen));
        int interpolatedBlue = (int) (startBlue + ratio * (endBlue - startBlue));

        return String.format("#%02X%02X%02X", interpolatedRed, interpolatedGreen, interpolatedBlue);
    }


}
