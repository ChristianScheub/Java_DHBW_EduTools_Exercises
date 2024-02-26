import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bank {
  List<Konto> konten = new ArrayList<>();
  public int genAccNr(){
      Random random = new Random();
      int r;
      boolean unique;
      long tries = 0;
      do {
          r = random.nextInt(Integer.MAX_VALUE);
          unique = true;
          for (Konto konto : konten) {
              if (konto.getKontoNR() == r) {
                  unique = false;
                  break;
              }
          }
          tries++;
      } while (!unique && tries < konten.size());
      return r;
  }
  public void addAccount(String Inhaber, Kontotyp kontotyp){
      if(kontotyp == Kontotyp.Girokonto){
          konten.add(new GiroKonto(Inhaber,genAccNr(),9.7,50));
      }else {
          konten.add(new SparKonto(Inhaber,genAccNr(),0.314));
      }
  }
  public List<Konto> getKonten() {
      return konten;
  }

  public String alleKontos(){
      StringBuilder kontoString = new StringBuilder();
      konten.forEach(kontoString::append);
      return kontoString.toString();
  }
}