package labwork135;

import java.time.DayOfWeek;
import java.util.Arrays;

public class TrainSchedule {
    private  Train[]trains;
    private  int numOfTrains=0;

    public TrainSchedule(int numOfTrains){
        trains=new Train[numOfTrains];
    }


    public void printTrains(){
        System.out.println(Arrays.toString(trains));
    }

    class Train {
        private int number;
        private String stationDispath;
        private String stationArrival;
        private String timeDispath;
        private String timeArrival;
        private DayOfWeek days;

        public Train(int number) {
            this.number = number;
        }

        public String getStationDispath() {
            return stationDispath;
        }

        public void setStationDispath(String stationDispath) {
            this.stationDispath = stationDispath;
        }

        public String getStationArrival() {
            return stationArrival;
        }

        public void setStationArrival(String stationArrival) {
            this.stationArrival = stationArrival;
        }

        public String getTimeDispath() {
            return timeDispath;
        }

        public void setTimeDispath(String timeDispath) {
            this.timeDispath = timeDispath;
        }

        public String getTimeArrival() {
            return timeArrival;
        }

        public void setTimeArrival(String timeArrival) {
            this.timeArrival = timeArrival;
        }

        public DayOfWeek getDays() {
            return days;
        }

        public void setDays(DayOfWeek days) {
            this.days = days;
        }

        @Override
        public String toString() {
            return "Train{" +
                    "number=" + number +
                    ", stationDispath='" + stationDispath + '\'' +
                    ", stationArrival='" + stationArrival + '\'' +
                    ", timeDispath='" + timeDispath + '\'' +
                    ", timeArrival='" + timeArrival + '\'' +
                    ", days=" + days +
                    '}';
        }
    }
}
