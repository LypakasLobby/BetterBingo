package com.lypaka.betterbingo.BingoBoard.Rewards;

import java.util.Map;

public class BingoReward {

    private final int rewardAmount;
    private final Map<String, Map<String, CommandReward>> boardCommandsMap;
    private final Map<String, Map<String, String>> boardItemsMap;
    private final Map<String, Map<String, CommandReward>> rowCommandsMap;
    private final Map<String, Map<String, String>> rowItemsMap;

    public BingoReward (int rewardAmount, Map<String, Map<String, CommandReward>> boardCommandsMap, Map<String, Map<String, String>> boardItemsMap,
                        Map<String, Map<String, CommandReward>> rowCommandsMap, Map<String, Map<String, String>> rowItemsMap) {

        this.rewardAmount = rewardAmount;
        this.boardCommandsMap = boardCommandsMap;
        this.boardItemsMap = boardItemsMap;
        this.rowCommandsMap = rowCommandsMap;
        this.rowItemsMap = rowItemsMap;

    }

    public int getRewardAmount() {

        return this.rewardAmount;

    }

    public Map<String, Map<String, CommandReward>> getBoardCommandsMap() {

        return this.boardCommandsMap;

    }

    public Map<String, Map<String, String>> getBoardItemsMap() {

        return this.boardItemsMap;

    }

    public Map<String, Map<String, CommandReward>> getRowCommandsMap() {

        return this.rowCommandsMap;

    }

    public Map<String, Map<String, String>> getRowItemsMap() {

        return this.rowItemsMap;

    }

}
