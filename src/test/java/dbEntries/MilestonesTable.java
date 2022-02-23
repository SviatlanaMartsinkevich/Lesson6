package dbEntries;

import core.DataBaseService;
import org.apache.log4j.Logger;

public class MilestonesTable {
    public static Logger logger = Logger.getLogger(MilestonesTable.class);

    DataBaseService dataBaseService;

    public MilestonesTable(DataBaseService dataBaseService) {
        this.dataBaseService = dataBaseService;
    }

    public void createTable() {
        logger.info("Создаем таблицу milestones");

        String createTableSQL = "CREATE TABLE milestones (" +
                "id SERIAL PRIMARY KEY, " +
                "name CHARACTER VARYING(30), " +
                "references CHARACTER VARYING(30), " +
                "description CHARACTER VARYING(255), " +
                ");";

        dataBaseService.executeSQL(createTableSQL);
    }

    public void addCustomer(String name, String references, String description) {
        logger.info("Добавляем записи в таблицу milestones");

        String insertTableSQL = "INSERT INTO public.milestones(" +
                "name, references, description)" +
                "VALUES ('" + name + "', '" + references + "', '" + description + "');";

        dataBaseService.executeSQL(insertTableSQL);
    }
}
