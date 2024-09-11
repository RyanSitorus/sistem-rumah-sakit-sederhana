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
@Table(name = "rawatJalan")
public class RawatJalan {

	@Id
	@Column(name = "id_rawat_jalan", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRawatJalan;

	@Column(name = "nomor_rawat_jalan", nullable = false)
	private String nomorRawatJalan;

	@Column(name = "tanggal_rawat_jalan")
	@Temporal(TemporalType.DATE)
	private Date tanggalRawatJalan;
	
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
