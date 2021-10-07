package appPack;

import static appPack.convertMD5.fncMD5;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import props.CustomerVariable;
import props.OrdersVariable;
import props.Users;

public class dataBase {

    private final String driver = "org.sqlite.JDBC";
    private final String url = "jdbc:sqlite:db/waterSales.db";

    private Connection conn = null;
    private PreparedStatement pre = null;

    public static Users users = new Users();
    public static CustomerVariable customerVariable = new CustomerVariable();
    public static OrdersVariable ordersVariable = new OrdersVariable();

    public dataBase() {

        try {

            Class.forName(driver);

            conn = DriverManager.getConnection(url);

            System.out.println("Database Conncetion Success ");

        } catch (Exception e) {
            System.err.println("Database Conncetion Error: " + e);
        }

    }

    public boolean userLogin(String username, String password) {

        boolean status = false;

        try {

            String sql = "select * from users where username = ? and password = ?";
            pre = conn.prepareStatement(sql);
            pre.setString(1, username);
            pre.setString(2, fncMD5(password, 2));
            ResultSet rs = pre.executeQuery();
            status = rs.next();

            if (status) {
                users.setUid(rs.getInt("uid"));
                users.setEmail(rs.getString("email"));
                users.setUsername(rs.getString("username"));
            }

        } catch (Exception e) {
            System.err.println("User Login Error: " + e);
        }

        return status;

    }

    public int userInsert(String email, String password, String username) {

        int status = 0;

        try {

            String sql = "insert into users values (null, ?, ?, ?)";
            pre = conn.prepareStatement(sql);
            pre.setString(1, email);
            pre.setString(2, password);
            pre.setString(3, username);
            status = pre.executeUpdate();
            
        } catch (Exception e) {
            System.err.println("User Information Error: " + e);
            if( e.toString().contains("SQLITE_CONSTRAINT_UNIQUE")){
                status = -1;
            }
        }

        return status;
    }
    
    //User password update
    public int userPasswordUpdate(String password, int uid){
        
        int status = 0;
        
        try {
            
            String sql = "update users set password = ? where uid = ? ";
            pre = conn.prepareStatement(sql);
            pre.setString(1, fncMD5(password, 2));
            pre.setInt(2, uid);
            status = pre.executeUpdate();
            
        } catch (Exception e) {
            System.err.println("User Password Update Error: " + e);
        }
        
        return status;
        
    }
    
    //Add customer information to customer table.
    public int customerInsert(String name, String surname, String phone, String address){
        
        int status = 0;
        
        try {
            
            String sql = "insert into customer values (null, ?, ?, ?, ?)";
            pre = conn.prepareStatement(sql);
            pre.setString(1, name);
            pre.setString(2, surname);
            pre.setString(3, phone);
            pre.setString(4, address);
            status = pre.executeUpdate();
            
        } catch (Exception e) {
            System.err.println("Customer insert Error: " + e);
            if( e.toString().contains("SQLITE_CONSTRAINT_UNIQUE")){
                status = -1;
            }
        }
        
        return status;
        
    }
    
    //Add new order
    public int orderInsert(String name, String surname, String state, String address, int amount){
        
        int status = 0;
        
        try {
            
            String sql = "insert into orders values (null, ?, ?, ?, ?, ? )";
            pre = conn.prepareStatement(sql);
            pre.setString(1, name);
            pre.setString(2, surname);
            pre.setString(3, state);
            pre.setString(4, address);
            pre.setInt(5, amount);
            status = pre.executeUpdate();
            
        } catch (Exception e) {
            System.err.println("Order Insert Error: " + e);
        }
        
        return status;
        
    }
    
    //Order state update for road state
    public int orderUpdateRoad(String state, int oid){
        int status = 0;
        
        try {
            String sql = "update orders set state = ? where oid = ? ";
            pre = conn.prepareStatement(sql);
            pre.setString(1, state);
            pre.setInt(2, oid);
            status = pre.executeUpdate();
        } catch (Exception e) {
            System.err.println("Order Update Road Error: " + e);
        }
           
        return status;
    }
    
    //Order state update for delivered state
    public int orderUpdateDelivered(String state, int oid){
        
        int status = 0;
        
        try {
            
            String sql = "update orders set state = ? where oid = ?";
            pre = conn.prepareStatement(sql);
            pre.setString(1, state);
            pre.setInt(2, oid);
            status = pre.executeUpdate();
            
        } catch (Exception e) {
            System.err.println("Order Update Delivere Error: " + e);
        }
        
        return status;
        
    }
    
    //Delete customer information with cid.
    public int deleteCustomer(int cid){
        
        int status = 0;
        
        try {
            
            String sql = "delete from customer where cid = ?";
            pre = conn.prepareStatement(sql);
            pre.setInt(1, cid);
            status = pre.executeUpdate();
            
        } catch (Exception e) {
            System.err.println("Delete Customer Error: " + e);
        }
        
        return status;
        
    }
    
    //Delete order information with oid
    public int deleteOrder(int oid){
        
        int status = 0;
        
        try {
            
            String sql = "delete from orders where oid = ?";
            pre = conn.prepareStatement(sql);
            pre.setInt(1, oid);
            status = pre.executeUpdate();
            
        } catch (Exception e) {
            System.err.println("Delete Order Error: " + e);
        }
        
        return status;
        
    }
    
    //Delete all order information in order table.
    public int deleteAllOrder(){
        
        int status = 0;
        
        try {
            
            String sql = "delete from orders";
            pre = conn.prepareStatement(sql);
            status = pre.executeUpdate();
            
        } catch (Exception e) {
            System.err.println("Delete All Order Error: " + e);
        }
        
        return status;
        
    }
    
    public boolean selectCustomerInfo(int cid){
        
        boolean status = false;
        
        try {
            
            String sql = "select * from customer where cid = ?";
            pre = conn.prepareStatement(sql);
            pre.setInt(1, cid);
            ResultSet rs = pre.executeQuery();
            status = rs.next();

            if (status) {
                customerVariable.setCid(rs.getInt("cid"));
                customerVariable.setName(rs.getString("name"));
                customerVariable.setSurname(rs.getString("surname"));
                customerVariable.setAddress(rs.getString("address"));
                customerVariable.setPhone(rs.getString("phone"));
            }
            
        } catch (Exception e) {
            System.err.println("Select Customer Information Error: " + e);
        }
        
        return status;
        
    }
    
    public boolean selectOrdersInfo(int oid){
        
        boolean status = false;
        
        try {
            
            String sql = "select * from orders where oid = ?";
            pre = conn.prepareStatement(sql);
            pre.setInt(1, oid);
            ResultSet rs = pre.executeQuery();
            status = rs.next();
            
            if (status) {
                ordersVariable.setOid(rs.getInt("oid"));
                ordersVariable.setName(rs.getString("name"));
                ordersVariable.setSurname(rs.getString("surname"));
                ordersVariable.setAddress(rs.getString("address"));
                ordersVariable.setState(rs.getString("state"));
                ordersVariable.setAmount(rs.getInt("amount"));
            }
            
        } catch (Exception e) {
            System.err.println("Select Orders Information Error: " + e);
        }
        
        return status;
        
    }

    public DefaultTableModel allCustomer(){
        
        DefaultTableModel dtm = new DefaultTableModel();
        
        //Add column
        dtm.addColumn("Id");
        dtm.addColumn("Ad");
        dtm.addColumn("Soyad");
        dtm.addColumn("Telefon");
        dtm.addColumn("Adres");
        
        //Add rows
        try {
            
            String sql = "select * from customer";
            
            pre = conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while(rs.next()){
                int cid = rs.getInt("cid");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String phone = rs.getString("phone");
                String address = rs.getString("address");
                
                Object[] row = {cid, name, surname, phone, address};
                dtm.addRow(row);
            }
            
        } catch (Exception e) {
            System.err.println("All Customer Table Error: " + e);
        }
        
        return dtm;
        
    }
    
    public DefaultTableModel allOrder(){
        
        DefaultTableModel dtm = new DefaultTableModel();
        
        //Add column
        dtm.addColumn("Id");
        dtm.addColumn("Ad");
        dtm.addColumn("Soyad");
        dtm.addColumn("Durum");
        dtm.addColumn("Adres");
        dtm.addColumn("Tutar");
        
        //Add rows
        try {
            
            String sql = "select * from orders";
            
            pre = conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while(rs.next()){
                int oid = rs.getInt("oid");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String state = rs.getString("state");
                String address = rs.getString("address");
                int amount = rs.getInt("amount");
                
                Object[] row = {oid, name, surname, state, address, amount};
                dtm.addRow(row);
            }
            
        } catch (Exception e) {
            System.err.println("All Order Table Error: " + e);
        }
        
        return dtm;
        
        
    }
    
    public int customerUpdate(int cid, String name, String surname, String phone, String address){
        
        int status = 0;
        
        try {
            
            String sql = "update customer set name = ?, surname = ?, phone = ?, address = ? where cid = ?";
            pre = conn.prepareStatement(sql);
            pre.setString(1, name);
            pre.setString(2, surname);
            pre.setString(3, phone);
            pre.setString(4, address);
            pre.setInt(5, cid);
            status = pre.executeUpdate();
            
        } catch (Exception e) {
            System.err.println("Customer Update Error: " + e);
            if( e.toString().contains("SQLITE_CONSTRAINT_UNIQUE")){
                status = -1;
            }
        }
        
        return status;
        
    }
    
    public boolean findCustomer(String name, String surname){
        
        boolean status = false;

        try {

            String sql = "select * from customer where name = ? and surname = ?";
            pre = conn.prepareStatement(sql);
            pre.setString(1, name);
            pre.setString(2, surname);
            ResultSet rs = pre.executeQuery();
            status = rs.next();
            
        } catch (Exception e) {
            System.err.println("User Login Error: " + e);
        }

        return status;
        
    }
    
    public DefaultTableModel findChooseCustomer(String name, String surname){
        
        DefaultTableModel dtm = new DefaultTableModel();
        
        //Add column
        dtm.addColumn("Id");
        dtm.addColumn("Ad");
        dtm.addColumn("Soyad");
        dtm.addColumn("Telefon");
        dtm.addColumn("Adres");
        
        //Add rows
        try {
            
            String sql1 = "select * from customer where name = ? collate nocase";
            String sql2 = "select * from customer where surname = ? collate nocase";
            String sql3 = "select * from customer where name = ? collate nocase and surname = ? collate nocase";
            
            if(surname.equals("")){
                pre = conn.prepareStatement(sql1);
                pre.setString(1, name);
            }else if(name.equals("")){
                pre = conn.prepareStatement(sql2);
                pre.setString(1, surname);
            }else{
                pre = conn.prepareStatement(sql3);
                pre.setString(1, name);
                pre.setString(2, surname);
            }
            ResultSet rs = pre.executeQuery();
            while(rs.next()){
                int cid = rs.getInt("cid");
                String NAME = rs.getString("name");
                String SURNAME = rs.getString("surname");
                String phone = rs.getString("phone");
                String address = rs.getString("address");
                
                Object[] row = {cid, NAME, SURNAME, phone, address};
                dtm.addRow(row);
            }
            
        } catch (Exception e) {
            System.err.println("Find choose customer Error: " + e);
        }
        
        return dtm;
        
    }
    
    
    
    public void close() {

        try {

            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
            if (pre != null) {
                pre.close();
            }

        } catch (Exception e) {
            System.err.println("Database close Error: " + e);
        }

    }

}
