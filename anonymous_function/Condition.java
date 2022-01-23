package anonymous_function;

@FunctionalInterface
public interface Condition<T> {
	public boolean test(T t);
}
