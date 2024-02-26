public class GoldenRetriever extends Dog{
    @Override
    protected void eat() {
        this.hasEaten = true;
    }

    @Override
    protected void shakeTail() {
        if(isHappy){
            System.out.println("Golden Retriever is shaking their Tail");
        }else {
            System.out.println("Golden Retriever is unhappy");
        }
    }

    @Override
    protected void bark() {
        System.out.println("Woof");
    }

}
