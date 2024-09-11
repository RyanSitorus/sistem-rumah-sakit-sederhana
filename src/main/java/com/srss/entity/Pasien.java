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

@AllArgsConstructor
@Entity
@Table(name = "pasien")
public class Pasien {

	@Id
	@Column(name = "id_pasien", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPasien;

	@Column(name = "nomor_pasien", nullable = false)
	private String nomorPasien;

	@Column(name = "nama_pasien", nullable = false)
	private String namaPasien;

	@Column(name = "nomor_hp")
	private int nomorHp;

	@Column(name = "tanggal_lahir")
	@Temporal(TemporalType.DATE)
	private Date tanggalLahir;

	@Column(name = "jenis_kelamin")
	private String jenisKelamin;

	@Column(name = "kategori")
	private String kategori;

	@Column(name = "alamat")
	private String alamat;

	public Pasien() {
	}

	public Long getIdPasien() {
		return idPasien;
	}

	public void setIdPasien(Long idPasien) {
		this.idPasien = idPasien;
	}

	public String getNomorPasien() {
		return nomorPasien;
	}

	public void setNomorPasien(String nomorPasien) {
		this.nomorPasien = nomorPasien;
	}

	public String getNamaPasien() {
		return namaPasien;
	}

	public void setNamaPasien(String namaPasien) {
		this.namaPasien = namaPasien;
	}

	public int getNomorHp() {
		return nomorHp;
	}

	public void setNomorHp(int nomorHp) {
		this.nomorHp = nomorHp;
	}

	public String getJenisKelamin() {
		return jenisKelamin;
	}

	public void setJenisKelamin(String jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}

	public String getKategori() {
		return kategori;
	}

	public void setKategori(String kategori) {
		this.kategori = kategori;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public Date getTanggalLahir() {
		return tanggalLahir;
	}

	public void setTanggalLahir(Date tanggalLahir) {
		this.tanggalLahir = tanggalLahir;
	}

}
