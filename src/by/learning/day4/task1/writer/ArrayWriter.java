package by.learning.day4.task1.writer;

import by.learning.day4.task1.entity.CustomArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayWriter {

    private static final Logger logger = LogManager.getLogger(ArrayWriter.class);

    public void arrayWriter(CustomArray customArray) {
        int[] array = customArray.getArray();
        for (int i = 0; i < array.length; i++) {
            logger.info(i + " - " + array[i] + "\n");
        }
    }
}
