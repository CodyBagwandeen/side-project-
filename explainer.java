abstract class explainer {
  private String name;
  private String Station;
  private boolean aBreak;

  public explainer( String n) {
    name = n;
    aBreak = (((int)Math.random() * 10000 ) % 2 ) > 0;
  }

  public String getName() {
    return name;
  }

  public String getStation() {
    return Station;
  }

  public boolean getBreak() {
    return aBreak;
  }
}
