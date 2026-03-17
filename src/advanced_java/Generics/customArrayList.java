package advanced_java.Generics;
import java.util.Arrays;
/**
 * Custom implementation of a dynamic array for integers.
 *
 * <p>This class mimics basic functionality of Java's ArrayList:
 * - Dynamic resizing
 * - Add, remove, get, set operations
 *
 * Note: This implementation is for learning purposes and does not
 * include bounds checking or advanced features.
 */
class customArrayList {
    private int[] data;
    private static int DEFAULT_SIZE =10;
    private int size=0;

    public customArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    private boolean isFull(){
        return size==data.length;
    }
    public void resize(){
        int[] temp = new int[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }

    public void add(int value){
        if(isFull()){
            resize();
        }
        data[size++]=value;
    }
    public int remove(){
        int removed=data[--size];
        data[size] = 0;
        return  removed;
    }
    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index,int value){
        data[index]=value;
    }

    @Override
    public String toString() {
        int[] actual = Arrays.copyOf(data, size);
        return "customArrayList{" +
                "data=" + Arrays.toString(actual) +
                ", size=" + size +
                '}';
    }

    public static void main() {
        customArrayList list = new customArrayList();
        for (int i = 0; i <14 ; i++) {
            list.add(i*2);
        }
        System.out.println(list);
        System.out.println(list.remove());
        System.out.println(list.remove());
        System.out.println("list after delete items:");
        System.out.println(list);
    }
}
