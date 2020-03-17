package ch.fhnw.oop2.module05.streams.ab1;

import java.util.stream.Stream;

public class Fibonacci {
    public static void main(String[] args) {
        Stream.iterate(new Tuple<Long>(0L, 1L), tuple -> new Tuple<Long>(tuple.t2, tuple.t1+tuple.t2))
                .limit(50)
                .map(longTuple -> longTuple.t1)
                .forEach(tuple -> System.out.println(tuple.toString()));
    }
}
