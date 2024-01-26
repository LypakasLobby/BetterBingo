package com.lypaka.betterbingo.BingoBoard.Rewards;

import java.util.List;

public class CommandReward {

    private final double chance;
    private final String displayText;
    private final List<String> commands;

    public CommandReward (double chance, String displayText, List<String> commands) {

        this.chance = chance;
        this.displayText = displayText;
        this.commands = commands;

    }

    public double getChance() {

        return this.chance;

    }

    public String getDisplayText() {

        return this.displayText;

    }

    public List<String> getCommands() {

        return this.commands;

    }

}
