package com.ple.DefTree;

import java.util.ArrayDeque;

class DefinitionQueue {
  private ArrayDeque<String> defs;

  DefinitionQueue() {
    defs = new ArrayDeque<String>();
  }

  private addDef(String defToAdd) {
    defs.add(defToAdd);
  }

  private removeDef(String defToRemove) {
    defs.removeFirstOccurrence(defToRemove);
  }

  private clearDefQueue() {
    //add user confirmation here someday
    defs.clear();
  }

}
