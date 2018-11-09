import java.util.ArrayList;
public class node{
  public String name;
  public boolean x=false;
  public ArrayList<node> mom = new ArrayList<node>();
  public ArrayList<node> link = new ArrayList<node>();
  public node(String t){
    this.name = t;
  }
  public void add_bool(boolean x){
  this.x=x;
  }
  public void add_node(node next){
    this.link.add(next);
  }
  public void add_mom(node next){
    this.mom.add(next);
  }
  public boolean get_bool(){
  return x;
  }
  public boolean get_mom_and_bool(){
    int cout=0;
    for(int i =0;i<mom.size();i++){
      if(mom.get(i).get_bool()){
      cout++;
      }
    }
    return cout==mom.size();
  }
  public boolean get_mom_or_bool(){
    int cout=0;
    for(int i =0;i<mom.size();i++){
      if(mom.get(i).get_bool()){
      cout++;
      }
    }
    return cout>=1;
  }
  public String get_node(){
    return this.name;
  }
}
