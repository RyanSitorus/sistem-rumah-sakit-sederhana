package com.srss.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Entity
@Table(name = "rawatInap")
public class RawatInap {

	@Id
	@Column(name = "id_rawat_inap", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRawatInap;

	@Column(name = "nomor_rawat_inap", nullable = false)
	private String nomorRawatInap;

	@Column(name = "tanggal_rawat_inap")
	@Temporal(TemporalType.DATE)
	private Date tanggalRawatInap;
	
	@OneToOne
	@JoinColumn(name = "pasien_id" , nullable = false)
	private Pasien pasien;
	
	@OneToOne
	@JoinColumn(name = "dokter_id" , nullable = false)
	private Dokter dokter;

	@Column(name = "diagnosa")
	private String diagnosa;

	@Column(name = "keterangan")
	private String keterangan;

}
