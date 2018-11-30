public class senior extends explainer {

  public senior( String name) {
    super(name);
  }

  public String toString() {
    String output = getName();
    if(getBreak())
    output += " A";
    else
    output += "B ";
    return output;
  }

}
