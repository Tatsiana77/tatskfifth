package by.epam.task05.util;

import java.util.concurrent.atomic.AtomicInteger;

public class IdGenerator {
    private static final AtomicInteger COUNTER = new AtomicInteger(0);

    public static int generateId(){
        return COUNTER.getAndIncrement();
    }
}
