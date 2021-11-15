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