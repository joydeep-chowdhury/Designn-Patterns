package builder;

public class Person 
       {
      

		private String name;
           private int ssn;
           private String address;
           private int age;
           private String sex;
           
           public Person(PersonBuilder personBuilder) {
       		this.ssn=personBuilder.ssn;
       		this.address=personBuilder.address;
       		this.name=personBuilder.name;
       		this.sex=personBuilder.sex;
       		this.age=personBuilder.age;
       	}
           
           
           public static class PersonBuilder
           {
        	   private final String name;
        	   private final int ssn;
        	   private final String address;
        	   private int age;
        	   private String sex;
        	   
        	   public PersonBuilder(String name,int ssn,String address)
        	   {
        		   this.name=name;
        		   this.ssn=ssn;
        		   this.address=address;
        	   }
        	   
        	   public PersonBuilder setAge(int age)
        	   {
        		   this.age=age;
        		   return this;
        	   }
        	   
        	   public PersonBuilder setSex(String sex)
        	   {
        		   this.sex=sex;
        		   return this;
        	   }
        	   
        	   public Person build()
        	   {
        		   return new Person(this);
        	   }
        	   
           }


		@Override
		public String toString() {
			return "Person [name=" + name + ", ssn=" + ssn + ", address=" + address + ", age=" + age + ", sex=" + sex
					+ "]";
		}
           
       }
