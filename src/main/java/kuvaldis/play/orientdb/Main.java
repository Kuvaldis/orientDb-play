package kuvaldis.play.orientdb;

import com.orientechnologies.orient.core.metadata.schema.OClass;
import com.orientechnologies.orient.object.db.OObjectDatabaseTx;
import com.tinkerpop.blueprints.impls.orient.OrientGraph;

public class Main {

    public static void main(String[] args) {
        OrientGraph graph = new OrientGraph("remote:localhost/test", "reader", "reader");
        graph.shutdown();
//        OClass oClass = graph.getVertexType("Person");
//        System.out.println(oClass);
    }
}
