package com.sweep.bot.model.request;

import com.sweep.bot.model.constants.PlayerState;
import com.sweep.bot.model.entity.BoardStatus;
import com.sweep.bot.model.entity.PlayerInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InvokeBidRequest {

    private String id;

    private PlayerState state;

    private List<PlayerInfo> players;

    private BoardStatus board;

    private Integer turn;
}
