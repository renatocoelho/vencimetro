package app.controllers;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ListaControllerTest {

	@Test public void fakeTest() {
		assertNotNull("put something real.", new ListaController(null, null, null));
 	}
}
