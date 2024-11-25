package main.api.specific.api;


/**
 * A collection of all APIs, providing a default implementation.
 */
public interface ApiService {

    default void specific1() {
        throw new UnsupportedOperationException("");
    }

    default void specific2() {
        throw new UnsupportedOperationException("");
    }
}
