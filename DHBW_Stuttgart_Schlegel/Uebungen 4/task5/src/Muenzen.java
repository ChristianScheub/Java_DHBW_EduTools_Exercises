public class Muenzen
{
    enum Muenze
    {
        FUENFER(5, 2, Farbe.GOLD),
        ZEHNER(10, 3, Farbe.SILBER),
        ZWANZIGER(20, 4, Farbe.SILBER),
        FUENFZIGER(50, 2, Farbe.SILBER),
        EIN_FRAENKLER(100, 5, Farbe.SILBER),
        ZWEI_FRAENKLER(200, 9, Farbe.SILBER);

        private int mRappen;
        private int mGramm;
        private Farbe mFarbe;

        Muenze(int pRappen, int pGramm, Farbe pFarbe)
        {
            mRappen = pRappen;
            mGramm = pGramm;
            mFarbe = pFarbe;
        }

        public String toString()
        {
            return name() + ": Gewicht=" + mGramm + " Farbe:" + mFarbe.name() + "=" + mFarbe;
        }
    }

    enum Farbe
    {
        GOLD(154, 114, 50), SILBER(166, 176, 180);
        private int mRot;
        private int mGruen;
        private int mBlau;

        Farbe(int pRot, int pGruen, int pBlau)
        {
            mRot = pRot;
            mGruen = pGruen;
            mBlau = pBlau;
        }

        public String toString()
        {
            return mRot + "-" + mGruen + "-" + mBlau;
        }
    }

    public static void main(String[] args)
    {
        Muenze meineMuenzVariable = Muenze.ZEHNER;
        if (meineMuenzVariable == Muenze.FUENFER)
        {
            System.out.println("Das ist ein FUENFER ;-)");
        }
        System.out.println(meineMuenzVariable);
    }
}
