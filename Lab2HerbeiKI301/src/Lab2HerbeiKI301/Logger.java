package Lab2HerbeiKI301;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;


public class Logger {
    private static Logger logger;
    private final String fileName;

    protected final String infoFlag = "[INFO] ";
    protected final String errorFlag = "[ERROR] ";
    protected final String warningFlag = "[WARNING] ";

    private Logger(String fileName)
    {
        this.fileName = fileName;
        File loggerFile = null;
        FileWriter fout = null;
        try
        {
            loggerFile = new File(fileName);
            fout = new FileWriter(loggerFile, true);
            SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
            Date date = new Date(System.currentTimeMillis());
            fout.write("[" + formatter.format(date) + "] " + "Logger start to work\n");
        }
        catch (IOException e)
        {
            System.err.println("Something wrong with log file" + e.getMessage());
            System.exit(1);
        }
        finally
        {
            try
            {
                if (fout != null) {
                    fout.flush();
                    fout.close();
                } else {
                    System.out.println("Об'єкт fout є null");
                }

            }
            catch (IOException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }

    public void log(String massege)
    {
        File loggerFile = null;
        FileWriter fout = null;
        try
        {
            loggerFile = new File(this.fileName);
            fout = new FileWriter(loggerFile, true);
            SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
            Date date = new Date(System.currentTimeMillis());
            fout.write("[" + formatter.format(date) + "] " + massege +  "\n");
        }
        catch (IOException e)
        {
            System.err.println("Something wrong with log file" + e.getMessage());
            System.exit(1);
        }
        finally
        {
            try
            {
                if (fout != null) {
                    fout.flush();
                    fout.close();
                } else {
                    System.out.println("Об'єкт fout є null");
                }
            }
            catch (IOException | NullPointerException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }

    public static Logger getLogger(String fileName)
    {
        if (logger == null)
        {
            logger = new Logger(fileName);
        }
        return logger;
    }

    public static Logger getLogger()
    {
        return logger;
    }

}
