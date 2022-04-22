package IteratorDesignPattern;

public class Main {
    public static void main(String[] args) {
        CollectionsOfNames cmpnyRepository = new CollectionsOfNames();

        for(Iterator iter = cmpnyRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
