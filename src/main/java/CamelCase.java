import java.util.Locale;

public class CamelCase {

    public String receivedText;
    public String convertedText;

    public CamelCase(String receivedText){
        this.receivedText = receivedText;
    }

    public CamelCase(){
        this.receivedText = null;
    }

    public String convert(){
      this.convertedText =  this.receivedText.replaceAll(String.format("%s|%s|%s",
                      "(?<=[A-Z])(?=[A-Z][a-z])",
                      "(?<=[^A-Z])(?=[A-Z])",
                      "(?<=[A-Za-z])(?=[^A-Za-z])"
              ),
              " ").toLowerCase();
      return this.convertedText;
    }
}
