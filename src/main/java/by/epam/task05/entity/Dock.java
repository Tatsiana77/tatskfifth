package by.epam.task05.entity;


import by.epam.task05.util.IdGenerator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;


public class Dock {
    private static final Logger logger = LogManager.getLogger();
    private int dockId;
    private AtomicBoolean isBusy = new AtomicBoolean();

    public AtomicBoolean isBusy() {
        return isBusy;
    }

    public void setBusy(boolean busy) {
        this.isBusy.set(busy);
    }

    public Dock() {
        dockId = IdGenerator.generateId();
    }

    public void processShip(Ship ship) {
        try {
            TimeUnit.MILLISECONDS.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread.currentThread().interrupt();
    }






@Override
public boolean equals(Object o){
        if(this==o)return true;
        if(o==null||getClass()!=o.getClass())return false;
        Dock dock=(Dock)o;
        return isBusy.equals(dock.isBusy);
        }

@Override
public int hashCode(){
        return isBusy.hashCode();
        }
}

