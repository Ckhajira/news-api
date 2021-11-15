## News Portal API

This is a site that provides users with an API to create and view departments, department news and users  , 15/11/2021.

By Khajira Christopher

## Description
This is a news portal API that allows the user to create a department object, news and users. A user is able to see specific information
such as the Departments name, description and the number of employees in the department. One is able to see individual users, their details, i.e position in the company, their roles, which department(s) they are associated with.
The user is able to post some news relating to a department


## Behaviour Driven Development
## Post
1. Create a new department
     localhost:4567/departments/new
     Parameters: (name, description, size)
2. Create a new user
localhost:4567/users/new
Parameters: (name, title, role)
3. Add user to a department
localhost:4567/departments/:departmentId/user/:userId
Parameters: (departmentid, userid)
4. Create new departmental news
localhost:4567/departments/:departmentId/depnews/new
Parameters: (content, writtenBy, rating, departmentId)
##Get
1. View all Users
    localhost:4567/users
2. View all Departments 
localhost:4567/departments
3. View a department
localhost:4567/departments/:id
4. View all Department news
localhost:4567/departments/:id/depnews

## Setup/Installation Requirements

1. Clone the project using git clone https://github.com/Ckhajira/forest-service. If you are not able to clone it, you can download the files as a zip folder

2. Ensure that you have the complete file

3. Navigate to IntelliJ IDEA or your favorite IDEA and automatically install the required dependencies using Gradle

4. Build and run the project

## Database Commands
create.sql file is in the resources folder under db folder.
1. CREATE DATABASE apiorganisation;
2. \c apiorganisation;
3. CREATE TABLE IF NOT EXISTS departments (
   id SERIAL PRIMARY KEY,
   name VARCHAR,
   description VARCHAR,
   size VARCHAR
   );
4. CREATE TABLE IF NOT EXISTS users (
    id SERIAL PRIMARY KEY,
    name VARCHAR,
    title VARCHAR,
    role VARCHAR
   );
   
5.  CREATE TABLE IF NOT EXISTS depnews (
    id SERIAL PRIMARY KEY,
    content VARCHAR,
    writtenby VARCHAR,
    rating VARCHAR,
    departmentid INTEGER,
    createdat BIGINT
   );
   
6.  CREATE TABLE IF NOT EXISTS departments_users(
    id SERIAL PRIMARY KEY,
   userid INTEGER,
   departmentid INTEGER
   ); 
## Test Database Setup
1. CREATE DATABASE apiorganisation_test WITH TEMPLATE apiorganisation;

## Technologies Used
This project uses HTML and CSS for frontend.
Java for backend

## Dependencies
Gradle: distributionUrl=https\://services.gradle.org/distributions/gradle-5.2.1-all.zip

testImplementation 'org.junit.jupiter:junit-jupiter-api:5.3.1'

testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine:5.3.1'

## Support and contact details

If you have any issues or questions, you can get intouch with me through email: christopher.khajira@student.moringaschool.com. Please feel free to make any contributions to the code.

## License

MIT License
Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

Copyright (c) 2021 Khajira Christopher