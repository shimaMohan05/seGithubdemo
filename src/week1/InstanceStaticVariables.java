package week1;

public class InstanceStaticVariables {
int count=1;
static int count1;
InstanceStaticVariables()
{System.out.println("count is: "+count);
System.out.println("count1 is :"+count1);
count++;
count1++;
	}
public static void m1()
{System.out.println("m1 is calling");
	}
	public static void main(String[] args) {
		
		InstanceStaticVariables i=new InstanceStaticVariables();
		InstanceStaticVariables i1=new InstanceStaticVariables();
		InstanceStaticVariables i2=new InstanceStaticVariables();
		InstanceStaticVariables i3=new InstanceStaticVariables();
		InstanceStaticVariables i4=new InstanceStaticVariables();
		System.out.println("From main" +i.count);
		System.out.println("From main"+i.count1);
		m1();
	}

}
