package com.lypaka.betterbingo.BingoBoard.GameBoards;

import com.lypaka.betterbingo.BingoBoard.Rewards.BingoReward;

import java.util.List;

public abstract class GameBoard {

    private final List<Integer> slots;
    private final List<String> blacklist;
    private final boolean canBeShiny;
    private final BingoReward bingoReward;

    public GameBoard (List<Integer> slots, List<String> blacklist, boolean canBeShiny, BingoReward bingoReward) {

        this.slots = slots;
        this.blacklist = blacklist;
        this.canBeShiny = canBeShiny;
        this.bingoReward = bingoReward;

    }

    public List<Integer> getSlots() {

        return this.slots;

    }

    public List<String> getBlacklist() {

        return this.blacklist;

    }

    public boolean canBeShiny() {

        return this.canBeShiny;

    }

    public BingoReward getBingoReward() {

        return this.bingoReward;

    }

}
