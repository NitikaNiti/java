package com.niti.Transcations.Dto;

import com.niti.Transcations.Entity.PassengerInfo;
import com.niti.Transcations.Entity.PaymentInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingRequest {

	private PassengerInfo passengerInfo;
	
	private PaymentInfo paymentInfo;
}
