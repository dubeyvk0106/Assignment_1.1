package week6;

class GenericClass<T> {

    private T data;

    public GenericClass(T data) {
        this.data = data;
    }


    public T getValue() {
        return this.data;
    }
}

public class generics {

    public static void main(String[] args) {


        GenericClass<Integer> integerObj = new GenericClass<>(100);
        System.out.println("Generic Class on this occasion returns: " + integerObj.getValue());

        GenericClass<String> stringObj = new GenericClass<>("Java Generics Practice");
        System.out.println("Generic Class on this occasion returns: " + stringObj.getValue());
    }
}
