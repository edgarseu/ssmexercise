package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.springframework.transaction.annotation.Transactional;
import org.testng.annotations.Test;
import smart.domain.Forum;
import smart.service.ForumService1;

@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@Rollback
@Transactional
public class TestForumService  extends AbstractTransactionalTestNGSpringContextTests {

	@Autowired
	public ForumService1 forumService1;
	@Test
	public  void testForumService() throws Throwable{
		Forum forum = new Forum();
		forum.setForumDesc("desc");
		forum.setForumName("name");
		forumService1.addForum(forum);
		
//		ForumService forumService = ctx.getBean(ForumService.class);
//		System.out.println("begin...........");
//		forumService.addTopic();
//		System.out.println("end!!!!!!!!!!!!!");
	}

}
