package com.lypaka.betterbingo.API;

import com.lypaka.betterbingo.BingoBoard.GameBoards.GameBoard;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraftforge.eventbus.api.Event;

public class BingoFinishedRowEvent extends Event {

    private final ServerPlayerEntity player;
    private final GameBoard gameBoard;
    private final String type;

    public BingoFinishedRowEvent (ServerPlayerEntity player, GameBoard gameBoard, String type) {

        this.player = player;
        this.gameBoard = gameBoard;
        this.type = type;

    }

    public ServerPlayerEntity getPlayer() {

        return this.player;

    }

    public GameBoard getGameBoard() {

        return this.gameBoard;

    }

    public String getType() {

        return this.type;

    }

    public boolean isHorizontal() {

        return this.type.equalsIgnoreCase("horizontal");

    }

    public boolean isVertical() {

        return this.type.equalsIgnoreCase("vertical");

    }

    public boolean isDiagonal() {

        return this.type.equalsIgnoreCase("diagonal");

    }

}
