package com.scaler.bookmyshowjan23.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "show_seat_mapping") // Table name should be show_seat_mapping
/*
id | show_id | seat_id | status_id
1      123      A24        1


status_id
1 ---> Booked
 */

public class ShowSeat extends BaseModel {
    @ManyToOne
    private Show show;

    @ManyToOne
    private Seat seat;

    @Enumerated(EnumType.ORDINAL)
    private ShowSeatState state;
}
/*
For all the ENUM association there is some issue.

 */
