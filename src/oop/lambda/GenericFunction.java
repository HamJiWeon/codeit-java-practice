package oop.lambda;

@FunctionalInterface
public interface GenericFunction <T, R> {

        R apply(T t);
}
