package configuracion;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import servicio.ServicioEstudiante;


public class ApplicationContextProvider implements ApplicationContextAware {
	
	private static ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
            "/configuracion/application-context.xml");
  
	public void setApplicationContext(ApplicationContext applicationContext)
            throws BeansException {ApplicationContextProvider.applicationContext = applicationContext;
    }
  
    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }
    
     public static ServicioEstudiante getServicioEstudiante() {
   		return applicationContext.getBean(ServicioEstudiante.class);
   	}

}
