package com.lypaka.betterbingo.API;

import com.lypaka.betterbingo.BingoBoard.GameBoards.GameBoard;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraftforge.eventbus.api.Cancelable;
import net.minecraftforge.eventbus.api.Event;

/**
 * Called when the player pushes the reroll button
 * This is run before checks for cost and cooldown
 * Cancelling the event cancels the reroll, and won't check cost or cooldown
 */
@Cancelable
public class BingoRerollEvent extends Event {

    private final ServerPlayerEntity player;
    private final GameBoard currentBoard;
    private boolean bypassCost;
    private boolean bypassCooldown;

    public BingoRerollEvent (ServerPlayerEntity player, GameBoard gameBoard, boolean bypassCost, boolean bypassCooldown) {

        this.player = player;
        this.currentBoard = gameBoard;
        this.bypassCost = bypassCost;
        this.bypassCooldown = bypassCooldown;

    }

    public ServerPlayerEntity getPlayer() {

        return this.player;

    }

    public GameBoard getCurrentBoard() {

        return currentBoard;

    }

    public boolean doesBypassCost() {

        return this.bypassCost;

    }

    public void setBypassCost (boolean bypass) {

        this.bypassCost = bypass;

    }

    public boolean doesBypassCooldown() {

        return this.bypassCooldown;

    }

    public void setBypassCooldown (boolean bypass) {

        this.bypassCooldown = bypass;

    }

}
