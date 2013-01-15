package org.kercheval;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

/**
 * Base class for integration test cases.  It should execute tests inside of a
 * transaction that is rolled back on completion.
 */
@ContextConfiguration("/spring/spring.xml")
public abstract class TransactionalTestCase extends AbstractTransactionalJUnit4SpringContextTests { }
