package oop.lambda;

@FunctionalInterface
public interface GenericPredicate<T> {

    Boolean test(T t);

}
