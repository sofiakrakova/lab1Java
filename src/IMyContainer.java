public interface IMyContainer<T> {
     void add(T number);
     T get(int index);
     T removeAt(int index);
     boolean remove(T number);
     public void showAll();
     public void clearAll();
}