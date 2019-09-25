package org.louzao.examples.kotlinboot

import org.junit.jupiter.api.*
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension

@ExtendWith(SpringExtension::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@DisplayName("Main tests to test Kotlin over JUnit 5")
class KotlinBootApplicationTests {


	@BeforeAll
	fun setup() {
		println(">> Setup")
	}


	@Test
	fun contextLoads() {
	}


	@Test()
	fun `This is a test to verify that true is equals to true`() {
		assert(true == true)
	}


	/* This check if ok
	@Test
	fun `This is a test that should fail on assertion`() {
		Assertions.assertEquals(true, false)
	}
	*/


	@AfterAll
	fun teardown() {
		println(">> Tear down")
	}


}
