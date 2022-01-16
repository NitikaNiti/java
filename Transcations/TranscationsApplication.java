package com.niti.Transcations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.niti.Transcations.Dto.FlightBookingAcknowledgement;
import com.niti.Transcations.Dto.FlightBookingRequest;

@SpringBootApplication
@RestController	
@EnableTransactionManagement
public class TranscationsApplication {

	@Autowired
	private com.niti.Transcations.service.FlightBookingService FlightBookingService;
	
	
	@PostMapping("/bookFlightTicket")
	public FlightBookingAcknowledgement bookFlightTicket(@RequestBody FlightBookingRequest request){
		return FlightBookingService.bookFlightTicket(request);
		
		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(TranscationsApplication.class, args);
	}

}
