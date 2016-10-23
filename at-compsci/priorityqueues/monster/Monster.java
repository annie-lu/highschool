package monster;

public class Monster implements Comparable<Monster>

{
private int weight,height,age;

   public Monster() {} 

   public Monster(int ht, int wt, int a)  {
	   weight=wt;
	   height=ht;
	   age=a;
   } 

   public void setWeight(int wt){
	   weight=wt;
   } 

   public void setHeight( int ht) {
	   height=ht;
   } 

   public void setAge( int a) {
	   age=a;
   } 

   public Object clone(){
	   return new Monster(height,weight,age);
   } 

   public int getWeight() {
	   return weight;
   }  

   public int getHeight() {
	   return height;
   }  

   public int getAge()  {
	   return age;
   } 

   public boolean equals( Object o ){
	  return (((Monster) o).getWeight()==weight && ((Monster) o).getHeight()==height && ((Monster) o).getAge()==age);
   } 
    

   public int compareTo( Monster rhs ){
	   //first compare height, then weight, then age
	  if(this.equals(rhs))
		  return 1;
	  
	  if(height<rhs.getHeight()){
		  return -1;
	  }
	  else if(height==rhs.getHeight()){
		 if(weight<rhs.getWeight())
			 return -1;
		 else if(weight==rhs.getWeight()){
			 if(age<rhs.getAge())
				 return -1;
			 else
				 return 1;
		 }
		 else
			 return 1;
	  }
	  else 
		  return 1;
   } 

       

   public String toString( )   {
	   return height+" "+weight+" "+age;
	   
   } 

}
