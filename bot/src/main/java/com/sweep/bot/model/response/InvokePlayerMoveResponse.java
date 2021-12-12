package com.sweep.bot.model.response;

import com.sweep.bot.model.entity.Add;
import com.sweep.bot.model.entity.Pick;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InvokePlayerMoveResponse {

    private String card;

    private Pick pick;

    private Add add;

}
