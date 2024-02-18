public class Sunflower extends Plant{
    @Override
    protected void grow() {
        this.size++;
    }
    public void bloom(boolean var){
        this.isBlooming = var;
    }
}
