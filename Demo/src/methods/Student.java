package methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Lists> obj=new ArrayList<Lists>();
		
//		obj.add(new Lists(1,"mani",22,"high"));
//		obj.add(new Lists(2,"naveen",25,"clg"));
//		obj.add(new Lists(3,"vinny",20,"high"));
//		obj.add(new Lists(4,"vinny",27,"high"));
		Scanner objs=new Scanner(System.in);
	for(int i=0;i<=4;i++) {
////		
	System.out.println("Enter the id ");
		int id=objs.nextInt();
		System.out.println("Enter the name ");
		String name=objs.next();
		System.out.println("Enter the age ");
		//int useEnteredAge=objs.nextInt();
		int age=objs.nextInt();
		System.out.println("Enter the which school");
		String school=objs.next();
		
		
		obj.add(new Lists(id,name,age,school));
//		
		}
//		System.out.println(obj);
//		Iterator<Lists> itr= obj.iterator();
//		while(itr.hasNext()) {
//			Lists c=itr.next();
//			
//			System.out.println(c);
//			
//		}
//		
//	
		
		
		
		
		
//		System.out.println(obj);
		
//		for(Lists i:obj) {
//			System.out.println(i);
//			
//		}
		
//		obj.stream().
//		filter(p->p.age>22).
//		map(pm->pm.age).forEach(System.out::print);
//		Lists nav=obj.get(1);
//		System.out.println("Age:"+nav.getAge());
//		System.out.println("School:"+nav.getSchool());
		
		
		
//		Iterator<Lists> itr=obj.iterator();
//		while(itr.hasNext()) {
////			System.out.println(itr.hasNext());
//			Lists student=itr.next();
//		
//		if(student.getAge()>=25) {
//			
//			System.out.println("age="+student.getAge()+" name:"+student.getName()+" school:"+student.getSchool());
//			}
//			
////
//	}	
		
		List <Lists> studentssort=obj.stream().sorted((o1,o2)->(int)(o1.getAge() - o2.getAge())).collect(Collectors.toList());
		
		for(int i = 0; i<2; i++) {
		
			System.out.println(studentssort.get(i));
		}
		}
	
	

	}

