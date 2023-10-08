package app.main.Spring2;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {

	private int sid;
	private String sname;
	private Standard std;
	@Autowired
	public Student(Standard std) {
//		super();
//		this.sid = sid;
//		this.sname = sname;
		this.std = std;
	}
	public Student(int sid,String sname) {
//		super();
		this.sid = sid;
		this.sname = sname;
//		this.std = std;
	}
	
	
	
}
