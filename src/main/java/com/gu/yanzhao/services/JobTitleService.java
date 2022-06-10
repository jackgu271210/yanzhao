package com.gu.yanzhao.services;

import com.gu.yanzhao.models.JobTitle;
import com.gu.yanzhao.repositories.JobTitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobTitleService {

    @Autowired
    private JobTitleRepository jobTitleRepository;

    // return list of jobTitles
    public List<JobTitle> getJobTitle() {
        return jobTitleRepository.findAll();
    }

    // save new jobTitle
    public void save(JobTitle jobTitle) {
        jobTitleRepository.save(jobTitle);
    }

    // get by id
    public Optional<JobTitle> findById(Integer id) {
        return jobTitleRepository.findById(id);
    }

    public void delete(Integer id) {
        jobTitleRepository.deleteById(id);
    }
}
