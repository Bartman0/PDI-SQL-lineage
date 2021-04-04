package nl.inergy;

import nl.inergy.atlas.Factory;
import org.apache.atlas.AtlasClientV2;
import org.apache.atlas.AtlasServiceException;

public class Lineage {
    public static void main(String[] args) {
        Factory factory = new Factory();
        AtlasClientV2 client = factory.getClient(new String[]{"http://localhost:21000"}, new String[]{"admin", "admin"});
        try {
            client.createAtlasTypeDefs(factory.getTypes());
        } catch (AtlasServiceException e) {
            e.printStackTrace();
        }
    }
}
