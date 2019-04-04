package romannumberconverter;
import static java.lang.System.out;


public class RomanNumberConverter {

  public int convert(String romanNumber){
    int resultat = 0;

    for(int i =0; i<=romanNumber.length(); i++){
      switch(romanNumber.charAt(i)){
        case 'M': resultat += 1000; break;
        case 'D': resultat += 500; break;
        case 'C': resultat += 100; break;
        case 'L': resultat += 50; break;
        case 'X': resultat += 10; break;
        case 'V': resultat += 5; break;
        case 'I': resultat += 1; break;
      }
    }
    return resultat;
  }
  public String convert(int number){
    StringBuffer resultat = new StringBuffer();
    while(number/1000 >= 1){
        resultat.append('M');
        number-=1000;
    }
    while(number/500 >= 1){
        resultat.append('D');
        number-=500;
    }
    while(number/100 >= 1){
        resultat.append('C');
        number-=100;
    }
    while(number/50 >= 1){
        resultat.append('L');
        number-=50;
    }
    while(number/10 >= 1){
        resultat.append('X');
        number-=10;
    }
    while(number/5 >= 1){
        resultat.append('X');
        number-=5;
    }
    while(number >= 1){
        resultat.append('I');
        number-=1;
    }
    return resultat.toString();
  }
}
