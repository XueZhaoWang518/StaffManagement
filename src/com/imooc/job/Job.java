package com.imooc.job;

public class Job {
    private String job;
    private String jobNum;
    public Job()
    {

    }
    public Job(String job, String jobNum)
    {
        this.setJob(job);
        this.setJobNum(jobNum);
    }

    public String getJob() {
        return job;
    }

    public String getJobNum() {
        return jobNum;
    }

    public void setJobNum(String jobNum) {
        this.jobNum = jobNum;
    }

    public void setJob(String job) {
        this.job = job;
    }
}

