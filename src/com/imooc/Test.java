package com.imooc;
import com.imooc.department.Department;
import com.imooc.job.Job;
import com.imooc.staff.Staff;

public class Test {
    public static void main(String[] args)
    {
        Department depart1 = new Department("D001","人事部");
        Department depart2 = new Department("D002","市场部");
        Job job1 = new Job("P001","经理");
        Job job2 = new Job("P002","助理");
        Job job3 = new Job("P003","职员");
        Staff[] staffs = new Staff[100];
        staffs[0] = new Staff("张铭","S001","男",29,depart1,job1);
        staffs[1] = new Staff("李艾爱","S002","女",21,depart1,job2);
        staffs[2] = new Staff("孙超","S003","男",29,depart1,job3);
        staffs[3] = new Staff("张美美","S004","女",26,depart2,job3);
        staffs[4] = new Staff("蓝迪","S005","男",37,depart2,job1);
        staffs[5] = new Staff("米莉","S006","女",24,depart2,job3);

        for(int i=0; i<6; i++)
        {
            System.out.print(staffs[i].outStaffMessage());
        }
        System.out.print(depart1.outDepartmentMessage());
        System.out.print(depart2.outDepartmentMessage());
    }

}
