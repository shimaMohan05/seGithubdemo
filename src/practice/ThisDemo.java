package practice;

public class ThisDemo {
int a;
int b;
int c;
ThisDemo()
{System.out.println("Default constructor");
	}
ThisDemo(int i,int j)
{this();
	a=i;b=j;

	}
public ThisDemo add(int a,int b)
{this.a=a;
this.b=b;
c=a+b;
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println("***"+(5+3*2-1));
return this;

	}
public void show()
{
	this.add(a, b);}
	public static void main(String[] args) {
	ThisDemo td=new ThisDemo(12,13);
	td.show();

	}

}
