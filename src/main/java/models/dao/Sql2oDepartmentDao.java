package models.dao;

import models.Department;
import models.User;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.util.ArrayList;
import java.util.List;

public class Sql2oDepartmentDao implements DepartmentDao{
    private final Sql2o sql2o;
    public Sql2oDepartmentDao(Sql2o sql2o){
        this.sql2o = sql2o;
    }

    @Override
    public void add(Department department) {
        String sql = "INSERT INTO departments (name, description, size) VALUES (:name, :description, :size)";
        try(Connection con = sql2o.open()){
            int id = (int)con.createQuery(sql, true)
                    .bind(department)
                    .executeUpdate()
                    .getKey();
            department.setId(id);
        } catch (Sql2oException ex){
            System.out.println(ex);
        }
    }
    @Override
    public void addDepartmentToUser(Department department, User user) {
        String sql = "INSERT INTO departments_users (departmentid, userid) VALUES (:departmentId, :userId)";
        try(Connection con = sql2o.open()){
            con.createQuery(sql)
                    .addParameter("departmentId",department.getId())
                    .addParameter("userId",user.getId())
                    .executeUpdate();
        }catch (Sql2oException ex){
            System.out.println(ex);
        }

    }

}