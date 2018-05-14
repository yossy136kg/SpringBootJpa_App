package com.example;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.entity.TestEntity;
import com.example.repository.TestRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringBootJpaAppApplication.class)
public class TestRepositoryTests {

  @Autowired
  private TestRepository repo;

  @Test
  public void testOK() throws Exception {
    TestEntity e = new TestEntity();
    e.setName("TEST");
    e.setAge(30);
    e.setJob("IT");
    repo.save(e);

    List<TestEntity> savedEList = repo.findAll();
    System.out.println(savedEList);
    Assert.assertEquals(savedEList.size(), 1);
  }

}
