package com.Sample.grails.crud

import grails.gorm.services.Service

@Service(Feedback)
interface FeedbackService {

    Feedback get(Serializable id)

    List<Feedback> list(Map args)

    Long count()

    void delete(Serializable id)

    Feedback save(Feedback feedback)

}