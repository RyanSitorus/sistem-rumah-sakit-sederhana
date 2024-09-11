package com.srss.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.srss.entity.Ruangan;
import com.srss.repository.RoomRepository;

public class RoomServiceImpl implements RoomService {

	@Autowired
	private RoomRepository roomRepository;

	@Override
	public List<Ruangan> getAllRoom() {
		return roomRepository.findAll();
	}

	@Override
	public Ruangan saveRoom(Ruangan ruangan) {
		return roomRepository.save(ruangan);
	}

	@Override
	public Ruangan getRoomById(Long id) {
		return roomRepository.findById(id).get();
	}

	@Override
	public Ruangan updateRoom(Ruangan ruangan) {
		return roomRepository.save(ruangan);
	}

	@Override
	public void deleteRoomById(Long id) {
		roomRepository.deleteById(id);
	}

}
