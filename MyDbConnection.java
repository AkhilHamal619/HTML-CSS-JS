import java.sql.*;

public class MyDbConnection 
{
    static Connection con = null;
    static Statement st = null;
    static ResultSet rs = null;
    public static void main(String[]args)
    {
        try
        {
            //load the driver
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql//localhost:3307/mydatabase", "root", "admin");

            if(con != null)
            {
                System.out.println("Connection Created");
            }

            st = con.createStatement();

            //Insertion of data
            String s = "Insert into userinformation(userNAme, age, address)VALUES ('Akhil', 22, 'Surkhet')"; 
            int n = st.executeUpdate(s);
            System.out.println("No of rows inserted:"+n);

            //Deletion of data
            s = "DELETE FROM userinformation WHERE userId=10";
            n = st.executeUpdate(s);
            System.out.println("No of rows deleted:"+n);

            //Selection of data
            s = "SELECT * from userinformation"; 
            rs = st.executeQuery(s);
            System.out.println("userID \t userName \t age\t adress");

            while(rs.next())
            {
                int uid = rs.getInt(1);
                String uname = rs.getString("userName"); 
                int uage = rs.getInt("age");
                String uaddr = rs.getString("address");
                System.out.println("" +uid + "\t" +uname + "\t" +uage + "\t"  +uaddr );
                 System.out.println();
            }
        }

        catch(Exception e)
        {
            System.out.println("Error in connection");
        }

        finally
        {
            try
            {
                rs.close();
                con.close();
                st.close();
            } catch(SQLException e)
            {
                e.printStackTrace();
            }
        }
    }    
}
