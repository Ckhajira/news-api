import static spark.Spark.*;

import com.google.gson.Gson;
import exceptions.ApiException;
import models.User;
import models.Department;
import models.Depnews;
import models.dao.Sql2oUserDao;
import models.dao.Sql2oDepartmentDao;
import models.dao.Sql2oDepnewsDao;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App{
    public static void main(String[] args){
        Sql2oUserDao userDao;
        Sql2oDepartmentDao departmentDao;
        Sql2oDepnewsDao depnewsDao;
        Connection conn;
        Gson gson = new Gson();

        staticFileLocation("/public");
        String connectionString ="jdbc:h2:~/APIorganisation.db;INIT=RUNSCRIPT from 'classpath:db/create.sql'";
        Sql2o sql2o = new Sql2o(connectionString, "","");

        departmentDao = new Sql2oDepartmentDao(sql2o);
        userDao = new Sql2oUserDao(sql2o);
        depnewsDao = new Sql2oDepnewsDao(sql2o);

    }
}