package com.niti.Transcations.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.niti.Transcations.Entity.PaymentInfo;

public interface PaymentInfoRepository extends JpaRepository<PaymentInfo,String> {

}
