package com.srss.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "dokter")
@AllArgsConstructor
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
	@Temporal(TemporalType.DATE)
	private Date tanggalLahir;

	@Column(name = "jenis_kelamin")
	private String jenisKelamin;

	@Column(name = "spesialis")
	private String spesialis;

	@Column(name = "alamat")
	private String alamat;

	public Dokter() {
	}

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

	public Date getTanggalLahir() {
		return tanggalLahir;
	}

	public void setTanggalLahir(Date tanggalLahir) {
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
