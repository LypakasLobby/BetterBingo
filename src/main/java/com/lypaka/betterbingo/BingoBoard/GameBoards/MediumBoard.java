package com.lypaka.betterbingo.BingoBoard.GameBoards;

import com.lypaka.betterbingo.BingoBoard.Rewards.BingoReward;

import java.util.List;

public class MediumBoard extends GameBoard {

    public MediumBoard (List<Integer> slots, List<String> blacklist, boolean canBeShiny, BingoReward bingoReward) {

        super(slots, blacklist, canBeShiny, bingoReward);

    }

}
