public class Format {
    public static String timeStamp(int time){
        int hours = time/(60*60);
        if(hours <= 0){
            hours = 0;
        }
        time = time - hours*3600;
        int minutes = (time/60);
        if(minutes <= 0){
          minutes = 0;
        }
        time = time - minutes*60;
        int secondsResp = time;
        return hours + " hours " + minutes + " minutes " + secondsResp + " seconds";
    }
}
