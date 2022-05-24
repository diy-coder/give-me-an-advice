package com.diycoder.smallaps.givemeanadvice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Conselho extends BaseEntity {
    private String nome;
    private String descricao;
}
