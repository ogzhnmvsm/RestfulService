/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.restfulwebservice.application;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 *
 * @author Mevsim
 */

//Notasyon bazlı servlet tanımlama. Hiç web xml e bulaşmadan bu notation ile
//resteasy nin çalışma mantığını tanıtmış olduk. Web.xml ile uğraşmayacağız
//web servis projemizin root path i. 
//Web servise gelen istekler öncelikle gelecek
@ApplicationPath("/webservice")
public class ApplicationClass extends Application{
    
}
