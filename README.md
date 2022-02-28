
##Pub/Sub demonstration project.

### Prerequisites
* Dev has [activeMQ artemis](https://activemq.apache.org/components/artemis/) on their local machine and running.

### Anatomy
* There are 3 main packages in this project to simulate 2 projects and 1 library that they could/do share.
1. `category_service_project` is a mocked service publisher of articles. We have a constant, that everything in the package shares; 3 publishers (1 per article), each
 article has 2 or more categories they belong to; and finally an AggregatingPublisher, which is used to invoke all 3 article publishers.   
2. `current_project` is the primary package for the listeners - which is also the core of our task and really the only code that belongs in this project. It is the
 NotificationService. It consists of a mocked UserDAO, to get the list of users with their categories; the listeners, which are the core of the app; the messengers, which
  represent text-message-like functionality; and finally, the services - the business logic.
3. `dependency_library` is a package to represent shared entities that could be abstracted into a separate library that is consumed by both the `category_service_project` and
 the `current_project`, or really any microservice the system incorporates. 

### The Idea
* We have 4 users, each user is a subscriber to 1 topic.
* There are 3 articles, they can be seen at `CategoryServiceConstants`:
1. log4j article belongs to all 4 categories.
2. trezor hack article belongs to 2 categories.
3. dao hack article belongs to 2 categories.
* This allows us to demonstrate that users subscribing to different topics are receiving the appropriate links when the Category Service publishes them. The only scenario we are
 lacking is the one where a user has more than one category and making sure the user gets articles if they subscribe to either of the categories. 
* There are no conventional unit tests or contract tests. The tests in this project, are used to demonstrate that the project works.
 
### Run local
* Running the 'unit test'-like classes should be sufficient: 
1. `DaoAttackArticleListenerTest` Will fire off the dao attack article and publish the article to 2 topics.
2. `Log4JListenerTest` Will fire off the log4j article and publish the article to all 4 topics.
3. `TrezorHackArticleListenerTest` Will fire off the trezor attack article and publish the article to 2 topics.
4. `SimulateFullRunTest` Will invoke all 3 article publishers.