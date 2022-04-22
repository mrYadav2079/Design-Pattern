package IteratorDesignPattern;

public class CollectionsOfNames implements Container {
    public String name[] = {"Vishal Yadav", "Pulkit Prakash", "Saurabh Bist", "Chetan Singh", "Sailesh Pal"};

    @Override
    public Iterator getIterator() {
        return new CollectionofNamesIterate();
    }

    private class CollectionofNamesIterate implements Iterator {
        int i;

        @Override
        public boolean hasNext() {
            if (i < name.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return name[i++];
            }
            return null;
        }
    }
}