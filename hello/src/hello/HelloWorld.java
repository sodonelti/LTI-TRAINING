package hello;

public class DisplayData
{
   public static void main (String args[])
   {
	  int i=0; 
	  String[][] data= {
			  {"p101","nokia handset","some description","2000.0"},
			  {"p101","samsung handset","Description","2000.0"},
			 {"p101","sony ericson handset","again some description","2000.0"},
			 {"p101","lg handset","no description","2000.0"}};
			  
	  
int j=0;
int newlength=0;
int p=0,q=0,r=0,s=0;

                   			  String a;
                 			  a=data[i][j];
               			   newlength = a.length();
			 
			            if(newlength>p && i==0)
               			  {
			               	  p=newlength;
			               }
		               System.out.println(p);
      
	
}
}


