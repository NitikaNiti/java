package com.niti.Transcations.service;

import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niti.Transcations.Dto.FlightBookingAcknowledgement;
import com.niti.Transcations.Dto.FlightBookingRequest;
import com.niti.Transcations.Entity.PassengerInfo;
import com.niti.Transcations.Entity.PaymentInfo;
import com.niti.Transcations.Repository.PassengerInfoRepository;
import com.niti.Transcations.Repository.PaymentInfoRepository;
import com.niti.Transcations.Utils.PaymentUtils;

@Service
public class FlightBookingService {

	@Autowired
	private PassengerInfoRepository passengerInfoRepository;
	@Autowired
	private PaymentInfoRepository paymentInfoRepository;

	@Transactional
	public FlightBookingAcknowledgement bookFlightTicket(FlightBookingRequest request) {

		FlightBookingAcknowledgement ack = null;

		PassengerInfo PassengerInfo = request.getPassengerInfo();
		passengerInfoRepository.save(PassengerInfo);

		PaymentInfo paymentInfo = request.getPaymentInfo();
		// paymentInfoRepository.save(paymentInfo);

		PaymentUtils.validateCreditLimit(paymentInfo.getAccountNo(), PassengerInfo.getFare());
		paymentInfo.setPassengerId(PassengerInfo.getpId());
		paymentInfo.setAmount(PassengerInfo.getFare());
		paymentInfoRepository.save(paymentInfo);

		return new FlightBookingAcknowledgement("SUCCESS", PassengerInfo.getFare(),
				UUID.randomUUID().toString().split("-")[0], PassengerInfo);

	}
}
