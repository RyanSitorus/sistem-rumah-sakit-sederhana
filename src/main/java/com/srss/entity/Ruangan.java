package com.srss.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Entity
@Table(name = "ruangan")
public class Ruangan {

	@Id
	@Column(name = "id_ruangan", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRuangan;

	@Column(name = "kode_ruangan", nullable = false)
	private String kodeRuangan;

	@Column(name = "nama_kamar", nullable = false)
	private String namaKamar;

	@Column(name = "jumlah_tempat_tidur")
	private int jumlahTempatTidur;

	@Column(name = "keterangan")
	private String keterangan;

	public Long getIdRuangan() {
		return idRuangan;
	}

	public void setIdRuangan(Long idRuangan) {
		this.idRuangan = idRuangan;
	}

	public String getKodeRuangan() {
		return kodeRuangan;
	}

	public void setKodeRuangan(String kodeRuangan) {
		this.kodeRuangan = kodeRuangan;
	}

	public String getNamaKamar() {
		return namaKamar;
	}

	public void setNamaKamar(String namaKamar) {
		this.namaKamar = namaKamar;
	}

	public int getJumlahTempatTidur() {
		return jumlahTempatTidur;
	}

	public void setJumlahTempatTidur(int jumlahTempatTidur) {
		this.jumlahTempatTidur = jumlahTempatTidur;
	}

	public String getKeterangan() {
		return keterangan;
	}

	public void setKeterangan(String keterangan) {
		this.keterangan = keterangan;
	}

}
