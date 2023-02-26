package com.iktpreobuka.myFirstProjectTest.contollers;

import java.util.Arrays;
import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstoController {
	
	// PRVI KONTROLER
	@RequestMapping("/hello")
	public String hello() {
		return "Pozdrav Pozdrav!";
	}
	
	// 2.1 endpoint koji vraća „Hello yourName!“
	@RequestMapping("/greetings")
	public String greetings() {
		return "Hello, Marija!";
	}
	
	// 2.2 endpoint koji vraća trenutni datum i vreme
	@RequestMapping("/getDate")
	public Date getDate() {
		Date date = new Date();
		return date;
	}
	
	// 2.3 endpoint koji drugi vraća listu koja sadrži imena članova vaše porodice
//	@RequestMapping("/family")
//	public String family() {
//		return "Hello, Marija!";
//	}
	
	// 2.4 endpoint koji vraća html stranicu sa imenima svih polaznika u grupi
	// sa naslovom Moja grupa
	// imena su prikazana u okviru tabele
	// myClass
	
	// 3.1 endpoint koji vraća niz celobrojnih vrednosti
	// putanja /array
	@RequestMapping("/niz")
	public int[] niz1() {
		int[] niz1= {5, 4, 7, 44, 21, 13};
		return niz1;
	}
	
	
	// 3.2 endpoint koji vraća sortiran niz celobrojnih vrednosti
	// putanja /sortarray
	@RequestMapping("/sortNiz")
	public int[] sortNiz() {
		int[] niz2= {5, 4, 7, 44, 21, 13};
		Arrays.sort(niz2);
		return niz2;
	}
	
	// 3.3 endpoint koji vraća minimalnu i maksimalnu vrednost iz niza celobrojnih vrednosti
	// putanja /minmax
	
	// 3.4 endpoint koji vraća sumu prvih n brojeva
	// putanja /sumaNiza
	
	// 3.5 endpoint koji predstavlja englesko-srpski rečnik i koji za reč na srpskom vrati odgovarajući prevod na engleski jezik
	// putanja /recnik
	// DODATNO: ukoliko za traženu reč ne postoji prevod, tada ispisati „Tražena_rec ne postoji u recniku.“



}
