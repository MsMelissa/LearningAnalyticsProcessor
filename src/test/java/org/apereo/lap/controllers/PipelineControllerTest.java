/**
 * Copyright 2013 Unicon (R) Licensed under the
 * Educational Community License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may
 * obtain a copy of the License at
 *
 * http://www.osedu.org/licenses/ECL-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package org.apereo.lap.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration({ "classpath:test-context.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class PipelineControllerTest {
	
	private static final Logger logger = LoggerFactory.getLogger(PipelineControllerTest.class);

	@Test
	public void testRootGet() {
		logger.warn("Test not yet implemented");
	}
	
	@Test
	public void testGetType() {
		logger.warn("Test not yet implemented");
	}
	
	@Test
	public void testGetTypeNotFound() {
		logger.warn("Test not yet implemented");
	}

	@Test
	public void testPostType() {
		logger.warn("Test not yet implemented");
	}

	@Test
	public void testPostTypeWithInvalidType() {
		logger.warn("Test not yet implemented");
	}

}
