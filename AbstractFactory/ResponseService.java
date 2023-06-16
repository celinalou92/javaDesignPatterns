package AbstractFactory;

public class ResponseService implements Response {
    @Override
    public String getResponse(){
        return "Database response";
    }
}
