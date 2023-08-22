import java.util.*;
public class WordCount
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
{
String str;
System.out.print("Enter the string :-");
str=sc.nextLine();
char ch[]=str.toCharArray();
int letters=0, spaces=0,numbers=0, others=0;
for(int i=0; i<str.length(); i++)
{
if(Character.isLetter(ch[i]))
{
letters++;
}
else if(Character.isSpaceChar(ch[i]))
{
spaces++;
}
else if(Character.isDigit(ch[i]))
{
numbers++;
}
else
{
others++;
}
}
System.out.println("String are:-"+str);
System.out.println("letters are:-"+letters);
System.out.println("spaces are:-"+spaces);
System.out.println("numbers are:-"+numbers);
System.out.println("others are:-"+others);
}
}
}