package dbEntries;

import core.DataBaseService;
import org.apache.log4j.Logger;

public class TestCasesTable {
    public static Logger logger = Logger.getLogger(TestCasesTable.class);

   DataBaseService dataBaseService;

    public TestCasesTable(DataBaseService dataBaseService) {
        this.dataBaseService = dataBaseService;
    }

    public void createTable() {
        logger.info("Создаем таблицу test_cases");

        String createTableSQL = "CREATE TABLE test_cases (" +
                "id SERIAL PRIMARY KEY, " +
                "title CHARACTER VARYING(30), " +
                "typeOfTemplate CHARACTER VARYING(30), " +
                "type CHARACTER VARYING(255), " +
                "typeOfPriority CHARACTER VARYING(255), " +
                ");";

        dataBaseService.executeSQL(createTableSQL);
    }

    public void addCustomer(String name, String references, String description) {
        logger.info("Добавляем записи в таблицу test_cases");

        String insertTableSQL = "INSERT INTO public.test_cases(" +
                "name, references, description)" +
                "VALUES ('" + name + "', '" + references + "', '" + description + "');";

        dataBaseService.executeSQL(insertTableSQL);
    }
}
