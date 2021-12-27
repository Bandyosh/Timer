import java.util.*;
public class Timer {
    public Timer(){
        Scanner scanner = new Scanner(System.in);
        console.color(ANSI.CYAN(), "What do you want to time in? Hours (H), Minutes (M), or Seconds (S)");
        String userResponse = scanner.nextLine();
        int seconds = 0;
        if (userResponse.equalsIgnoreCase("HOURS") || userResponse.equalsIgnoreCase("H")) {
            seconds = zForm.Int(ANSI.YELLOW(), "How many hours are you timing?");
            seconds *= 3600;
        } else {
            if (userResponse.equalsIgnoreCase("MINUTES") || userResponse.equalsIgnoreCase("M")) {
                seconds = zForm.Int(ANSI.YELLOW(), "How many Minutes are you timing?");
                seconds *= 60;
            } else {

                if (userResponse.equalsIgnoreCase("SECONDS") || userResponse.equalsIgnoreCase("S")) {
                    seconds = zForm.Int(ANSI.YELLOW(), "How many Seconds are you timing?");
                } else{
                    console.error("Invalid Input(s)");
                    console.end();
                }
            }
        }
            for (int i = 0; i <= seconds; i++) {
                console.color(ANSI.orange(), Format.timeStamp((seconds - i)) + " Remaining");
                if (i == seconds) {
                    console.log("Timer Reached 0 seconds...");
                    zForm.Restart();
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e){
                    console.error("Ending Program");
                    console.end();
                }
            }
    }
}