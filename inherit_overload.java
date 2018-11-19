class practice{
    public static void main(String args[]){

        Baz Treehouse = new Baz();

        Treehouse=new Baz();
        Treehouse.doBar(3); //this one works
        Treehouse.doBar(3,4);  // why this one doesn't work?
    }
}

 class Bar {
      public void doBar(int x) {
          System.out.println("this is dobar"+ x);
          }
      }




    class Baz extends Bar {
      public void doBar(int x, double y) {
          System.out.println("x and y"+ x +" "+y);
      }
    }