package com.Sample.grails.crud

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class FeedbackServiceSpec extends Specification {

    FeedbackService feedbackService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Feedback(...).save(flush: true, failOnError: true)
        //new Feedback(...).save(flush: true, failOnError: true)
        //Feedback feedback = new Feedback(...).save(flush: true, failOnError: true)
        //new Feedback(...).save(flush: true, failOnError: true)
        //new Feedback(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //feedback.id
    }

    void "test get"() {
        setupData()

        expect:
        feedbackService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Feedback> feedbackList = feedbackService.list(max: 2, offset: 2)

        then:
        feedbackList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        feedbackService.count() == 5
    }

    void "test delete"() {
        Long feedbackId = setupData()

        expect:
        feedbackService.count() == 5

        when:
        feedbackService.delete(feedbackId)
        sessionFactory.currentSession.flush()

        then:
        feedbackService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Feedback feedback = new Feedback()
        feedbackService.save(feedback)

        then:
        feedback.id != null
    }
}
