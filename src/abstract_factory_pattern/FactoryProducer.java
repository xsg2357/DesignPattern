package abstract_factory_pattern;

/**
 * 生产中心
 */
public class FactoryProducer {

    public  static  AbstractFactory getFactory(String factory){
        if (factory.equals("ShapeFactory")){

            return new ShapeFactory();
        }else  if ((factory.equals("ColorFactory"))){
            return new ColorFactory();
        }

        return  null;
    }
}
