package GarbageCollection;

class AnonymousObject {
    String name;

    AnonymousObject(String name) {
        this.name = name;
    }

    @Override
    public void finalize() throws Throwable {
        System.out.println(name + " successfully garbage collected.");
    }
}

public class q4 {

    public static void main(String[] args) {

        new AnonymousObject("Obj1");

        System.gc();
    }

}