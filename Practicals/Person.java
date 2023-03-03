package corejava;
//Create a Person class 
public class Person 
{
// create fields
	private String name;
	private int age;
//creating parameterized constructor
	public Person(String name, int age) 
	{
	this.name = name;
	this.age = age;
    }
// create getter and setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
//create child class of parent
class Student extends Person
{
// create fields
	private String studentId;
	private String major;
//creating parameterized constructor
	public Student(String name, int age, String studentId, String major) {
		super(name, age);
		this.studentId = studentId;
		this.major = major;
	}
//create getter and setter
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
}

class GraduateStudent extends Student
{
// create fields
	private String advisor;
	private String thesisTopic;
//creating parameterized constructor
	public GraduateStudent(String name, int age, String studentId, String major, String advisor, String thesisTopic) {
		super(name, age, studentId, major);
		this.advisor = advisor;
		this.thesisTopic = thesisTopic;
	}
//create getter and setter
	public String getAdvisor() {
		return advisor;
	}
	public void setAdvisor(String advisor) {
		this.advisor = advisor;
	}
	public String getThesisTopic() {
		return thesisTopic;
	}
	public void setThesisTopic(String thesisTopic) {
		this.thesisTopic = thesisTopic;
	}
}

