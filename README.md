# principles
1.Single Responsibility Principle : In violating code the class COLLEGE is performing two tasks i.e Managing accounts and canteen. But in non-violating 
                                    code there are two seperate classes. They manage their own functionality. 
2.Open/Close Principle            : In violating code the class RECORD is used to display the information about any particular student entity. But when we try
                                    to add one more entity then we need to change the code which is violating the principle. So, I created an interface and made the 
                                    particular enitity classes to implememt that and thus now RECORD class resolves the issue by pointing to specifiuc entity by the
                                    interface referance.
3.Liskov Substitution Principle  :  In violating code the interface COLLEGE WEBSITE is implememting some methods. But the priviliges for changing or looking into the
                                    data from the website are different for HODs and Students. HOD can update the attendance, but student cannot. So, student cannot implement
                                    the interface. So, we have to take one more interface and we need to implement them according to the use. So, now Student cannot 
                                    modify attendance.
4.Interface segregation          :  In violating code there is a interface STUDENT MARKS which look after adding, modifying, calculating grades, displaying marks. The 
                                    student have to look at the marks but should not do other things. So, if we segregate the interfaces and create 3 interfaces one for 
                                    displaying marks, another for claculating grades and another for modifying marks then we can implement the interfaces for different users.
5.Dependancy Inversion           :  College is using a MySql database for keeping its records. So, it is connecting to Mysql. So, here it is depending on the database.
                                    In future if college wishes to shift to another database then there will be an issue. So, I have made the interface called database connection
                                    which is used to connect to the database.So, dependency is gone.
                                  
