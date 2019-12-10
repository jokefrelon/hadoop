package sourceCode;

public class person implements Comparable {
	private int age;
	private String name;

	public person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "person [age=" + age + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		person other = (person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	public int compareTo(Object osi) {
		person seao = (person) osi;
		if(this.age>seao.age) {
			return 1;
		}
		if(this.age<seao.age)
			return -1;
		return 0;
		
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if (this==obj) {
//			return true;
//		}
//			person se = (person) obj;
//			return this.name.equals(se.name)&&this.age==se.age;
//	}
}
