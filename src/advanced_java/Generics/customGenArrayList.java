package advanced_java.Generics;
import java.util.Arrays;
/**
 * A custom generic dynamic array implementation.
 *
 * <p>This class works like a simplified version of Java's ArrayList.
 * It stores elements in an internal Object array and automatically
 * resizes when the array becomes full.</p>
 *
 * @param <T> the type of elements stored in this list
 */
class customGenArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE =10;
    private int size=0;

    public customGenArrayList() {
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
        customGenArrayList<String> list2 = new customGenArrayList<>();
        list2.add("Jay");
        list2.add("Kunal");
        System.out.println(list2);
    }
}
