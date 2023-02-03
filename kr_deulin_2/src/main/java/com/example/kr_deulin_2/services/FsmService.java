package com.example.kr_deulin_2.services;


import com.example.kr_deulin_2.model.Enums.Services;
import com.example.kr_deulin_2.model.Fsm;
import com.example.kr_deulin_2.model.Enums.Event;
import org.springframework.stereotype.Service;

import java.util.List;

/*
    Сервис для какой-то бизнес логики
 */

@Service
public class FsmService implements FsmServiceInt {

    private static Fsm fsm;

    public FsmService() {
        fsm = getInstance();
    }

    @Override
    public void turnOn() throws RuntimeException {
        try {
            fsm.step(Event.turnOn);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void turnOff() throws RuntimeException {
        try {
            fsm.step(Event.turnOff);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void OnlyWater() throws RuntimeException {
        try {
            fsm.step(Event.go_pay,1);
            fsm.step(Event.TurnOnTheWater);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void waterAndFoam() throws RuntimeException {
        try {
            fsm.step(Event.go_pay,2);
            fsm.step(Event.TurnOnTheWater);
            fsm.step(Event.TurnOnTheFoam);
            fsm.step(Event.TurnOnTheWater);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void waterAndWax() throws RuntimeException {
        try {
            fsm.step(Event.go_pay,3);
            fsm.step(Event.TurnOnTheWater);
            fsm.step(Event.TurnOnWax);
            fsm.step(Event.TurnOnTheWater);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void waterFoamDrying() throws RuntimeException {
        try {
            fsm.step(Event.go_pay,4);
            fsm.step(Event.TurnOnTheWater);
            fsm.step(Event.TurnOnTheFoam);
            fsm.step(Event.TurnOnTheWater);
            fsm.step(Event.TurnOnDrying);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void waterFoamWax() throws RuntimeException {
        try {
            fsm.step(Event.go_pay,4);
            fsm.step(Event.TurnOnTheWater);
            fsm.step(Event.TurnOnTheFoam);
            fsm.step(Event.TurnOnTheWater);
            fsm.step(Event.TurnOnWax);
            fsm.step(Event.TurnOnTheWater);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Fsm getFsm() {
        return fsm;
    }

    private Fsm getInstance(){
        if(fsm == null){
            fsm = new Fsm();
            return fsm;
        }
        return fsm;
    }

    @Override
    public List<Services> getFsmService() {
        return fsm.getServicesList();
    }
}
