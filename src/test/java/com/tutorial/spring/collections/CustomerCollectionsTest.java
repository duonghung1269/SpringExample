package com.tutorial.spring.collections;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tutorial.spring.model.CustomerCollections;
import com.tutorial.spring.model.Staff;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:collections/collections.xml"})
public class CustomerCollectionsTest {

	@Autowired
	private CustomerCollections customerCollectionsBean;
	
	@Test
	public void testCollections() {
		assertThat(customerCollectionsBean).isNotNull();
		List<Object> lists = customerCollectionsBean.getLists();
		assertThat(lists).isNotEmpty();
		assertThat(lists.size()).isEqualTo(3);
		assertThat(lists.get(0)).isEqualTo("1");
		
		Object object1 = lists.get(1);
		assertThat(object1).isInstanceOf(Staff.class);
		Staff staff1 = (Staff) object1;
		assertThat(staff1.getName()).isEqualTo("staff1");
		
		Object object2 = lists.get(2);
		assertThat(object2).isInstanceOf(Staff.class);
		Staff staff2 = (Staff) object2;
		assertThat(staff2.getName()).isEqualTo("staffInList");
	}
}
