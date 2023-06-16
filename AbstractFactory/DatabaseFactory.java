package AbstractFactory;

public class DatabaseFactory implements DataSourceAbstractFactory{
    @Override
    public Service createService(){
        return new DatabaseService();
    };

    @Override
    public Response createResponse(){
        return new ResponseService();
    };
}
