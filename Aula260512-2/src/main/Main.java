package main;


public class Main {
public static void main(String[] args) {
	String um = "charAt";
	String dois = "startsWith";
	String tres = "endsWith";
	String quatro = "indexOf";
	String cinco = "lastIndexOf---lastIndexOf";
	String seis = "length";
	String sete = "substring";
	String oito = "Sp:li:t";
	String nove = "toLowerCase";
	String dez = "toUpperCase";
	String onze = "    trim";
	String doze = "valueOf";
	
	System.out.println("A letra da posi��o '0' da palavra " + um + " �: {"+um.charAt(0) + "}");
	System.out.println("\n____________\n");

	if (dois.startsWith("star")) {
		System.out.println("A String '"+dois+"' cont�m o prefixo 'star'");
	}
	System.out.println("\n____________\n");
	
	if (tres.endsWith("th")){
		System.out.println("A String '"+tres+"' cont�m o sufixo 'th'");
	}
	System.out.println("\n____________\n");
	
	System.out.println("A posi��o que a letra 'e' aparece, pela primeira vez, na palavra '" + quatro + "' �: {" + quatro.indexOf("e") + "}");
	
	System.out.println("\n____________\n");
	
	System.out.println("A posi��o que a letra 'd' aparece, pela ultima vez, na palavra '" + cinco + "' �: {" + cinco.lastIndexOf("d") + "}");
	
	System.out.println("\n____________\n");
	
	System.out.println("A quantidade de caracteres que a palavra '" + seis + "' tem �: {" + seis.length() + "}");
	
	System.out.println("\n____________\n");
	
	System.out.println("A String '" + sete + "' cont�m, apartir da 2 posi��o, os caracteres:  {" + sete.substring(2) + "} \n");
	
	System.out.println("A String '" + sete + "' cont�m, apartir da 2� posi��o  at� a 5�, os caracteres:  {" + sete.substring(2, 5) + "}");
	
	System.out.println("\n____________\n");
	
	// Split 
	String [] split = oito.split(":");
	System.out.println("String '" + oito + "' quebrada: {" + split[0] + "}");
	System.out.println("String '" + oito + "' quebrada: {" + split[1] + "}");
	System.out.println("String '" + oito + "' quebrada: {" + split[2] + "}");

	System.out.println("\n____________\n");
	
	System.out.println("A String '" + nove + "' com todos os caracteres MINUSCULOS fica: {" + nove.toLowerCase() + "}");
	
	System.out.println("\n____________\n");
	
	System.out.println("A String '" + dez + "' com todos os caracteres MAIUSCULOS fica: {" + dez.toUpperCase() + "}");
	
	System.out.println("\n____________\n");
	
	System.out.println("A String '" + onze + "' sem espa�os no come�o fica:  {"  +onze.trim() + "}");
	
	System.out.println("\n____________\n");

	double d = 10.5;
	doze = String.valueOf(d);
	System.out.println("A string 'valueOf' recebeu o valor 10.5 do tipo double e converteu para uma String, resultado: {" + doze + "}");
	
	}
}
