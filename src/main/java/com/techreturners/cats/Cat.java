package com.techreturners.cats;

import javax.naming.InitialContext;
import java.io.*;

interface Cat {
  public abstract String eat(); // interface method
  public abstract boolean isAsleep();
  public abstract void goToSleep();
  public abstract void wakeUp();
  public abstract String getSetting();
  public abstract int getAverageHeight();
}

abstract class Cats implements Cat {
  private boolean asleep=false;
  private String type;
  private int averageHeight;

  public Cats(String type, int averageHeight)
  {
    this.type=type;
    this.averageHeight= averageHeight;
  }
  public boolean isAsleep() {
    return this.asleep;
  }

  public void goToSleep() {
    this.asleep = true;
  }

  public void wakeUp() {
    this.asleep = false;
  }

  public String getSetting() {
    return this.type;
  }

  public int getAverageHeight() {
    return this.averageHeight;
  }

}

class DomesticCat extends Cats {
  public DomesticCat() {
    super("domestic", 23);
  }

  public String eat() {
    return ("Purrrrrrr");
  }
}

class LionCat extends Cats {
  public LionCat() {
    super ("wild", 1100);

  }

  public String eat() {
    return ("Roar!!!!");
  }
}

class CheetahCat extends Cats {
  public CheetahCat() {
    super ("wild", 70);

  }
  public String eat() {
    return ("Zzzzzzz");
  }
}
