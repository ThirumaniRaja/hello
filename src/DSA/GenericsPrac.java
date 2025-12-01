package DSA;

public class GenericsPrac<T> {

    private T name;
    public GenericsPrac(T value) {
        this.name = value;
    }

    public  T getValue(){
        return name;
    }

    public static void main(String[] args){
        GenericsPrac<String> myObj = new GenericsPrac<>("Thiru");
        GenericsPrac<Integer> myObj1 = new GenericsPrac<>(32);
       System.out.println(myObj.getValue());
        System.out.println(myObj1.getValue());

    }



}
