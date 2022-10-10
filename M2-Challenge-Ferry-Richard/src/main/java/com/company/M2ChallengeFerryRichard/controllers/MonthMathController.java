package com.company.M2ChallengeFerryRichard.controllers;
import com.company.M2ChallengeFerryRichard.model.MathSolution;
import com.company.M2ChallengeFerryRichard.model.Month;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class MonthMathController {


    @RequestMapping(path = "/month/{monthNumber}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Month monthConverter(@PathVariable int monthNumber){

    }

    @RequestMapping(path ="/randomMonth" ,method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Month randomMonth(){

    }

    @RequestMapping(path = "/add", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public MathSolution addInt(@RequestBody MathSolution math){

    }

    @RequestMapping(path = "/subtract",method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public MathSolution subtractInt(@RequestBody MathSolution math){

    }

    @RequestMapping(path = "/multiply", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public MathSolution multiplyInt(@RequestBody MathSolution math){

    }

    @RequestMapping(path = "/divide", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public MathSolution divideInt(@RequestBody MathSolution math){

    }

}
