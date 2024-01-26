package com.lypaka.betterbingo.BingoBoard.GameBoards;

import com.lypaka.betterbingo.BingoBoard.Rewards.BingoReward;

import java.util.List;

public class SpecialBoard extends GameBoard {

    private final String difficulty;

    public SpecialBoard (List<Integer> slots, List<String> blacklist, boolean canBeShiny, BingoReward bingoReward, String difficulty) {

        super(slots, blacklist, canBeShiny, bingoReward);
        this.difficulty = difficulty;

    }

    public String getDifficulty() {

        return this.difficulty;

    }

}
