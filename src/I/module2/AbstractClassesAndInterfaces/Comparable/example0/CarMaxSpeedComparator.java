package I.module2.AbstractClassesAndInterfaces.Comparable.example0;

import java.util.Comparator;

 class CarMaxSpeedComparator implements Comparator {

     @Override
     public int compare(Object o1, Object o2) {
         Car car1 = (Car) o1;
         Car car2 = (Car) o2;

         if(car1.getMaxSpeed()>car2.getMaxSpeed())return 1;
         if(car1.getMaxSpeed()<car2.getMaxSpeed())return -1;
         return 0;
     }
 }
