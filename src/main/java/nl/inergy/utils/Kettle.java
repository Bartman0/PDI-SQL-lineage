package nl.inergy.utils;

import org.pentaho.di.core.KettleClientEnvironment;
import org.pentaho.di.core.KettleEnvironment;
import org.pentaho.di.core.exception.KettleException;

public class Kettle {
    public static void initKettle() {
        try {
            KettleClientEnvironment.getInstance().setClient(KettleClientEnvironment.ClientType.OTHER);
            KettleEnvironment.init();
        } catch (KettleException e) {
            e.printStackTrace();
        }
    }
}
