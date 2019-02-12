package gestor.de.base.de.datos;

import java.sql.*;
import java.util.Properties;
import java.util.Set;
import org.h2.Driver;

/**
 *
 * @author diego
 */
public class Database_Manager {
    
    private String currUsername, currPassword;
    Connection conn;
    
    /* Database used is H2 */
    public Database_Manager(String username, String password) throws Exception{
        currUsername = username;
        currPassword = password;
        //conn.isValid(0);
    }
    
    
    //////////////////////////////////////////////////////////////////////
    /////////////////////// CONNECTION FUNCTIONS /////////////////////////
    //////////////////////////////////////////////////////////////////////
    
    /*
    public void connect() throws Exception {
        Properties prop = new Properties();
        prop.setProperty("user", currUsername);
        prop.setProperty("password", currPassword);
        conn = Driver.load().connect("jdbc:h2:" + currUsername, currPassword);
    }
    */
    
    
    public void connect()
            throws Exception {
        Class.forName("org.h2.Driver");
        conn = DriverManager.
            getConnection("jdbc:h2:~/test", currUsername, currPassword);
    }
    
    
    public void disconnect() throws Exception{
        conn.close();
    }
    
    //////////////////////////////////////////////////////////////////////
    ////////////////// END OF CONNECTION FUNCTIONS ///////////////////////
    //////////////////////////////////////////////////////////////////////
    
    
    /////------------------------------------------------------------/////
    /////------------------------------------------------------------/////
    /////------------------------------------------------------------/////
    /////------------------------------------------------------------/////
    /////------------------------------------------------------------/////
    /////------------------------------------------------------------/////

    
    //////////////////////////////////////////////////////////////////////
    ///////////////////// STRING CREATION FUNCTIONS //////////////////////
    //////////////////////////////////////////////////////////////////////
    
    ////////////////////////// STRINGS ///////////////////////////////////
    
    public String stringForSQL(String data[]) {
        String generatedString = "";
        
        for (int i = 0; i < data.length; i++) {
            if (i == data.length - 1) {
                generatedString += data[i];
            }else {
                generatedString += (data[i] + ", ");
            }
        }
        
        return generatedString;
    }
    
    ////////////////////////// TABLES ////////////////////////////////////
    public String showTables(String schemaName) {
        String sqlStatement = 
                String.format("SELECT * FROM %s.tables;", schemaName);
                        
        return sqlStatement;
    }
    
    public String createTables(String tableName, String values) {
        String sqlStatement = 
                String.format("CREATE TABLE %s(%s)",tableName, values);
        
        return sqlStatement;
    }
    
    public String updateTables() {
        String sqlStatement = 
                String.format("");
        
        return sqlStatement;
    }
    
    public String deleteTable(String tableName) {
        String sqlStatement = 
                String.format("DROP TABLE %s;", tableName);
        
        return sqlStatement;
    }
    
    ////////////////////////// INDEXES ///////////////////////////////////
    
    public String showIndexes(String schemaName) {
        String sqlStatement =
                String.format("SELECT * FROM %s.indexes;", schemaName);
        
        return sqlStatement;
    }
    
    public String createIndex(String indexName, String tableName, String fieldName) {
        String sqlStatement = 
                String.format("CREATE INDEX %s ON %s(%s)", 
                indexName, tableName, fieldName);
        
        return sqlStatement;
    }
    
    public String updateIndex(String oldIndexName, String newIndexName) {
        String sqlStatement = 
                String.format("ALTER INDEX %s RENAME TO %s", oldIndexName, newIndexName);
        
        return sqlStatement;
    }
    
    public String deleteIndex(String indexName) {
        String sqlStatement = 
                String.format("DROP INDEX IF EXISTS %s");
        
        return sqlStatement;
    }
    
    ////////////////////////// FUNCTIONS ////NOT//// /////////////////////////////////
    
    public String showFunctions(String schemaName) {
        String sqlStatement = 
                String.format("SELECT * FROM %s.function_aliases;", schemaName);
        
        return sqlStatement;
    }
    
    public String createFunction() {
        String sqlStatement = 
                String.format("");
        
        return sqlStatement;
    }
    
    public String updateFunction() {
        String sqlStatement = 
                String.format("");
        
        return sqlStatement;
    }
    
    public String deleteFunction(String aliasName) {
        String sqlStatement = 
                String.format("DROP ALIAS %s;", aliasName);
        
        return sqlStatement;
    }
    
    ////////////////////////// TRIGGERS //////////////////////////////////
    
    public String showTriggers(String schemaName) {
        String sqlStatement = 
                String.format("SELECT * FROM %s.triggers;", schemaName);
        
        return sqlStatement;
    }
    
    public String createTriggers(String triggerName, String triggerTime, String tableName) {
        String sqlStatement = 
                String.format("CREATE TRIGGER %s %s INSERT ON %s FOR EACH ROW CALL \"MyTrigger\"", triggerName, triggerTime, tableName);
        
        return sqlStatement;
    }
    
    public String updateTrigger() {
        String sqlStatement = 
                String.format("");
        
        return sqlStatement;
    }
    
    public String deleteTrigger(String triggerName) {
        String sqlStatement = 
                String.format("DROP TRIGGER %s;", triggerName);
        
        return sqlStatement;
    }
    
    ////////////////////////// USERS /////////////////////////////////////
    
    //Check the sqlStatement for the query
    public String showUsers_Schema() {
        String sqlStatement = 
                String.format("SELECT * FROM INFORMATION_SCHEMA.USERS;");
        
        return sqlStatement;
    }
    
    public String createUser(String username, String password) {
        String sqlStatement = 
                String.format("CREATE %s GUEST PASSWORD '%s';", 
                        username, password);
        
        return sqlStatement;
    }
    
    public String updateUserAdmin(String userName, bool adminRights) {
        String adminRightsString;
        if (adminRights)
            adminRightsString = "TRUE";
        else
            adminRightsString = "FALSE";

        String sqlStatement = 
                String.format("ALTER USER %s ADMIN %s;", username, adminRightsString);
        
        return sqlStatement;
    }

    public String updateUserRename(String username, String newUsername) {
        String sqlStatement = 
                String.format("ALTER USER %s RENAME TO %s;", username, newUsername);
        
        return sqlStatement;
    }

    public String updateUserPassword(String username, String password) {
        String sqlStatement = 
                String.format("ALTER USER %s SET PASSWORD \'%s\';", username, password);
        
        return sqlStatement;
    }
    
    public String deleteUser(String username) {
        String sqlStatement = 
                String.format("DROP USER %s;", username);
        
        return sqlStatement;
    }
    
    ////////////////////////// SCHEMA ////////////////////////////////////
    
    public String showSchema() {
        String sqlStatement = 
                String.format("show schemas;");
        
        return sqlStatement;
    }
    
    public String createSchema(String schemaName, String userName) {
        String sqlStatement = 
                String.format("CREATE SCHEMA %s AUTHORIZATION %s", schemaName, userName);
        
        return sqlStatement;
    }
    
    public String updateSchema(String schemaName, String newSchemaName) {
        String sqlStatement = 
                String.format("ALTER SCHEMA %s RENAME TO %s;", schemaName, newSchemaName);
        
        return sqlStatement;
    }
    
    public String deleteSchema() {
        String sqlStatement = 
                String.format("DROP SCHEMA %s;");
        
        return sqlStatement;
    }
    
    ////////////////////////// VIEWS /////////////////////////////////////
    
    public String showViews(String schemaName) {
        String sqlStatement = 
                String.format("SELECT * FROM %s.views;", schemaName);
        
        return sqlStatement;
    }
    
    public String createView(String viewName, String tableName) {
        String sqlStatement = 
                String.format("CREATE VIEW TEST_VIEW AS SELECT * FROM %s", 
                viewName, tableName);

                /* String sqlStatement = 
                String.format("CREATE VIEW TEST_VIEW AS SELECT * FROM TEST WHERE ID < 100"); */
        
        return sqlStatement;
    }
    
    public String updateView(String viewName) {
        String sqlStatement = 
                String.format("ALTER VIEW %s RECOMPILE;", viewName);
        
        return sqlStatement;
    }
    
    public String deleteView(String viewName) {
        String sqlStatement = 
                String.format("DROP VIEW %s;", viewName);
        
        return sqlStatement;
    }
    
    //////////////////////////////////////////////////////////////////////
    ////////////////// END OF STRING CREATION FUNCTIONS //////////////////
    //////////////////////////////////////////////////////////////////////
    
    
    
}
