import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Dao {


	//登録のやつ

	@SuppressWarnings("null")

	public static int insertNames(String key1,int key2,int key3,int key4,int key5,int key6){
		Connection con = null;
		PreparedStatement pstmt = null;
		 int rs = 0;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/Kakeibo?useSSL=false",
					"userXXX",
					"password");

		String sql = "insert into kakeibo values(?,?,?,?,?,?)";
		pstmt.setString(1,key1);
		pstmt.setInt(2,key2);
		pstmt.setInt(3, key3);
		pstmt.setInt(4,key4);
		pstmt.setInt(5, key5);
		pstmt.setInt(6,key6);

		rs = pstmt.executeUpdate(sql);

		} catch (SQLException e){
			System.out.println("DBアクセスに失敗しました。");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("jdbcが見つかりません。");
			e.printStackTrace();
		} finally {
			try {
				if( pstmt != null){
					pstmt.close();
				}
			} catch(SQLException e){
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}

			try {
				if( con != null){
					con.close();
				}
			} catch (SQLException e){
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}
		}

		return rs;
	}

}

