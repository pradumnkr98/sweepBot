package com.sweep.bot.controller;

import com.sweep.bot.model.objects.ResponseObject;
import com.sweep.bot.model.request.InvokeBidRequest;
import com.sweep.bot.model.request.InvokePlayerMoveRequest;
import com.sweep.bot.model.response.InvokeBidResponse;
import com.sweep.bot.model.response.InvokePlayerMoveResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;


@RestController
@RequestMapping("")
public class MasterController {


    @PostMapping("/invoke")
    ResponseObject<InvokePlayerMoveResponse> invokePlayerMove(@RequestBody InvokePlayerMoveRequest request){

        return null;
    }

    @PostMapping("/bid")
    ResponseObject<InvokeBidResponse> invokeBid(@RequestBody InvokeBidRequest request){
        return null;
    }

}
