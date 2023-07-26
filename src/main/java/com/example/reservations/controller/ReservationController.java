package com.example.reservations.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.reservations.model.Reservation;
import com.example.reservations.service.IReservationService;

@RestController
public class ReservationController {

	@Autowired
	private IReservationService service;
	
	@GetMapping("reservations")
	public List<Reservation> search(){
		return (List<Reservation>) service.search();
	}
}
