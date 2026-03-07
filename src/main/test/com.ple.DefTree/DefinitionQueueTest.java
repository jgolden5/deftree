package com.ple.DefTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DefinitionQueueTest {
  @Test
  void testAddDef() {
    DefinitionQueue definitionQueue = new DefinitionQueue();
    String testDef = "test - something used to ascertain that a certain property or behavior is working as expected.";
    definitionQueue.addDef(testDef);
    assertEquals(testDef, definitionQueue.getLastDef());
  }
}
