package com.sweep.bot.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Stacks {

    private List<String> nine;

    private List<String> ten;

    private List<String> jack;

    private List<String> queen;

    private List<String> king;

}
