public class Phone extends Machine{

  private final String model;
  private Camera camera;
  private Photo[] photos;
  private int idx;





  public Phone(String model){
    
    this.model = model;
    this.camera = new Camera();
    this.photos = new Photo[5];
    this.idx = 0;
  }

  public String getModel(){
    return this.model;
  
  }

  public Camera getCamera() {
    return this.camera;
  }
  public boolean takePhoto(){
    if(this.idx >= photos.length){
      return false;
    }
   this.photos[idx] = this.camera.takePhoto();
    this.idx++;
    return true;
  }

  // public void setModel(String model){
  //   this.model = model;
  // }
  

  public static void main(String[] args) {
    Phone p1 = new Phone("IPHONE4");
    System.out.println(p1.getStatus());
  }
  
}
