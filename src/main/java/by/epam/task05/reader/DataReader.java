package by.epam.task05.reader;

import by.epam.task05.exception.DataException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;


public class DataReader {
    private static final Logger logger = LogManager.getLogger();
    private static final String DEFAULT_FILE_PATH = "data/info.txt";

    public List<String> readFile() throws DataException {
        return readFile(DEFAULT_FILE_PATH);
    }

    public List<String> readFile(String filePath) throws DataException {
        List<String> result;
        try (FileReader reader = new FileReader(filePath)) {
            BufferedReader bufferedReader = new BufferedReader(reader);
            result = bufferedReader.lines().collect(Collectors.toList());
            logger.log(Level.INFO, "File" + filePath + "has been read");
        }catch (IOException e){
            logger.log(Level.ERROR, "Error while reading file" , e);
            throw new DataException(e);
        }
        return result;
    }
}
