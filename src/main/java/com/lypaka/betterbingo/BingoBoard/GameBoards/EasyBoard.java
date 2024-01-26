package com.lypaka.betterbingo.BingoBoard.GameBoards;

import com.lypaka.betterbingo.BingoBoard.Rewards.BingoReward;

import java.util.List;

public class EasyBoard extends GameBoard {

    public EasyBoard (List<Integer> slots, List<String> blacklist, boolean canBeShiny, BingoReward reward) {

        super(slots, blacklist, canBeShiny, reward);

    }

}
