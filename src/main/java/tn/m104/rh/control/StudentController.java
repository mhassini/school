package tn.m104.rh.control;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import tn.m104.rh.entity.Student;
import tn.m104.rh.service.IStudentService;

@RestController
@AllArgsConstructor
@RequestMapping("/student")
@CrossOrigin(allowedHeaders="*",origins="*")
public class StudentController {

	private IStudentService studentService;


	@PostMapping("/registerStudent")
	public Student registerStudent(@RequestBody Student student) {

		return studentService.registerStudent(student);

	}

	@GetMapping("/listStudents")
	public List <Student> getStudents() {

		return studentService.getStudents();

	}
	
	@DeleteMapping("/deleteStudent")
	public void deleteStudent(@RequestParam Integer id) {

		 studentService.deleteStudent(id);

	}
	
	@PutMapping("/updateStudent")
	public Student updateStudent(@RequestBody Student student) {

		 return studentService.updateStudent(student);

	}

}
