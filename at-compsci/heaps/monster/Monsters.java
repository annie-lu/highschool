package monster;

public class Monsters implements Comparable

{
private int weight,height,age;


   public Monsters(int ht, int wt, int a)  {
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
	  return (((Monsters) o).getWeight()==weight && ((Monsters) o).getHeight()==height && ((Monsters) o).getAge()==age);
   } 
    

   public int compareTo(Object rhs ){
	   //first compare height, then weight, then age
	   Monsters monster=(Monsters) rhs;
	  if(this.equals(monster))
		  return 1;
	  
	  if(height<monster.getHeight()){
		  return -1;
	  }
	  else if(height==monster.getHeight()){
		 if(weight<monster.getWeight())
			 return -1;
		 else if(weight==monster.getWeight()){
			 if(age<monster.getAge())
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
