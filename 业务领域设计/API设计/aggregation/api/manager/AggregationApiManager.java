package main.api.aggregation.api.manager;

import main.api.aggregation.api.ApiService;

/**
 * API1/2 implement.
 */
public class AggregationApiManager implements ApiService {

    @Override
    public void specific1() {
        System.out.println("1");
    }

    @Override
    public void specific2() {
        System.out.println("2");
    }
}
