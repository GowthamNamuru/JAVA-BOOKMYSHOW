package com.scaler.bookmyshowjan23.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Show extends BaseModel {
    @ManyToOne
    private Movie movie;
    private Date startTime;
    private Date endTime;

    @ManyToOne
    private Auditorium auditorium;

    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Feature> showFeatures;
}
