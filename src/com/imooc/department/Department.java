package com.imooc.department;
import com.imooc.staff.Staff;

public class Department {
    private String DepartmentNum;
    private String DepartmentName;
    private Staff[] staffList;
    private int staffCount;

    public Department()
    {
    }

    public Department(String departmentName, String departmentNum)
    {
        this.setDepartmentName(departmentName);
        this.setDepartmentNum(departmentNum);
    }

    public Department(String departmentName, String departmentNum, Staff[] staffList, int staffCount)
    {
        this.setDepartmentName(departmentName);
        this.setDepartmentNum(departmentNum);
        this.setStaffCount(staffCount);
        this.setStaffList(staffList);
    }

    //增加员工
    public void addStaffList(Staff sta){
        int i=0;
        for(;i<this.getStaffList().length;i++)
        {
            if(this.getStaffList()[i]==null)
            {
                this.getStaffList()[i]=sta;
                this.setStaffCount(++i);
                break;
            }
        }
        return;
    }

    public String outDepartmentMessage()
    {
        String output = "=============================="
                + "\n"
                + this.getDepartmentName()
                + "总共有"
                + this.getStaffCount()
                + "名员工"
                + "\n";
        return output;
    }

    public String getDepartmentNum() {
        return DepartmentNum;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public Staff[] getStaffList() {
        if(this.staffList==null)
        {
            this.staffList = new Staff[200];
        }
        return staffList;
    }

    public int getStaffCount() {
        return staffCount;
    }

    public void setStaffCount(int staffCount) {
        this.staffCount = staffCount;
    }

    public void setStaffList(Staff[] staffList) {
        this.staffList = staffList;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }

    public void setDepartmentNum(String departmentNum) {
        DepartmentNum = departmentNum;
    }
}
