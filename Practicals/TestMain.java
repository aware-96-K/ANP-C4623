package corejava;

public class TestMain {
	public static void main(String args[])
	{
// create object of child class
		Person pa = new Person("Pranita",21);
		Student st = new Student("Pranita",21,"1","BSC.IT");
		GraduateStudent gs = new GraduateStudent("Pranita",21,"1","BSC.IT","Ms.Anju Prajapati ","Angular java");
		System.out.println("Person:"+pa.getName()+" , "+pa.getAge()+"\n");
		System.out.println("Person:"+pa.getName()+" , "+pa.getAge()+"Id"+st.getStudentId()+"  , "+st.getMajor()+"\n");
		System.out.println("Person:"+pa.getName()+" , "+pa.getAge()+"Student"+st.getStudentId()+"  , "+st.getMajor()+"GraduateStudent"+gs.getAdvisor()+"  , "+gs.getThesisTopic());


			}

}
