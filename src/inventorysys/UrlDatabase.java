/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventorysys;

/**
 *
 * @author hi
 */
public class UrlDatabase {
    
    private int port ;
    private String serverName;
    private String user;
    private String password;
    private  String db;

    public UrlDatabase() {
        port = 8081;
        serverName = "LAPTOP-HA4J8OLV\\SQLEXPRESS01";
        db= "Inventory";
        user= "sa";
        password = "123456";
        
    }
    
    
    
    public  String getUrl(){
    return "jdbc:sqlserver://"+serverName+":"+port+";encrypt=true;trustServerCertificate=true;databaseName="+db+";user="+user+";password="+password+"";
    
    }
    
    
    
    
}
