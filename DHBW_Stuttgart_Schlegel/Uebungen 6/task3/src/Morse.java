public class Morse {
  public static void main (String[] args){
      java.util.Scanner scan = new java.util.Scanner(System.in);
      System.out.print("Geben Sie n Zeichen ein: ");
      char zeichen = scan.next().charAt(0);
      String ausgabe;

      switch (zeichen){
          case 'A':
          case 'a': ausgabe = ".-"; break;
          case 'B':
          case 'b': ausgabe = "-..."; break;
          case 'C':
          case 'c': ausgabe = "-.-."; break;
          case 'D':
          case 'd':	ausgabe = "-.."; break;
          case 'E':
          case 'e':	ausgabe = ".";	break;
          case 'F':
          case 'f':	ausgabe = "--.-"; break;
          case 'G':
          case 'g': ausgabe = "--."; break;
          case 'H':
          case 'h':	ausgabe = "...."; break;
          case 'I':
          case 'i':	ausgabe = "..";	break;
          case 'J':
          case 'j':	ausgabe = ".---"; break;
          case 'K':
          case 'k':	ausgabe = "-.-."; break;
          case 'L':
          case 'l':	ausgabe = ".-.."; break;
          case 'M':
          case 'm':	ausgabe = "--"; break;
          case 'N':
          case 'n':	ausgabe = "-.";	break;
          case 'O':
          case 'o':	ausgabe = "---"; break;
          case 'P':
          case 'p':	ausgabe = ".--."; break;
          case 'Q':
          case 'q':	ausgabe = "--.-"; break;
          case 'R':
          case 'r': ausgabe = ".-."; break;
          case 'S':
          case 's':	ausgabe = "..."; break;
          case 'T':
          case 't':	ausgabe = "-"; break;
          case 'U':
          case 'u':	ausgabe = "..-"; break;
          case 'V':
          case 'v':	ausgabe = "...-"; break;
          case 'W':
          case 'w':	ausgabe = ".--"; break;
          case 'X':
          case 'x':	ausgabe = "-..-"; break;
          case 'Y':
          case 'y':	ausgabe = "-.--"; break;
          case 'Z':
          case 'z':	ausgabe = "--.."; break;
          case '0':	ausgabe = "-----"; break;
          case '1':	ausgabe = ".----"; break;
          case '2':	ausgabe = "..---"; break;
          case '3':	ausgabe = "...--"; break;
          case '4':	ausgabe = "....-"; break;
          case '5':	ausgabe = "....."; break;
          case '6':	ausgabe = "-...."; break;
          case '7':	ausgabe = "--..."; break;
          case '8':	ausgabe = "---.."; break;
          case '9':	ausgabe = "----."; break;
          default:	ausgabe = "Keine gültiges Zeichen!";

      }
      System.out.println(ausgabe);
  }
}