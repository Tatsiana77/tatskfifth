package by.epam.task05.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Harbor {
    private static final Logger logger = LogManager.getLogger();
    private static Harbor instance;
    private static final AtomicBoolean isInitialized = new AtomicBoolean(false);
    private Deque<Dock> freeDock = new ArrayDeque<>();
    private Deque<Dock> occupiedDock = new ArrayDeque<>();
    private final int CAPACITY;
    private static final int DOCK_COUNT = 4;
    private static ReentrantLock lock = new ReentrantLock();
    private Condition freeDockCondition = lock.newCondition();
    private Lock containerStorageLoking = new ReentrantLock();
    private Condition unloadAvailableCondition  = containerStorageLoking.newCondition();
    private Condition loadAvailableCondition  = containerStorageLoking.newCondition();
    private int currentContainerAmount;
    private int waitingForLoadAmount;
    private int waitingForUnloadAmount;


    public  static Harbor getInstance(){
        while (instance == null){
            if(isInitialized.compareAndSet(false,true)){
                instance = new Harbor();
            }
        }
        return instance;
    }

    private Harbor(){

        }

    public static Dock obtainDock() {
    }

    public void releaseDock(Dock dock) {
    }
}

