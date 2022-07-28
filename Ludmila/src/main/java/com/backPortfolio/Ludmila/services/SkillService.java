/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backPortfolio.Ludmila.services;

import com.backPortfolio.Ludmila.models.Skill;
import com.backPortfolio.Ludmila.repository.SkillRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author LUDMILA
 */
@Service
@Transactional
public class SkillService {
    private final SkillRepo skillRepo;

    @Autowired
     public SkillService(SkillRepo skillRepo) {
        this.skillRepo = skillRepo;
    }
     
    public Skill addSkill(Skill skill){
        return skillRepo.save(skill);
    }
    public List<Skill> buscarSkills(){
        return skillRepo.findAll();
    }
    public Skill editarSkill(Skill skill){
        return skillRepo.save(skill);
    }
    public void borrarSkill(Long id){
        skillRepo.deleteById(id);
    }
}