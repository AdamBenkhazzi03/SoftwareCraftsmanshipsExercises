package be.ucll.craftsmanship.DataProcessingPipeline;

public abstract class DataProcessor{

  public final void process(){
    load();  
    if (validateDate()) {
      transform();
      save();
    }else{
      System.err.println("Data validation failed. Processing aborted");
    }
  }

  abstract void load();
  abstract void transform();
  abstract void save();

  public boolean validateDate(){
    return true;
  }
}
