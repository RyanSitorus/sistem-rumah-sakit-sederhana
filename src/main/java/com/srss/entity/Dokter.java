package com.srss.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "dokter")
public class Dokter {

	@Id
	@Column(name = "id_dokter", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDokter;

	@Column(name = "nomor_dokter", nullable = false)
	private String nomorDokter;

	@Column(name = "nama_dokter", nullable = false)
	private String namaDokter;

	@Column(name = "nomor_hp")
	private int nomorHp;

	@Column(name = "tanggal_lahir")
	private String tanggalLahir;

	@Column(name = "jenis_kelamin")
	private String jenisKelamin;

	@Column(name = "spesialis")
	private String spesialis;

	@Column(name = "alamat")
	private String alamat;

	public Long getIdDokter() {
		return idDokter;
	}

	public void setIdDokter(Long idDokter) {
		this.idDokter = idDokter;
	}

	public String getNomorDokter() {
		return nomorDokter;
	}

	public void setNomorDokter(String nomorDokter) {
		this.nomorDokter = nomorDokter;
	}

	public String getNamaDokter() {
		return namaDokter;
	}

	public void setNamaDokter(String namaDokter) {
		this.namaDokter = namaDokter;
	}

	public int getNomorHp() {
		return nomorHp;
	}

	public void setNomorHp(int nomorHp) {
		this.nomorHp = nomorHp;
	}

	public String getTanggalLahir() {
		return tanggalLahir;
	}

	public void setTanggalLahir(String tanggalLahir) {
		this.tanggalLahir = tanggalLahir;
	}

	public String getJenisKelamin() {
		return jenisKelamin;
	}

	public void setJenisKelamin(String jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}

	public String getSpesialis() {
		return spesialis;
	}

	public void setSpesialis(String spesialis) {
		this.spesialis = spesialis;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

}
