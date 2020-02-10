package sample;
import java.io.IOException;
import java.util.Date;
import java.util.logging.*;


public class BooleanCalculator {



    private static Logger log = Logger.getLogger(BooleanCalculator.class.getName());
    static private FileHandler fileTxt;


    static {
        try {
            fileTxt = new FileHandler("Logging.txt", true);
            fileTxt.setFormatter(new SimpleFormatter() {
                private static final String format = "[%1$tF %1$tT] [%2$-7s] %3$s %n";
                @Override
                public synchronized String format(LogRecord lr) {
                    return String.format(format,
                            new Date(lr.getMillis()),
                            lr.getLevel().getLocalizedName(),
                            lr.getMessage()
                    );
                }
            });
            log.addHandler(fileTxt);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    ;
    private String theFirstInput;
    private String theSecondInput;

    public BooleanCalculator() {
    }

    public BooleanCalculator(String theFirstInput, String theSecondInput) {
        this.theFirstInput = theFirstInput;
        this.theSecondInput = theSecondInput;
        if (this.theFirstInput == "True") {
            log.info("The first argument is TRUE");
        }else if(this.theFirstInput == "False") {
            log.info("The first argument is FALSE");
        }else {
            log.info("The first argument is NULL");
        }
        if (this.theSecondInput == "True") {
            log.info("The second argument is TRUE");
        }else if(this.theSecondInput == "False") {
            log.info("The second argument is FALSE");
        }else {
            log.info("The second argument is NULL");
        }
        log.info("Was set the arguments");
    }

    public String getTheFirstInput() {
        return theFirstInput;
    }

    public void setTheFirstInput(String theFirstInput) {
        this.theFirstInput = theFirstInput;
    }

    public String getTheSecondInput() {
        return theSecondInput;
    }

    public void setTheSecondInput(String theSecondInput) {
        this.theSecondInput = theSecondInput;
    }
    public String number1(){

        log.info("The first method was started!");
        log.warning("Returned value is FALSE");
        log.info("The first method was done!");
        return "FALSE";
            }


    public String number2(){
        log.info("The second method was started!");
        if(theFirstInput == "NULL") {
            if(theSecondInput == "NULL") {
                log.severe("Returned value is NULL");
                log.info("The second method was done!");
                return "NULL";
            }
            else if(theSecondInput == "TRUE") {
                log.severe("Returned value is NULL");
                log.info("The second method was done!");
                return "NULL";
            }
            else {
                log.warning("Returned value is FALSE");
                log.info("The second method was done!");
                return "FALSE";
            }
        }
        else if(theFirstInput == "TRUE"){
            if(theSecondInput == "NULL") {
                log.severe("Returned value is NULL");
                log.info("The second method was done!");
                return "NULL";
            }
            else if(theSecondInput == "TRUE") {
                log.info("Returned value is TRUE");
                log.info("The second method was done!");
                return "TRUE";
            }
            else {
                log.warning("Returned value is FALSE");
                log.info("The second method was done!");
                return "FALSE";
            }
        }
        else {
            log.warning("Returned value is FALSE");
            log.info("The second method was done!");

            return "FALSE";

        }

    }
    public String number3(){
        log.info("The third method was started!");
        if(theFirstInput == "NULL") {
            log.severe("Returned value is NULL");
            log.info("The third method was done!");
            return "NULL";
        }
        else if(theFirstInput == "TRUE"){
            if(theSecondInput == "NULL") {
                log.info("Returned value is TRUE");
                log.info("The third method was done!");
                return "TRUE";
            }
            else if(theSecondInput == "TRUE") {
                log.warning("Returned value is FALSE");
                log.info("The third method was done!");
                return "FALSE";
            }
            else {
                log.info("Returned value is TRUE");
                log.info("The third method was done!");
                return "TRUE";
            }
        }
        else {
            log.warning("Returned value is FALSE");
            log.info("The third method was done!");
            return "FALSE";
        }

    }
    public String number4(){
        log.info("The forth method was started!");
        if (this.theFirstInput == "True") {
            log.info("Returned value is TRUE");
        }else if(this.theFirstInput == "False") {
            log.warning("Returned value is FALSE");
        }else {
            log.severe("Returned value is NULL");
        }
        log.info("The forth method was done!");
        return theFirstInput;

    }
    public String number5(){
        log.info("The fifth method was started!");
        if(theFirstInput == "NULL") {
            log.severe("Returned value is NULL");
            log.info("The fifth method was done!");
            return "NULL";
        }
        else if(theFirstInput == "TRUE"){
            log.info("Returned value is TRUE");
            log.info("The fifth method was done!");
           return "FALSE";
        }
        else {
            if(theSecondInput == "NULL") {
                log.severe("Returned value is NULL");
                log.info("The fifth method was done!");
                return "NULL";
            }
            else if(theSecondInput == "TRUE") {
                log.info("Returned value is TRUE");
                log.info("The fifth method was done!");
                return "TRUE";
            }
            else {
                log.warning("Returned value is FALSE");
                log.info("The fifth method was done!");
                return "FALSE";
            }
        }

    }public String number6(){
        log.info("The sixth method was started!");
        if (this.theSecondInput == "True") {
            log.info("Returned value is TRUE");
        }else if(this.theSecondInput == "False") {
            log.warning("Returned value is FALSE");
        }else {
            log.severe("Returned value is NULL");
        }
        log.info("The sixth method was done!");
        return theSecondInput;

    }
    public String number7(){
        log.info("The seventh method was started!");
        if(theFirstInput == "NULL") {
            if(theSecondInput == "NULL") {
                log.warning("Returned value is FALSE");
                log.info("The seventh method was done!");
                return "FALSE";
            }
            else if(theSecondInput == "TRUE") {
                log.info("Returned value is TRUE");
                log.info("The seventh method was done!");
                return "TRUE";
            }
            else {
                log.info("Returned value is TRUE");
                log.info("The seventh method was done!");
                return "TRUE";
            }
        }
        else if(theFirstInput == "TRUE"){
            if(theSecondInput == "NULL") {
                log.info("Returned value is TRUE");
                log.info("The seventh method was done!");
                return "TRUE";
            }
            else if(theSecondInput == "TRUE") {
                log.warning("Returned value is FALSE");
                log.info("The seventh method was done!");
                return "FALSE";
            }
            else {
                log.info("Returned value is TRUE");
                log.info("The seventh method was done!");
                return "TRUE";
            }
        }
        else {
            if(theSecondInput == "NULL") {
                log.info("Returned value is TRUE");
                log.info("The seventh method was done!");
                return "TRUE";
            }
            else if(theSecondInput == "TRUE") {
                log.info("Returned value is TRUE");
                log.info("The seventh method was done!");
                return "TRUE";
            }
            else {
                log.warning("Returned value is FALSE");
                log.info("The seventh method was done!");
                return "FALSE";
            }
        }
    }
    public String number8(){
        log.info("The eighth method was started!");
        if(theFirstInput == "NULL") {
            if(theSecondInput == "NULL") {
                log.severe("Returned value is NULL");
                log.info("The eighth method was done!");
                return "NULL";
            }
            else if(theSecondInput == "TRUE") {
                log.info("Returned value is TRUE");
                log.info("The eighth method was done!");
                return "TRUE";
            }
            else {
                log.severe("Returned value is NULL");
                log.info("The eighth method was done!");
                return "NULL";
            }
        }
        else if(theFirstInput == "TRUE"){
            log.info("Returned value is TRUE");
            log.info("The eighth method was done!");
           return "TRUE";
        }
        else {
            if(theSecondInput == "NULL") {
                log.severe("Returned value is NULL");
                log.info("The eighth method was done!");
                return "NULL";
            }
            else if(theSecondInput == "TRUE") {
                log.info("Returned value is TRUE");
                log.info("The eighth method was done!");
                return "TRUE";
            }
            else {
                log.warning("Returned value is FALSE");
                log.info("The eighth method was done!");
                return "FALSE";
            }
        }
    }
    public String number9(){
        log.info("The nineth method was started!");
        if(theFirstInput == "NULL") {
            if(theSecondInput == "NULL") {
                log.severe("Returned value is NULL");
                log.info("The nineth method was done!");
                return "NULL";
            }
            else if(theSecondInput == "TRUE") {
                log.warning("Returned value is FALSE");
                log.warning("The nineth method was done!");
                return "FALSE";
            }
            else {
                log.severe("Returned value is NULL");
                log.info("The nineth method was done!");
                return "NULL";
            }
        }
        else if(theFirstInput == "TRUE"){
            log.warning("Returned value is FALSE");
            log.info("The nineth method was done!");
            return "FALSE";
        }
        else {
            if(theSecondInput == "NULL") {
                log.severe("Returned value is NULL");
                log.info("The nineth method was done!");
                return "NULL";
            }
            else if(theSecondInput == "TRUE") {
                log.warning("Returned value is FALSE");
                log.info("The nineth method was done!");
                return "FALSE";
            }
            else {
                log.info("Returned value is TRUE");
                log.info("The nineth method was done!");
                return "TRUE";
            }
        }
    }
    public String number10(){
        log.info("The tenth method was started!");
        if(theFirstInput == "NULL") {
            if(theSecondInput == "NULL") {
                log.info("Returned value is TRUE");
                log.info("The tenth method was done!");
                return "TRUE";
            }
            else {
                log.warning("Returned value is FALSE");
                log.info("The tenth method was done!");
                return "FALSE";
            }
        }
        else if(theFirstInput == "TRUE"){
            if(theSecondInput == "TRUE") {
                log.info("Returned value is TRUE");
                log.info("The tenth method was done!");
                return "TRUE";
            }
            else {
                log.warning("Returned value is FALSE");
                log.info("The tenth method was done!");
                return "FALSE";
            }
        }
       else {
            if(theSecondInput == "FALSE") {
                log.info("Returned value is TRUE");
                log.info("The tenth method was done!");
                return "TRUE";
            }
            else {
                log.warning("Returned value is FALSE");
                log.info("The tenth method was done!");
                return "FALSE";
            }
        }
    }
    public String number11(){
        log.info("The eleventh method was started!");
        if(theSecondInput == "NULL") {
            log.severe("Returned value is NULL");
            log.info("The eleventh method was done!");
            return "NULL";
        }
        else if(theSecondInput == "TRUE"){
            log.warning("Returned value is FALSE");
            log.info("The eleventh method was done!");
            return "FALSE";
        }
        else {
            log.info("Returned value is TRUE");
            log.info("The eleventh method was done!");
            return "TRUE";
        }
    }
    public String number12(){
        log.info("The twelveth method was started!");
        if(theFirstInput == "NULL") {
            log.severe("Returned value is NULL");
            log.info("The twelveth method was done!");
            return "NULL";
        }
        else if(theFirstInput == "TRUE"){
            log.warning("Returned value is FALSE");
            log.info("The twelveth method was done!");
            return "FALSE";
        }
        else {
            if(theSecondInput == "NULL") {
                log.severe("Returned value is NULL");
                log.info("The twelveth method was done!");
                return "NULL";
            }
            else if(theSecondInput == "TRUE") {
                log.warning("Returned value is FALSE");
                log.info("The twelveth method was done!");
                return "FALSE";
            }
            else {
                log.info("Returned value is TRUE");
                log.info("The twelveth method was done!");
                return "TRUE";
            }
        }

    }
    public String number13(){
        log.info("The thirteenth method was started!");
        if(theFirstInput == "NULL") {
            log.severe("Returned value is NULL");
            log.info("The thirteenth method was done!");
            return "NULL";
        }
        else if(theFirstInput == "TRUE"){
            log.warning("Returned value is FALSE");
            log.info("The thirteenth method was done!");
            return "FALSE";
        }
        else {
            log.info("Returned value is TRUE");
            log.info("The thirteenth method was done!");
            return "TRUE";
        }
    }
    public String number14(){
        log.info("The fourteenth method was started!");
        if(theFirstInput == "NULL") {
            log.severe("Returned value is NULL");
            log.info("The fourteenth method was done!");
            return "NULL";
        }
        else if(theFirstInput == "TRUE"){
            if(theSecondInput == "NULL") {
                log.warning("Returned value is FALSE");
                log.info("The fourteenth method was done!");
                return "FALSE";
            }
            else if(theSecondInput == "TRUE") {
                log.info("Returned value is TRUE");
                log.info("The fourteenth method was done!");
                return "TRUE";
            }
            else {
                log.warning("Returned value is FALSE");
                log.info("The fourteenth method was done!");
                return "FALSE";
            }
        }
        else {
            log.info("Returned value is TRUE");
            log.info("The fourteenth method was done!");
            return "TRUE";
        }

    }
    public String number15(){
        log.info("The fifteenth method was started!");
        if(theFirstInput == "NULL") {
            if(theSecondInput == "NULL") {
                log.severe("Returned value is NULL");
                log.info("The fifteenth method was done!");
                return "NULL";
            }
            else if(theSecondInput == "TRUE") {
                log.severe("Returned value is NULL");
                log.info("The fifteenth method was done!");
                return "NULL";
            }
            else {
                log.info("Returned value is TRUE");
                log.info("The fifteenth method was done!");
                return "TRUE";
            }
        }
        else if(theFirstInput == "TRUE"){
            if(theSecondInput == "NULL") {
                log.severe("Returned value is NULL");
                log.info("The fifteenth method was done!");
                return "NULL";
            }
            else if(theSecondInput == "TRUE") {
                log.warning("Returned value is FALSE");
                log.info("The fifteenth method was done!");
                return "FALSE";
            }
            else {
                log.info("Returned value is TRUE");
                log.info("The fifteenth method was done!");
                return "TRUE";
            }
        }
        else {
            log.info("Returned value is TRUE");
            log.info("The fifteenth method was done!");

            return "TRUE";

        }

    }
    public String number16(){
        log.info("The sixteenth method was started!");
        log.info("Returned value is TRUE");
        log.info("The sixteenth method was done!");
        return "TRUE";
    }
}

