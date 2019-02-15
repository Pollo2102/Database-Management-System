package gestor.de.base.de.datos;

import java.awt.Window;
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.h2.Driver;

/**
 *
 * @author diego
 */
public class Database_Manager {
    
    private String currUsername, currPassword;
    Connection conn = null;
    PreparedStatement statement = null;
    ResultSet res = null;
    
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
    
    public String stringForTable(String fieldNames [], String type []) {
        String generatedString = "";
        
        for (int i = 0; i < fieldNames.length; i++) {
            if (i == fieldNames.length - 1) {
                generatedString += (fieldNames[i] + "(" + type[i] + ")");
            }else {
                generatedString += (fieldNames[i] + "(" + type[i] + "), ");
            }
        }
        
        return generatedString;
    }
    
    ////////////////////////// TABLES ////////////////////////////////////
    public String showTables() {
        String sqlStatement = 
                String.format("SELECT * FROM INFORMATION_SCHEMA.TABLES "
                        + "order by TABLE_SCHEMA desc;");
                        
        return sqlStatement;
    }
    
    public String createTables(String values) {
        String sqlStatement = 
                String.format("CREATE TABLE %s;",values);
        
        return sqlStatement;
    }
    
    public String updateTables(String tableName, String columnName, String newData) {
        String sqlStatement = 
                String.format("ALTER TABLE %s ALTER COLUMN %s %s;", 
                        tableName, columnName, newData);
        
        return sqlStatement;
    }
    
    public String deleteTable(String tableName) {
        String sqlStatement = 
                String.format("DROP TABLE %s;", tableName);
        
        return sqlStatement;
    }
    
    ////////////////////////// INDEXES ///////////////////////////////////
    
    public String showIndexes() {
        String sqlStatement =
                String.format("SELECT * FROM INFORMATION_SCHEMA.INDEXES");
        
        return sqlStatement;
    }
    
    public String createIndex(String indexName, String tableName, String columnName) {
        String sqlStatement = 
                String.format("CREATE INDEX %s ON %s(%s)", 
                indexName, tableName, columnName);
        
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
   
    
    ////////////////////////// TRIGGERS //////////////////////////////////
    
    public String showTriggers() {
        String sqlStatement = 
                String.format("SELECT * FROM INFORMATION_SCHEMA.TRIGGERS;");
        
        return sqlStatement;
    }
    
    public String createTriggers(String triggerName, String triggerTime, String triggerAction, String tableName) {
        String sqlStatement = 
                String.format("CREATE TRIGGER %s %s %s ON %s FOR EACH ROW CALL \'MyTrigger\'", triggerName, triggerTime, triggerAction, tableName);
        
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
                String.format("SELECT * FROM INFORMATION_SCHEMA.USERS a "
                        + "left join information_SCHEMA.SCHEMATA b "
                        + "on b.SCHEMA_OWNER = a.NAME;");
        
        return sqlStatement;
    }
    
    public String createUser(String username, String password) {
        String sqlStatement = 
                String.format("CREATE USER IF NOT EXISTS %s PASSWORD '%s';", 
                        username, password);
        
        return sqlStatement;
    }
    
    public String updateUserAdmin(String userName, boolean adminRights) {
        String adminRightsString;
        if (adminRights)
            adminRightsString = "TRUE";
        else
            adminRightsString = "FALSE";

        String sqlStatement = 
                String.format("ALTER USER %s ADMIN %s;", userName, adminRightsString);
        
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
    
    public String deleteSchema(String schemaName) {
        String sqlStatement = 
                String.format("DROP SCHEMA %s;", schemaName);
        
        return sqlStatement;
    }
    
    ////////////////////////// VIEWS /////////////////////////////////////
    
    public String showViews() {
        String sqlStatement = 
                String.format("SELECT * FROM INFORMATION_SCHEMA.VIEWS;");
        
        return sqlStatement;
    }
    
    public String createView(String viewName, String tableName) {
        String sqlStatement = 
                String.format("CREATE VIEW %s AS SELECT * FROM %s", 
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

    //////////////////////////// DDL /////////////////////////////////////
    
    
    /*
        Tables
        Indexes
        Triggers
        Users & Databases
        Views
    */
    
    public String showTableDDL(String tableName) {
        String sqlStatement = 
                String.format("SCRIPT SIMPLE TABLE %s;", tableName);
        
        return sqlStatement;
    }
    
    public String showIndexDDL() {
        String sqlStatement = 
                String.format("SCRIPT SIMPLE TABLE %;");
        
        return sqlStatement;
    }
    
    public String showTriggerDDL() {
        String sqlStatement = 
                String.format("SCRIPT SIMPLE TABLE %;");
        
        return sqlStatement;
    }
    
    public String showUsersAndDatabasesDDL(String schemaName) {
        String sqlStatement = 
                String.format("SCRIPT SIMPLE SCHEMA %s;", schemaName);
        
        return sqlStatement;
    }
    
    public String showViewsDDL() {
        String sqlStatement = 
                String.format("SCRIPT SIMPLE TABLE %;");
        
        return sqlStatement;
    }
    
    //////////////////////////////////////////////////////////////////////
    ////////////////// END OF STRING CREATION FUNCTIONS //////////////////
    //////////////////////////////////////////////////////////////////////
    
    public void populateComboBox(JComboBox CBox, String sqlStatement) throws Exception{
        statement = conn.prepareStatement(sqlStatement);
        res = statement.executeQuery();

        ArrayList<String> data = new ArrayList<String>();

        while (res.next()) { 
            data.add(res.getString(1));
        }

        // finally turn the array lists into arrays
        String[] dataArr = new String[data.size()];
        dataArr = data.toArray(dataArr);
        
        CBox.setModel(new DefaultComboBoxModel(dataArr));
        
        statement.close();
        res.close();        
    }
    
    public void populateTable(JTable mainTable, String sqlStatement) throws Exception {
        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        Vector columns = new Vector();
        statement = conn.prepareStatement(sqlStatement);
        res = statement.executeQuery();
        ResultSetMetaData metaData = res.getMetaData();

        // names of columns
        Vector<String> columnNames = new Vector<String>();
        int columnCount = metaData.getColumnCount();
        for (int column = 1; column <= columnCount; column++) {
            columnNames.add(metaData.getColumnName(column));
            columns.add(columnNames.get(column - 1));
        }
        // data of the table
        while (res.next()) {
            Vector<Object> vector = new Vector<Object>();
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                vector.add(res.getObject(columnIndex));
            }
            data.add(vector);
        }
        
        DefaultTableModel tableModel = new DefaultTableModel(data, columns);
        mainTable.setModel(tableModel);
        
        statement.close();
        res.close();
    } 
    
    public void executeSQLQuery(String sqlStatement) throws Exception {
        statement = conn.prepareStatement(sqlStatement);
        statement.executeQuery();
        statement.close();
    }
    
    public void executeSQL(String sqlStatement) throws Exception {
        statement = conn.prepareStatement(sqlStatement);
        statement.execute();
        statement.close();
    }
    
    
}
