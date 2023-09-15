package com.comento.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class restController {

    @GetMapping("sqlyearStatistic")
    @ResponseBody
    public Sqlyear SqlyearApi(@RequestParam("year") String year) {
        Sqlyear s = new Sqlyear();
        s.setTotCnt(3);
        s.setYear(year);
        s.setIs_success(true);
        return s;
    }
    static class Sqlyear {
        private int totCnt;
        private String year;
        private boolean is_success;

        public int getTotCnt() {
            return totCnt;
        }

        public void setTotCnt(int totCnt) {
            this.totCnt = totCnt;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public boolean isIs_success() {
            return is_success;
        }

        public void setIs_success(boolean is_success) {
            this.is_success = is_success;
        }
    }
}
