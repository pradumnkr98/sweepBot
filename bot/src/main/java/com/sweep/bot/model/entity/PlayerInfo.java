package com.sweep.bot.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlayerInfo {

    private String id;

    private String name;

    private Integer position;

    private Integer team;

    private BigInteger sweeps;
}
