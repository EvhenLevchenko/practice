package module2.AbstractClassesAndInterfaces.InterfacesAndSortCompareTo;

public class NR {

  public   Movable movable=new Movable() {
        @Override
        public void move() {
            System.out.println("non move");
        }
    };
}
