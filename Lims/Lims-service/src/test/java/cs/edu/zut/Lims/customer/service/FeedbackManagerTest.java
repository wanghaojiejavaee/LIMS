package cs.edu.zut.Lims.customer.service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cs.edu.zut.Lims.customer.service.FeedbackManager;
import edu.zut.cs.javaee.dream.base.service.GenericManagerTestCase;
import edu.zut.cs.javaee.dream.customer.domain.FeedBack;

public class FeedbackManagerTest extends GenericManagerTestCase<Long, FeedBack, FeedbackManager> {

    FeedbackManager feedbackManager;

    public FeedbackManagerTest() {
        super(FeedBack.class);
    }

    @Autowired
    public void setFeedbackManager(FeedbackManager feedbackManager) {
        this.feedbackManager = feedbackManager;
        this.manager = this.feedbackManager;
    }

    @Test
    public void testFindByCustomer() {
        String customerId = "customerId_1";
        List<FeedBack> result = this.feedbackManager.findByCustomer(customerId);
        List<FeedBack> expected = new ArrayList<FeedBack>();
        for (int i = 0; i < 10; i++) {
            FeedBack feedback = new FeedBack();
            expected.add(feedback);
        }
        assertEquals(expected.size(), result.size());
    }

}
