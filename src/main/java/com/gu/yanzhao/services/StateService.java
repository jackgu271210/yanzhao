package com.gu.yanzhao.services;

import com.gu.yanzhao.models.State;
import com.gu.yanzhao.repositories.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StateService {

    @Autowired
    private StateRepository stateRepository;

    // return list of states
    public List<State> getState() {
        return stateRepository.findAll();
    }

    // save new state
    public void save(State state) {
        stateRepository.save(state);
    }

    // get by id
    public Optional<State> findById(Integer id) {
        return stateRepository.findById(id);
    }

    public void delete(Integer id) {
        stateRepository.deleteById(id);
    }
}
