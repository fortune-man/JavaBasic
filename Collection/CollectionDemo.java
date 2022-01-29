package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Computer implements Comparable{

    int serial;
    String owner;

    public Computer(int serial, String owner) {
        this.serial = serial;
        this.owner = owner;
    }

    

    public int compareTo(Object o){
        return this.serial - ((Computer)o).serial;
    }

    public String toString(){
        return serial + " " + owner;
    }
}

public class CollectionDemo{
    public static void main(String[] args) {
        List<Computer> computers = new ArrayList<Computer>();
        computers.add(new Computer(8082, "h2-console"));
        computers.add(new Computer(404, "NotFound"));
        computers.add(new Computer(8080, "localhost"));

        Iterator i = computers.iterator();
        System.out.println("before");
        while(i.hasNext()){
            System.out.println(i.next());
        }

        Collections.sort(computers);
        System.out.println("===========\nafter");
        i = computers.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
