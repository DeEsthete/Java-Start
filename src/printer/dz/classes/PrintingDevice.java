package printer.dz.classes;

import java.util.Random;

public interface PrintingDevice <T extends Material> {

    // выполняет печать и возвращает уровень качества печати
    int doPrint(T meterial);
}