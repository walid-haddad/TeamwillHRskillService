package com.tw.skillapp.service;

import com.tw.skillapp.service.dto.SkillDTO;

import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing {@link com.tw.skillapp.domain.Skill}.
 */
public interface SkillService {

    /**
     * Save a skill.
     *
     * @param skillDTO the entity to save.
     * @return the persisted entity.
     */
    SkillDTO save(SkillDTO skillDTO);

    /**
     * Get all the skills.
     *
     * @return the list of entities.
     */
    List<SkillDTO> findAll();


    /**
     * Get the "id" skill.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<SkillDTO> findOne(Long id);

    /**
     * Delete the "id" skill.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
