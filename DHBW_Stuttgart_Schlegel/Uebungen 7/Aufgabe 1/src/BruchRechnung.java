public class BruchRechnung implements BruchRechnungInterface{
    @Override
    public Bruch init(int zaehler, int nenner){
        return kuerzen(new Bruch(zaehler ,nenner));
    }
    @Override
    public Bruch kuerzen(Bruch bruch){
        int ggT = groestenGemeinsamenTeiler(bruch.getZaehler(),bruch.getNenner());
        return new Bruch(bruch.getZaehler()/ggT,bruch.getNenner()/ggT);
    }
    private int groestenGemeinsamenTeiler(int z1,int z2){
        if(z1==z2) return z1;
        z1 = Math.abs(z1);
        z2 = Math.abs(z2);
        while(z1 != z2){
            if(z1 > z2){
                z1 -= z2;
            }else{
                z2 -= z1;
            }
        }
        return z1;
    }
    @Override
    public Bruch multTo(Bruch faktor1, Bruch faktor2){
        faktor1 = kuerzen(faktor1);
        faktor2 = kuerzen(faktor2);
        return init(
                faktor1.getZaehler() * faktor2.getZaehler(), faktor2.getNenner() * faktor2.getNenner()
        );
    }
    @Override
    public Bruch addTo(Bruch summant1, Bruch summant2){
        summant1 = kuerzen(summant1);
        summant2 = kuerzen(summant2);
        Bruch out;
        if(summant1.getNenner()==summant2.getNenner()){
            out = init(summant1.getZaehler()+summant2.getZaehler(),summant1.getNenner());
        }else {
            out = init(
                    summant1.getZaehler()* summant2.getNenner()+summant2.getZaehler()*summant1.getNenner()
                    ,summant1.getNenner()* summant2.getNenner()
            );
        }
        return kuerzen(out);
    }
}
