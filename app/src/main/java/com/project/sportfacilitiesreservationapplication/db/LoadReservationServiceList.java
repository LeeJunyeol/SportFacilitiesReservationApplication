package com.project.sportfacilitiesreservationapplication.db;

import android.os.AsyncTask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * Created by jylee on 2017-04-24.
 */

public class LoadReservationServiceList extends AsyncTask<Integer, Integer, Integer> {
    /**
     * Override this method to perform a computation on a background thread. The
     * specified parameters are the parameters passed to {@link #execute}
     * by the caller of this task.
     * <p>
     * This method can call {@link #publishProgress} to publish updates
     * on the UI thread.
     *
     * @param params The parameters of the task.
     * @return A result, defined by the subclass of this task.
     * @see #onPreExecute()
     * @see #onPostExecute
     * @see #publishProgress
     */
    @Override
    protected Integer doInBackground(Integer... params) {
        return null;
    }
    /*
        @Override
        protected Integer doInBackground(User... users) {
            Connection conn = null;
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
                String url = new DBControl().url;
                Properties props = new Properties();
                props.setProperty("user", "postgres");
                props.setProperty("password", "admin123");

                Log.d("url", url);
                conn = DriverManager.getConnection(url, props);
                if (conn == null) // couldn't connect to server
                {
                    Log.d("connection : ", "null");
                    return -1;
                }
            } catch (Exception e){
                Log.d("PPJY", e.getLocalizedMessage());
                return -1;
            }

            int res = 0;
            PreparedStatement pstm = null;
            String sql = "insert into \"MATCHA_USER\"(\"ID\", \"EMAIL\", \"PW\", \"SEX\", \"BIRTH\") values (DEFAULT,?,?,?,?)";
            try {
                pstm = conn.prepareStatement(sql);
                pstm.setString(1, users[0].getEmail());
                pstm.setString(2, users[0].getPw());
                pstm.setBoolean(3, users[0].isSex());
                pstm.setDate(4, users[0].getBirth());

                res = pstm.executeUpdate();
                if (res > 0) {
                    Log.d("res", Integer.toString(res));
                    Commit(conn);
                    return 1;
                } else {
                    Log.d("res", Integer.toString(res));
                    return -1;
                }
            } catch (Exception e) {
                Log.d("PPJY", e.getLocalizedMessage());
                return -1;
            } finally {
                Close(pstm);
                Close(conn);
            }
        }

        @Override
        protected void onPostExecute(Integer result) {
            Log.d("PPJY", "onPostExecute");
            Context context = getApplicationContext();
            CharSequence text = "";
            int duration = Toast.LENGTH_SHORT;
            Toast toast;

            if (result > 0) {
                text = "회원가입이 완료 되었습니다.";
                Log.d("PPJY", "회원가입이 완료 되었습니다.");
                toast = Toast.makeText(context, text, duration);
                toast.show();
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
                finish();
            } else {
                text = "회원가입에 실패 하였습니다.";
                Log.d("PPJY", "회원가입에 실패 하였습니다.");
                toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        }

        public void Close(Connection con){
            if(con != null){
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        public void Close(Statement stmt){
            if(stmt != null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        public void Close(ResultSet rs){
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        public boolean isConnected(Connection con){
            boolean validConnection = true;
            try {
                if(con==null||con.isClosed())
                    validConnection = false;
            } catch (SQLException e) {
                validConnection = false;
                e.printStackTrace();
            }
            return validConnection;
        }
        public void Commit(Connection con){
            try {
                if(isConnected(con)){
                    con.commit();
                    Log.d("JdbcTemplate.Commit", "DB Successfully Committed!");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        public void Rollback(Connection con){
            try {
                if(isConnected(con)){
                    con.rollback();
                    Log.d("JdbcTemplate.rollback", "DB Successfully Rollbacked!");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
*/

}