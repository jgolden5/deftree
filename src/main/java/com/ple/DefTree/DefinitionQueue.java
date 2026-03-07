package com.ple.DefTree;

import java.util.ArrayDeque;

class DefinitionQueue {
  private ArrayDeque<String> defs;

  DefinitionQueue() {
    defs = new ArrayDeque<String>();
  }

  String getLastDef() {
    return defs.getLast();
  }

  void addDef(String defToAdd) {
    defs.add(defToAdd);
  }

  void removeDef(String defToRemove) {
    defs.removeFirstOccurrence(defToRemove);
  }

  void clearDefQueue() {
    //add user confirmation here someday
    defs.clear();
  }

}
