package singleTon_Pattern;

import java.lang.reflect.Constructor;

class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    // private constructor to avoid client applications using the constructor
    private EagerInitializedSingleton(){}

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}
public class ReflectionSingleTonTest {

	public static void main(String[] args) {
		
		EagerInitializedSingleton instance1 = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton instance2 =null;
		
		try {
			Constructor<?>[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
			//this code will distroy the the sigletone
			
			for(Constructor<?> constructor:constructors) {
				constructor.setAccessible(true);
				instance2 = (EagerInitializedSingleton) constructor.newInstance();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
	}
}
