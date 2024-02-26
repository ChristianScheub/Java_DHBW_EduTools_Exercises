public abstract class Plant {
    protected int size = 0;
    protected boolean isBlooming;
    protected abstract void grow();
    protected abstract void bloom(boolean var);

    public int getSize() {
        return size;
    }
}
