package com.springweb.firstwebapp.LooseCoupling;

import org.springframework.stereotype.Component;

@Component
public class Conductor {

    private int ticketPrice;




    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
}
