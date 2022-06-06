package com.gu.yanzhao.services;

import com.gu.yanzhao.models.Country;
import com.gu.yanzhao.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    
    @Autowired
    private CountryRepository countryRepository;
    
    // return list of countries
    public List<Country> getCountry() {
        return countryRepository.findAll();
    }
    
    // save new country
    public void save(Country country) {
        countryRepository.save(country);
    }
}
