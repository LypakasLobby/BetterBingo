package com.lypaka.betterbingo.API;

import com.lypaka.betterbingo.BingoBoard.GameBoards.GameBoard;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraftforge.eventbus.api.Event;

public class BingoCompleteEvent extends Event {

    private final ServerPlayerEntity player;
    private final GameBoard gameBoard;

    public BingoCompleteEvent (ServerPlayerEntity player, GameBoard gameBoard) {

        this.player = player;
        this.gameBoard = gameBoard;

    }

    public ServerPlayerEntity getPlayer() {

        return this.player;

    }

    public GameBoard getGameBoard() {

        return this.gameBoard;

    }

}
