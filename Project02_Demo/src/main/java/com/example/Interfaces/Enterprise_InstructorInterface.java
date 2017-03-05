package com.example.Interfaces;

import com.example.Model.EnterpriseInstructorEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Tran_Cao on 3/4/2017.
 */
@Repository
public interface Enterprise_InstructorInterface extends CrudRepository<EnterpriseInstructorEntity,Integer> {

}