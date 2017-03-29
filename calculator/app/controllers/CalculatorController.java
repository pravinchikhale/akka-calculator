package controllers;

import play.mvc.Controller;
import play.mvc.Result;

/**
 * Created by pravin on 3/29/17.
 */
public class CalculatorController extends Controller {


    public Result addition() {
        return ok("2+2=" + (2+2));
    }


}
