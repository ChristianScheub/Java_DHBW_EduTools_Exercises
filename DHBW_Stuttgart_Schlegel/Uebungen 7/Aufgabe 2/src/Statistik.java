public class Statistik implements StatistikInterface {
    public static void main(String[] args) {

    }
    public Statistik(double[] x){
        if(x==null) throw new RuntimeException();
        if(x.length<1) throw new UnsupportedOperationException();
        this.stat = x;
    }
    private final double[] stat;
    @Override
    public double minValue() {
        double min = stat[0];
        for(double d:stat){
            if(d<min) min = d;
        }
        return min;
    }

    @Override
    public double maxValue() {
        double max = stat[0];
        for (double d:stat){
            if(d>max) max = d;
        }
        return max;
    }

    @Override
    public double meanValue() {
        double avg = 0;
        for (double d:stat){
            avg += d;
        }
        return avg/stat.length;
    }

    @Override
    public double standardDeviation() {
        double variances[] = new double[stat.length];
        double mean = this.meanValue();
        for (int i = 0; i < variances.length; i++) {
            variances[i] = Math.pow(stat[i]-mean,2);
        }
        return Math.sqrt(new Statistik(variances).meanValue());
    }
}