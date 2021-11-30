package by.epam.task05.entity;


import by.epam.task05.util.IdGenerator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class Ship implements Runnable {
    private static final Logger logger = LogManager.getLogger();
    private int shipId;
    private ShipTask task;
    private State state;

    public enum ShipTask {
        LOAD, UNLOAD;
    }

    public enum State {
        WAITING, PROCESSING, COMPLETE
    }

    public Ship(ShipTask task) {
        this.task = task;
        shipId = IdGenerator.generateId();
        state = State.WAITING;
    }

    public ShipTask getTask() {
        return task;
    }

    public int getShipId() {
        return shipId;
    }

    public State getState() {
        return state;
    }

    @Override
    public void run() {
        logger.log(Level.INFO, "Ship {} started {}", shipId, task.toString().toLowerCase());
        state = State.PROCESSING;
        Harbor harbor = Harbor.getInstance();
        Dock dock = Harbor.obtainDock();
        dock.processShip(this);
        harbor.releaseDock(dock);
        state = State.COMPLETE;
        logger.log(Level.INFO, "EXIT: Ship {} ended {}", shipId, task.toString().toLowerCase());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ship{");
        sb.append("task=").append(task.toString().toLowerCase());
        sb.append(", shipId=").append(shipId);
        sb.append('}');
        return sb.toString();
    }
}
