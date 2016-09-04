package com.epam.jmp.spring.web;

import com.epam.jmp.spring.model.Client;
import com.epam.jmp.spring.service.ClientService;
import com.epam.jmp.spring.web.response.ExtDataResponse;
import com.epam.jmp.spring.web.response.ExtErrorResponse;
import com.epam.jmp.spring.web.response.ExtResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/api/v1/client", headers = "Accept=application/json;charset=utf-8")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public ExtResponse getClientList() {
        try {
            List<Client> clients = clientService.clientAll();
            return new ExtDataResponse(clients);
        } catch (Exception e) {
            return new ExtErrorResponse("Error read clients:" + e.getMessage(), e);
        }
    }
}
