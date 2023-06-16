package AbstractFactory;

public interface DataSourceAbstractFactory {
    Service createService();
    Response createResponse();
}
