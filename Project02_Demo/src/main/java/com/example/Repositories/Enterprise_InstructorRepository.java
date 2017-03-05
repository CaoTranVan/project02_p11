package com.example.Repositories;

import com.example.Interfaces.Enterprise_InstructorInterface;
import com.example.Model.EnterpriseInstructorEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Tran_Cao on 3/4/2017.
 */
@Repository
public class Enterprise_InstructorRepository {

    @Autowired
    private Enterprise_InstructorInterface enterprise_instructorInterface;

    public Iterable<EnterpriseInstructorEntity> getAllEnterpriseInstructor(){
        return enterprise_instructorInterface.findAll();
    }

//    public void getEnterpriseInstructorByName(String name){
//        enterprise_instructorInterface.findByName(name);
//    }

    public void deleteEnterpriseInstructorById(int id){
        enterprise_instructorInterface.delete(id);
    }
    public void findEnterpriseInstructorById(int id){
        enterprise_instructorInterface.findOne(id);
    }
    public void updateEnterpriseInstructor( EnterpriseInstructorEntity enterpriseInstructorEntity){
       enterprise_instructorInterface.save(enterpriseInstructorEntity);

    }
}
