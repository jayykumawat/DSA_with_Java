package collections.advanced;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
         
         List<String>list=new CopyOnWriteArrayList<>();
         list.add("Item1");
        list.add("Item2");
           list.add("Item3");

Thread readThread = new Thread(()->{
      
    try {
        while(true){
            System.out.println("Reading the Items: "+list);
            Thread.sleep(100);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
});

Thread writeThread = new Thread(()->{
      
    try {
        Thread.sleep(500);
        list.add("Item4");
        System.out.println("Topic 4 is add in list");

        Thread.sleep(500);
        list.remove("Item2");
        System.out.println("topic 2 is removed ");
    } catch (Exception e) {
        e.printStackTrace();
    }
});

readThread.start();
writeThread.start();

        // List<String> list= new CopyOnWriteArrayList<>();

        // list.add("pizza");
        // list.add("burger");
        // list.add("eggs");

        // for(String l:list){

        //     System.out.println(l);
        //     if(l.equals("burger")){
        //         list.add("momos");
        //         System.out.println("Momos added to our list");
        //     }
        // }
        // System.out.println("Our list is here: "+list);
    }
}
