package empmgmt.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibConnect {
    private static SessionFactory sf;
     private static Session sess;
	public static Session getSession() {
		Configuration cfg=new Configuration();
		cfg.configure();
                sf=cfg.buildSessionFactory();
                sess=sf.openSession();
	    return sess;		
		
	}
        public static boolean closeSession(){
            if(sess!=null && sf!=null)
            {sess.close();
            sf.close();
            return true;}
            return false;
        }

}
