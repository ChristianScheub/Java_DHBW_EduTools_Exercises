public class Werkstatt {
    Werkstatt(int plaetze){
        fahrzeuge = new Fahrzeug[plaetze];
    }
  private Fahrzeug[] fahrzeuge;
  public void addFahrzeug(Fahrzeug fahrzeug,int platz){
      if(platz>=fahrzeuge.length){
          return;
      }
      if(fahrzeuge[platz]!=null){
          return;
      }
      fahrzeuge[platz] = fahrzeug;
  }
  public void removeFahrzeug(Fahrzeug fahrzeug,int platz){
      fahrzeuge[platz] = null;
  }
  public String druckeListe(){
      StringBuilder fahrzeugListe = new StringBuilder();
      int i = 0;
      for (Fahrzeug fahrzeug: fahrzeuge){
          if(!(fahrzeug==null)){
              fahrzeugListe.append("Platz: "+i+" "+fahrzeug);
          }
          i++;
      }
      return fahrzeugListe.toString();
  }
}