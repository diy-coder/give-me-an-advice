package com.diycoder.smallaps.givemeanadvice.controller;

import com.diycoder.smallaps.givemeanadvice.model.Conselho;
import com.diycoder.smallaps.givemeanadvice.service.ConselhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("conselho")
public class ConselhoController extends BaseController<Conselho, Long> {

    @Autowired
    public ConselhoController(ConselhoService service) {
        super(service);
    }
}
