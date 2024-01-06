package collectionSamples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
	//unordered (not index based)
		//duplicates not allowed
		//HashTable data structure
		//it will works on hashFunction which is allocate the key and hash code for objects 
		//as per key and object index will decide
		//as per that index objects are placed in hash table thats y it is unordered
HashSet<Integer>hs=new HashSet<Integer>();
hs.add(89);
hs.add(12);
hs.add(43);
hs.add(28);
hs.add(65);
//hs.add(null);//null will keeps in first position because its index should be zero
hs.add(89);//duplicates not allowed

System.out.println("Hashset is"+hs);
System.out.println("Contains 28"+hs.contains(28));
System.out.println("Size of hashset is"+hs.size());
System.out.println("is hashset empty:"+hs.isEmpty());
//**Iteration using for loop is not possible*********
System.out.println("*******Iteration using foreach********");
for(Integer i:hs)
{
	System.out.println(i);
	}
System.out.println("*******Iteration using iterator()******");
Iterator<Integer> ir = hs.iterator();
while(ir.hasNext())
{
	System.out.println(ir.next());
}
TreeSet<Integer> tr=new TreeSet<Integer>(hs);
System.out.println(tr);
System.out.println(tr.descendingSet());





	}

}
