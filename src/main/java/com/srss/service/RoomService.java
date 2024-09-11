package com.srss.service;

import java.util.List;

import com.srss.entity.Ruangan;

public interface RoomService {
	List<Ruangan> getAllRoom();

	Ruangan saveRoom(Ruangan ruangan);

	Ruangan getRoomById(Long id);

	Ruangan updateRoom(Ruangan ruangan);

	void deleteRoomById(Long id);
}
