package hello;

public class DisplayData
{
   public static void main(String args[])
   {
	  int i=0; 
	  String[][] data= {
			  {"p101","nokia handset","some description","2000.0"},
			  {"p101","samsung handset","Description","2000.0"},
			 {"p101","sony ericson handset","again some description","2000.0"},
			 {"p101","lg handset","no description","2000.0"}};
			  }
	  

	  for(i=0;i<4;i++)
	  { 
		  int p,q,r,s;
		  for(i=0;j<4;j++)
		  { 
			  
			  string s;
			  s=String[i][j];
			  int length = s.length;
			 
			  if(length>p&&i=1)
			  {
				  p=length;
			  }
			  if(length>q&&i=2)
			  {
				  q=length;
			  }
			  if(length>r&&i=3)
			  {
				  r=length;
			  }
			  if(length>s&&i=4)
			  {
				  s=length;
			  }
      
		  }
System.out.println("+");
i=0;
j=0;
for(i=0;i<p;i++)
{
	System.out.println("-");
}
System.out.println("|");
for(i=0;i<q;i++)
{
	System.out.println("-");
}
System.out.println("|");
for(i=0;i<r;i++)
{
	System.out.println("-");
}
System.out.println("|");
for(i=0;i<s;i++)
{
	System.out.println("-");
}
System.out.println("|");
}
}
