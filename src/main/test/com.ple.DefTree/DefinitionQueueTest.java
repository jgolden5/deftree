package com.ple.DefTree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DefinitionQueueTest {

  public final DefinitionQueue dq = new DefinitionQueue();
  public final String testDef = "test - something used to ascertain that a certain property or behavior is working as expected.";
  public final String testDef2 = "ascertain - to verify whether or not something is true.";

  @Test
  void testAddDef() {
    dq.addDef(testDef);
    assertEquals(testDef, dq.getLastDef());
  }

  @Test
  void testGetLastDef() {
    dq.addDef(testDef2);
    assertEquals(testDef2, dq.getLastDef());
  }

}
