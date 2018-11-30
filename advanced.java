public class advanced extends explainer {

  public advanced( String name){
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
