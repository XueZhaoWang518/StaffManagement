package com.imooc.staff;
import com.imooc.job.Job;
import com.imooc.department.Department;
public class Staff {
    private String staffName;
    private String staffNum;
    private String sex;
    private int age;
    private Department department;
    private Job job;



    //无参构造方法
    public Staff() {

    }
    public Staff(String staffName, String staffNum, String sex, int age, Department department, Job job)
    {
        this.setAge(age);
        this.setStaffName(staffName);
        this.setStaffNum(staffNum);
        this.setSex(sex);
        this.setDepartment(department);
        this.setJob(job);
        department.addStaffList(this);
    }

    public String outStaffMessage()
    {
        String output="=============================="
                + "\n"
                + "姓名：" + this.staffName + "\n"
                + "工号：" + this.staffNum + "\n"
                + "性别：" + this.sex + "\n"
                + "年龄：" + this.age + "\n"
                + "职务：" + this.department.getDepartmentName() + this.job.getJob() + "\n";

        return output;
    }

    public String getStaffName() {
        return staffName;
    }

    public String getStaffNum() {
        return staffNum;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public Department getDepartment() {
        return department;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }


    public void setAge(int age) {
        if(age>0) this.age = age;
    }

    public void setSex(String sex) {
        if(sex != "男" && sex != "女")
        {
            this.sex="女";
        }
        this.sex = sex;
    }

    public void setStaffNum(String staffNum) {
        if(staffNum != null) {
            this.staffNum = staffNum;
        }
    }

    public void setStaffName(String staffName) {
        if(staffName != null){
            this.staffName = staffName;
        }
    }
}