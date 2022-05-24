package com.diycoder.smallaps.givemeanadvice.service;

import com.diycoder.smallaps.givemeanadvice.model.Conselho;
import com.diycoder.smallaps.givemeanadvice.repository.ConselhoRepository;
import org.springframework.stereotype.Service;

@Service
public class ConselhoService extends BaseService<Conselho, Long> {

    public ConselhoService(ConselhoRepository repository) {
        super(repository);
    }
}
