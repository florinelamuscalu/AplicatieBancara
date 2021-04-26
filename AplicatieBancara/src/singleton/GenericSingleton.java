package singleton;

import java.util.HashMap;
import java.util.Map;

public class GenericSingleton {
    private static final GenericSingleton instance = new GenericSingleton();

    private Map<Class, Object> mapBuffer = new HashMap<Class, Object>();


    private GenericSingleton (){}

    public static <T> T getInstance(Class<T> clasa) throws InstantiationException, IllegalAccessException{
        if(!instance.mapBuffer.containsKey(clasa)){
            T object = clasa.newInstance();

            instance.mapBuffer.put(clasa, object);
        }
        return (T)instance.mapBuffer.get(clasa);
    }
}
