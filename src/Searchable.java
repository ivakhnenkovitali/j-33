import _01_intro_lambdas.model.Cat;


@FunctionalInterface
public interface Searchable<T> {
    boolean test(Cat cat, T value);
}
