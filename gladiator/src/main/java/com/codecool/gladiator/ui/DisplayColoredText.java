package com.codecool.gladiator.ui;

public class DisplayColoredText {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_WHITE = "\u001B[37m";


    public void displayBlueText(String message) {
        System.out.println(ANSI_BLUE + message + ANSI_RESET);
    }

    public void displayGreenText(String message) {
        System.out.println(ANSI_GREEN + message + ANSI_RESET);
    }

    public void displayYellowText(String message) {
        System.out.println(ANSI_YELLOW + message + ANSI_RESET);
    }

    public void displayWhiteText(String message) {
        System.out.println(ANSI_WHITE + message + ANSI_RESET);
    }

    public void displayImage() {
        System.out.println(ANSI_WHITE + "⠀⠀⠀⠀⠀⢀⣀⢠⣴⣶⣶⣶⣆⣤⣄⣀⠀⠀ ⠀⠀⣀⣄⣤⣆⣶⣶⣶⣴⢠⣀⢀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⢀⣤⣾⣿⣿⣾⣿⣿⣿⣿⣿⣿⣿⣿⡿⠆ ⠆⡿⣿⣿⣿⣿⣿⣿⣿⣿⣾⣿⣿⣾⣤⢀⠀⠀\n" +
                "⠀⢀⣺⣿⣿⣿⠿⣛⣭⣥⣴⣤⣬⣍⠛⠉⠀⠀ ⠀⠀⠉⠛⣍⣬⣤⣴⣥⣭⣛⠿⣿⣿⣿⣺⢀⠀\n" +
                "⢀⣿⣿⣿⡿⡡⣚⣭⣵⣶⣦⣭⣙⠃⠀⠀⠀⠀ ⠀⠀⠀⠀⠃⣙⣭⣦⣶⣵⣭⣚⡡⡿⣿⣿⣿⢀\n" +
                "⢸⣿⣿⣿⢁⣾⣿⠿⢛⣋⣉⣉⣉⣓⣠⠀⠀⠀ ⠀⠀⠀⣠⣓⣉⣉⣉⣋⢛⠿⣿⣾⢁⣿⣿⣿⢸\n" +
                "⢸⣿⣿⡏⢸⣿⢇⣾⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀ ⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣾⢇⣿⢸⡏⣿⣿⢸\n" +
                "⢸⣿⡿⠁⣸⣿⡸⣿⣿⣿⡉⠀⠉⢻⣿⠀⠀⠀ ⠀⠀ ⣿⢻⠉⠀⡉⣿⣿⣿⡸⣿⣸⠁⡿⣿⢸\n" +
                "⠚⠋⠀⠀⣿⣿⣿⣮⢻⣿⣿⣷⣆⠀⣿⠀⠀⠀ ⠀⠀ ⠀⣿⠀⣆⣷⣿⣿⢻⣮⣿⣿⣿⠀⠀⠋⠚\n" +
                "⠀⠀⠀⢀⣿⣿⣿⣿⡇⢿⣿⣿⣿⡄⠉⠀⠀⠀ ⠀ ⠀⠀⠉⡄⣿⣿⣿⢿⡇⣿⣿⣿⣿⢀⠀⠀⠀\n" +
                "⠀⠀⠀⠉⠛⠛⠛⠋⠁⢸⣿⣿⣿⣿⣄⠀⠀⠀ ⠀⠀⠀⣄⣿⣿⣿⣿⢸⠁⠋⠛⠛⠛⠉⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠛⠿⠿⠿⠛⠁       ⠁⠛⠿⠿⠿⠛⠘⠀⠀⠀⠀⠀⠀⠀⠀⠀");
    }


}
