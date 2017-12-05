package ArrayList;

import java.util.Iterator;

public class NewArrayList<E> implements List<E> {
    public static void main(String[] args) {
        List<String> strings = new NewArrayList<>();
        strings.add("First");
        strings.add("Second");
        strings.add("Third");
        strings.update(1, "update");
        System.out.println(strings.get(1));
    }

    private E[] values;

    public NewArrayList() {

        values = (E[]) new Object[0];
    }

    @Override
    public boolean add(E e) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = e;
            return true;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public void delete(int index) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values, 0, index);
            int amoutElemAfterIndex = temp.length - index - 1;
            System.arraycopy(
                    temp, index + 1,//src
                    values, index,//target
                    amoutElemAfterIndex);//amout
        }catch (ClassCastException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, E e) {
        values[index] = e;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<E>(values);
    }
}
