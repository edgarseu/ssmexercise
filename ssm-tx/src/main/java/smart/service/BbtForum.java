package smart.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import smart.dao.ForumDao;
import smart.dao.PostDao;
import smart.dao.TopicDao;
import smart.domain.Forum;
import smart.domain.Topic;

@Service
@Transactional
public class BbtForum {
    public ForumDao forumDao;

    public TopicDao topicDao;

    public PostDao postDao;

    public void addTopic(Topic topic) throws Exception {
        topicDao.addTopic(topic);
//		if(true) throw new PessimisticLockingFailureException("fail");
        postDao.addPost(topic.getPost());
    }


    @Transactional(readOnly = true)
    public Forum getForum(int forumId) {
        return forumDao.getForum(forumId);
    }

    public void updateForum(Forum forum) {
        forumDao.updateForum(forum);
    }

    public int getForumNum() {
        return forumDao.getForumNum();
    }

    @Autowired
    public void setForumDao(ForumDao forumDao) {
        this.forumDao = forumDao;
    }

    @Autowired
    public void setPostDao(PostDao postDao) {
        this.postDao = postDao;
    }

    @Autowired
    public void setTopicDao(TopicDao topicDao) {
        this.topicDao = topicDao;
    }
}
