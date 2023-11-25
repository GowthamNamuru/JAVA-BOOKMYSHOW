package main.models;

import java.util.Date;
import java.util.List;

public class Ticket extends BaseModel {
    private User bookedBy;

    private Show show;

    private List<ShowSeat> showSeats;

    private TicketStatus ticketStatus;
    private Date timeOfBooking;

    private List<Payment> payments;

}
