package com.thoughtworks.lean.quartz.job;

import com.thoughtworks.lean.quarz.job.APIJob;
import com.thoughtworks.lean.quarz.job.JobType;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by yongliuli on 7/27/16.
 */
public class JobTypeTest {
    @Test
    public void testJobType(){
        Class cls= JobType.valueOf("API").getJobClass();
        Assert.assertEquals(cls, APIJob.class);
    }
}
