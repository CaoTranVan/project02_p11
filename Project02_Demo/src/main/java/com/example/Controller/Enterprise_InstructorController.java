package com.example.Controller;

import com.example.Model.EnterpriseInstructorEntity;
import com.example.Repositories.Enterprise_InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


/**
 * Created by Tran_Cao on 2/26/2017.
 */

@RestController
@RequestMapping("students")
public class Enterprise_InstructorController {

    @Autowired
    private Enterprise_InstructorRepository enterpriseInstructorRepository;
    public Enterprise_InstructorController(){
        this.enterpriseInstructorRepository = new Enterprise_InstructorRepository();
    }
//
    @RequestMapping( method = RequestMethod.GET)
    public Iterable<EnterpriseInstructorEntity> getAllEnterpriseInstructor(){
        return enterpriseInstructorRepository.getAllEnterpriseInstructor();
    }

    @RequestMapping(value = "/update",method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateEnterpriseInstructor(@RequestBody EnterpriseInstructorEntity enterpriseInstructorEntity){
        enterpriseInstructorRepository.updateEnterpriseInstructor(enterpriseInstructorEntity);
    }

//    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
//    public void getEnterpiseInstructorByName(@PathVariable("name") String name){
//        enterpriseInstructorRepository.getEnterpriseInstructorByName(name);
//    }

//    @RequestMapping(value = "delete/{id}",method = RequestMethod.GET)
//    public void deleteEnterpiseInstructor(@PathVariable("id")int id){
//        enterprise_instructorInterface.delete(id);
//    }
//    @RequestMapping(method = RequestMethod.GET)
//    public MessageHandler.Partial abc() {
//        return new P "post/search";
//    }

//    @RequestMapping(method = RequestMethod.GET)
//    public String getAll(Model model) {
//        model.addAttribute("enterprise", enterprise_instructorInterface.findAll());
//        return "post/list";
//    }

//    @RequestMapping(value = "/{id}/delete", method = RequestMethod.GET)
//    public ModelAndView deleteStudent(@PathVariable int id) {
//        studentRepositories.delete(id);
//        return new ModelAndView("redirect:/students");
//    }
//
//    @RequestMapping(value = "createStudent", method = RequestMethod.GET)
//    public String createStudent() {
//        return "post/new";
//    }
//
//    @RequestMapping(value = "/create", method = RequestMethod.POST)
//    public ModelAndView createAccount(@RequestParam("user_name") String user_name, @RequestParam("name") String name,
//                                      @RequestParam("age") int age, @RequestParam("class_name") String class_name) {
//        studentRepositories.save(new Student(user_name, name, age, class_name));
//        return new ModelAndView("redirect:/students");
//
//    }
//
//    @RequestMapping(value = "/{id}/edit", method = RequestMethod.GET)
//    public String editStudent(@PathVariable int id, Model model) {
//
//        Student student = studentRepositories.findOne(id);
//        model.addAttribute("student", student);
//        return "post/edit";
//
//    }
//
//    @RequestMapping(value = "/update", method = RequestMethod.POST)
//    public ModelAndView update(@RequestParam("student_id") int id, @RequestParam("name") String name,
//                               @RequestParam("user_name") String user_name, @RequestParam("age") int age,
//                               @RequestParam("class_name") String class_name) {
//        Student student = studentRepositories.findOne(id);
//
//        student.setUser_name(user_name);
//        student.setName(name);
//        student.setAge(age);
//        student.setClass_name(class_name);
//        studentRepositories.save(student);
//
//        return new ModelAndView("redirect:/students");
//
//    }


}
