package com.scaler.bookmyshowjan23.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Movie extends BaseModel {
    private String name;

    @ManyToMany
    private List<Actor> actors;

    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Feature> movieFeatures;

    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Genre> genre;


}
