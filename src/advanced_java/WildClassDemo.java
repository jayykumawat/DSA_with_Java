package advanced_java;
import java.util.*;

// here T should either be Number or its subclasses
class WildClassDemo<T extends Number> {
    private Object[] data;
    private static int DEFAULT_SIZE =10;
    private int size=0;

    public WildClassDemo() {
        this.data = new Object[DEFAULT_SIZE];
    }

    private boolean isFull(){
        return size==data.length;
    }
    public void resize(){
        Object[] temp = new Object[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }

    public void getList(List <? extends Number>list){
     //do something here
    }

    public void add(T value){
        if(isFull()){
            resize();
        }
        data[size++]=value;
    }
    public T remove(){
        T removed=(T)(data[--size]);
        data[size] = 0;
        return  removed;
    }
    public T get(int index){
        return (T)data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index,T value){
        data[index]=value;
    }

    @Override
    public String toString() {
        Object[] actual = Arrays.copyOf(data, size);
        return "customArrayList{" +
                "data=" + Arrays.toString(actual) +
                ", size=" + size +
                '}';
    }

    public static void main() {
        WildClassDemo<Integer> list2 = new WildClassDemo<>();//if we write String here its gives error because its allow number type generics 
        list2.add(100);
        list2.add(101);
        System.out.println(list2);
    }
}

