package com.iktpreobuka.myFirstProjectTest.contollers;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstController {

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

	// simple date format
	@RequestMapping("/getSimpleDate")
	public String SimpleDate() {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String strDate = formatter.format(date);
		System.out.println(strDate);
		return strDate;
	}

	// localDate
	@RequestMapping("/getLocalDate")
	public LocalDateTime Datum() {
		return LocalDateTime.now();
	}

	// 2.3 endpoint koji drugi vraća listu koja sadrži imena članova vaše porodice
	@RequestMapping("/family")
	public String[] Family() {
		String[] porodica = new String[] { "MS", "PDJ", "MS", "VS" };
		return porodica;
	}

	// listFamily
	@RequestMapping("/listFamily")
	public List<String> listFamily() {
		List<String> myFamily = new ArrayList<String>();
		myFamily.add("МС");
		myFamily.add("ПЂ");
		myFamily.add("МС");
		myFamily.add("ВС");

		return myFamily;
	}

	// 2.4 endpoint koji vraća html stranicu sa imenima svih polaznika u grupi
	// sa naslovom Moja grupa
	// imena su prikazana u okviru tabele
	// myClass
	@RequestMapping(value = "/myClass", produces = MediaType.TEXT_HTML_VALUE)
	public String myClass() {
		return "<html>\n" 
				+ "<header><title> Welcome </title></header>\n" 
				+ "<body>\n" 
				+ "<table> "
				+ "<tr> <th> Ime </th> <th> Prezime </th></tr>" 
				+ "<tr><td> М </td> <td> С </td></tr><tr>"
				+ "<tr><td> Д </td> <td> Б </td> </tr> <tr>" 
				+ "<tr><td> Љ </td> <td> Ћ </td> </tr> <tr>"
				+ "<tr><td> А </td> <td> М </td> </tr> " 
				+ "</table>" 
				+ "</body>\n" 
				+ "</html>";
	}

	// 3.1 endpoint koji vraća niz celobrojnih vrednosti
	// putanja /array
	@RequestMapping("/niz")
	public int[] niz1() {
		int[] niz1 = { 5, 4, 7, 44, 21, 13 };
		return niz1;
	}

	// 3.2 endpoint koji vraća sortiran niz celobrojnih vrednosti
	// putanja /sortarray
	@RequestMapping("/sortNiz")
	public int[] sortNiz() {
		int[] niz2 = { 5, 4, 7, 44, 21, 13 };
		Arrays.sort(niz2);
		return niz2;
	}

	// 3.3 endpoint koji vraća minimalnu i maksimalnu vrednost iz niza celobrojnih vrednosti
	// putanja /minmax

	// 3.4 endpoint koji vraća sumu prvih n brojeva
	// putanja /sumaNiza

	// 3.5 endpoint koji predstavlja englesko-srpski rečnik 
	// i koji za reč na srpskom vrati odgovarajući prevod na engleski jezik
	// putanja /recnik
	// DODATNO: ukoliko za traženu reč ne postoji prevod, 
	// ispisati „tražena_rec ne postoji u recniku.“
	@RequestMapping("/recnik")
	public Map<String, String> getDict() {
		Map<String, String> dict = new HashMap();
		dict.put("alas", "авај");
		dict.put("bubble", "мехур");
		dict.put("cat", "мачка");
		dict.put("danger", "опасност");
		dict.put("effervescence", "живахност");
		dict.put("evanescence", "ишчезавање");
		return dict;
	}

}
