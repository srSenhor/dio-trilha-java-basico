package singleton;

public class LazyHolderSingleton {

    public static class Holder {
        public static LazyHolderSingleton instance = new LazyHolderSingleton();
    }

    private LazyHolderSingleton() {
        super();
    }

    public static LazyHolderSingleton getInstance() {
        return Holder.instance;
    }

}
