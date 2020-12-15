public class Rectangle
{
   private int length;
   private int breadth;
   public int getLength()
   {
       return length;
   }
   public void setLength(int length)
   {
       this.length = length;
   }
   public int getBreadth()
   {
       return breadth;
   }
   public void setBreadth(int breadth)
   {
       this.breadth = breadth;
   }
   public int getArea()
   {
       return this.length * this.breadth;
   }
}
public class Square extends Rectangle
{
   public void setBreadth(int breadth)
   {
       super.setBreadth(breadth);
       super.setLength(breadth);
   }
   public void setLength(int length)
   {
      super.setLength(length);
      super.setBreadth(length);
   }
}