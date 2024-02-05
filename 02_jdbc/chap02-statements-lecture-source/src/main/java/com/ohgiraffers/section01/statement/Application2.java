package com.ohgiraffers.section01.statement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application2 {
    public static void main(String[] args) {

        Connection con = getConnection();
        Statement stmt = null;
        ResultSet rset = null;

        try {
            stmt = con.createStatement();

            /* 설명. 사용자로부터 조회하고자 하는 사원의 사번을 입력받음 */
            Scanner sc = new Scanner(System.in);
            System.out.print("사번을 입력하세요: ");
            int empId = sc.nextInt();

            /* 설명. 입력받은 사번을 활용한 쿼리 작성 */
            String query = "SELECT EMP_ID, EMP_NAME, FROM EMPLOYEE WHERE EMP_ID = '" + empId + "'";
            System.out.println("query = " + query);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
