	package com.srss;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.expression.ParseException;

import com.srss.controller.PatientController;
import com.srss.entity.Dokter;
import com.srss.entity.Pasien;
import com.srss.repository.DoctorRepository;
import com.srss.repository.PatientRepository;
import com.srss.service.DoctorService;
import com.srss.service.DoctorServiceImpl;
import com.srss.service.PatientService;
import com.srss.service.PatientServiceImpl;

@SpringBootApplication
public class SistemRumahSakitSederhanaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SistemRumahSakitSederhanaApplication.class, args);
	}

	@Autowired
	private  PatientService patientService;

	@Autowired
	private DoctorService doctorService;

	// uncomment method run untuk menambahkan data dummy pertama
	@Override
	public void run(String... args) throws Exception {
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//		Date tanggalLahirPasien = null;
//		Date tanggalLahirDokter = null;
//		try {
//			tanggalLahirPasien = dateFormat.parse("1990-01-01"); // Example birth date
//			tanggalLahirDokter = dateFormat.parse("1985-05-15"); // Example birth date
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
//		Pasien pasien = new Pasien(1L, "P123456", "John Doe", 123456789, tanggalLahirPasien, "Laki-laki", "Umum","Jl. Contoh No. 123, Jakarta");
//		Dokter dokter = new Dokter(1L, "D123456", "Dr. Jane Smith", 987654321, tanggalLahirDokter, "Perempuan","Kardiologi", "Jl. Spesialis No. 456, Jakarta");
//
//		System.out.println("tess " + pasien.getNamaPasien());
//		patientService.savePatient(pasien);
//		doctorService.saveDoctor(dokter);

//		System.out.println("ID Pasien: " + pasien.getIdPasien());
//		System.out.println("Nomor Pasien: " + pasien.getNomorPasien());
//		System.out.println("Nama Pasien: " + pasien.getNamaPasien());
//		System.out.println("Nomor HP: " + pasien.getNomorHp());
//		System.out.println("Tanggal Lahir: " + pasien.getTanggalLahir());
//		System.out.println("Jenis Kelamin: " + pasien.getJenisKelamin());
//		System.out.println("Kategori: " + pasien.getKategori());
//		System.out.println("Alamat: " + pasien.getAlamat());

	}

}
